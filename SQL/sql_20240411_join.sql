-- join이란 두개 이상의 테이블을 연결하여 데이터를 검색하는 방법
/*
<join의 종류>
cross join
inner join
outer join
self join
*/
-- 크로스 조인 : 한쪽 테이블의 각 행마다 다른 쪽 테이블의 모든 행이 한번씩
-- 매칭되는 조인을 의미
select 부서.부서번호,
	부서명,
	이름,
	사원.부서번호
from 부서
cross join 사원
where 이름 = '배재용';

-- 내부조인 (inner join) : 각 테이블에서 조인 조건에 일치하는 데이터만 조인
-- '이소미' 사원의 사원번호,직위,부서번호,부서명
-- ANSI sql 조인 
select 사원번호,
	직위,
	부서.부서번호,
	부서명
from 사원
inner join 부서
on 사원.부서번호 = 부서.부서번호
where 이름 = '이소미';

-- Non-ANSI sql 조인 (위 방법과 결과는 같으나 문법이 다름)
select 사원번호,
	직위,
	부서.부서번호,
	부서명
from 사원, 부서
where 사원.부서번호 = 부서.부서번호 
and 이름 = '이소미';

-- 고객회사들이 주문한 주문건수를 많은 순서대로 보이시오
-- 컬럼은 고객번호, 담당자명, 고객회사명
select 고객.고객번호 ,
	담당자명,
	고객회사명,
	count(*) as 주문건수
from 고객
inner join 주문
on 고객.고객번호 = 주문.고객번호
group by 고객.고객번호 , 담당자명, 고객회사명
order by count(*) desc; 

-- 고객별로 주문금액 합을 보이되, 주문금액 합이 많은 순서대로
-- 컬럼은 고객번호, 담당자명, 고객회사명, 주문금액합
select 고객.고객번호 ,
	담당자명,
	고객회사명,
	sum(주문수량 * 단가) as 주문금액합 
from 고객
inner join 주문
on 고객.고객번호 = 주문.고객번호 
inner join 주문세부
on 주문.주문번호 = 주문세부.주문번호 
group by 고객.고객번호 , 담당자명, 고객회사명
order by 4 desc ;

-- non ANSI style
select 고객.고객번호 ,
	담당자명,
	고객회사명,
	sum(주문수량 * 단가) as 주문금액합 
from 고객, 주문, 주문세부
where 고객.고객번호 = 주문.고객번호 
and  주문.주문번호 = 주문세부.주문번호
group by 고객.고객번호 , 담당자명, 고객회사명
order by 4 desc ;
-- 할인율 반영 코드
-- sum(truncate(주문수량 * 단가 - (주문수량 * 단가 * 할인율),1)) as 주문금액합

-- 모든 사원의 사원번호, 이름, 부서명 표시
select 부서.부서명 ,
	사원번호,
	이름
from 
-- 