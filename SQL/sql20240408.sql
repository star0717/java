/* SQL (Structured Query Langauge)
 * :구조화된 요청 언어
 * :Database에서 필요한 기능을 실행신키기 위한 명령어 모음
 * :형태는 간단한 프로그래밍 명령어와 유사함
 */
use testdb; -- use 명령어는 database를 선택한다는 뜻
select * from 고객; -- 고객테이블의 모든 데이터 요청

select 고객번호, 담당자명, 고객회사명, 마일리지
	from  고객; -- 특정 컬럼명을 명시하여 요청
	
select 고객번호, 담당자명, 고객회사명, 마일리지 as 포인트, 
	마일리지 * 1.1 as "10% 인상된 마일리지" 
	-- as는 별명, 인용부호는 별명에 특수문자가 있을 경우 사용
	-- 테이블 내의 컬럼 이외에 새로운 컬럼을 보여주는 용도이며 실제 저장은 안됨
	from 고객;
	
select 고객번호, 담당자명, 마일리지 from  고객
where 마일리지 >= 100000; 
-- 원하는 데이터를 필터링해서 가지고 오는 경우 사용
-- 순서 : select -> from -> where

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시' 
order by 마일리지 desc -- desc는 내림차순
limit 5; -- 읽어오는 데이터의 갯수 제한

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시' 
order by 마일리지 desc -- desc는 내림차순
limit 10, 10;  
/*내림차순이므로 상위 10명을 제외하고 그 이후 10명의 데이터를 읽는 방법임
**/

-- 고객들이 위치한 도시정보만 보도 싶은 경우
select 도시 from 고객;
select distinct 도시 from 고객; -- distinct는 중복제거





-- <SQL 연습문제>
-- 1. 모든 사원의 이름과 부서번호를 조회하세요.
select 이름, 부서번호 from  사원;

-- 2. 사원 중에서 직위가 과장인 사원들의 이름과 직위를 사원번호의 내림차순으로 조회하세요.
select 이름, 직위 from 사원
where 직위 = '과장'
order by 직위 desc;

-- 고객번호가 'CCOPI'인 고객의 고객회사명과 담당자명을 조회하세요.
select 고객회사명, 담당자명 from 고객
where 고객번호 = 'CCOPI';

-- 주문일이 2021년 5월 1일 이후인 주문의 주문번호와 주문일을 최신 주문일 순으로 조회하세요.
select 주문번호, 주문일 from 주문
where 주문일 >= '2021-05-01'
order by 주문번호, 주문일 desc ;

-- 제품의 재고가 50개 미만인 제품들의 제품명과 재고를 조회하세요.
select 제품명, 재고 from 제품
where 재고 <= 50;

-- 사원 중에서 남성 사원의 이름과 성별을 조회하세요.
select 이름, 성별 from 사원
where 성별 = '남';

-- 고객의 마일리지가 1000 이상인 고객들의 고객회사명과 마일리지를 조회하세요. 결과는 마일리지가 높은 순으로 정렬하세요.
select 고객회사명, 마일리지 from 고객
where 마일리지 >= 1000
order by 마일리지 desc;

select 주문번호, 주문수량 from 주문세부
where 제품번호 = 77;

select 주문번호, 주문일 from 주문
where 주문일 < '2021-01-01';

select 이름, 성별, 직위 from 사원
where 성별 = '여'
and 직위 = '사원';

select 제품명 from 제품
where 단가 >= 8000;

select 제품명,단가 from 제품
where 단가 between 1000 and 2000;

select 제품명,단가 from 제품
where 단가 in (1000,2000,3000);

select 제품명,단가 from 제품
where 단가 = 1000
or 단가 = 2000
or 단가 = 3000;

select 주문번호, 주문수량 from 주문세부
where 주문수량 >= 5
order by 주문수량 desc;

select 이름, 생일 from 사원
where 생일 > '1990-01-01';

select 이름, 입사일 from 사원
where 직위 = '사원'
order by 입사일 desc;

select 고객번호, 고객회사명 from 고객
where 도시 = '대전광역시';
