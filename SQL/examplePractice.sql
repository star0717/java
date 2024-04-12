use testdb;

-- 1. 모든 사원의 이름과 부서번호를 조회하세요.
select 이름, 부서번호
from 사원;

-- 2. 사원 중에서 직위가 과장인 사원들의 이름과 직위를 사원번호의 내림차순으로 조회하세요.
select 이름, 직위
from 사원
where 직위 = '과장'
order by 사원번호 desc;

-- 3. 고객번호가 'CCOPI'인 고객의 고객회사명과 담당자명을 조회하세요
select 고객회사명, 담당자명 from 고객
where 고객번호 = 'CCOPI';

-- 4. 주문일이 2021년 5월 1일 이후인 주문의 주문번호와 주문일을 최신 주문일 순으로 조회하세요.
select 주문번호, 주문일 from 주문
where 주문일 >= '2021.05.01'
order by 주문일 desc;

-- 5. 제품의 재고가 50개 미만인 제품들의 제품명과 재고를 조회하세요.
select 제품명, 재고 from 제품
where 재고 <= 50;

-- 6. 사원 중에서 남성 사원의 이름과 성별을 조회하세요.
select 이름, 성별 from 사원
where 성별 = '남';

-- 7. 고객의 마일리지가 1000 이상인 고객들의 고객회사명과 마일리지를 조회하세요.
-- 결과는 마일리지가 높은 순으로 정렬하세요.
select 고객회사명, 마일리지 from 고객
where 마일리지 >=1000
order by 마일리지 desc;

-- 8. 주문세부에서 제품번호가 77인 제품의 주문번호와 주문수량을 조회하세요.
select 주문번호, 주문수량  from 주문세부
where 제품번호 = 77;

-- 9. 주문일이 2021년 1월 1일이전인 주문의 주문번호와 주문일을 조회하세요.
select 주문번호, 주문일 from 주문
where 주문일 < '2021.01.01';

-- 10. 사원의 성별이 여성이고, 직위가 '사원'인 사원들의 이름과 성별, 직위를 조회하세요.
select 이름,성별,직위 from 사원
where 성별 = '여' and 직위 = '사원';

-- 11. 제품의 단가가 8000원 이상인 제품들 중에서 제품명 순으로 정렬하여 조회하세요.
select 제품명, 단가 from 제품
where 단가 >= 8000
order by 제품명;

-- 12. 주문세부에서 주문수량이 5개 이상인 주문의 주문번호와 주문수량을 조회하세요.
-- 결과는 주문수량이 많은 순으로 정렬하세요.
select 주문번호, 주문수량 from 주문세부
where 주문수량 >= 5
group by 주문번호
order by 주문수량 desc;

-- 13. 사원의 생일이 1990년 1월 1일 이후인 사원들의 이름과 생일을 조회하세요.
select 이름, 생일 from 사원
where 생일 >= '1990.01.01'


-- 14. 사원의 직위가 '사원'인 사람들 중에서 가장 최근에 입사한 사원의 이름과 입사일을 조회하세요.
select 이름, 입사일 from 사원
where 직위 = '사원'
order by 입사일 desc limit 1;

-- 15. 고객들 중에서 도시가 '대전광역시'인 고객들의 고객번호와 고객회사명을 조회하세요.
select 고객번호, 고객회사명 from 고객
where 도시 = '대전광역시'

/*1. 고객테이블에서 고객회사명과 전화번호를 아래 규칙에 따르도록 변경하고 변경된 컬럼
의 이름은 고객회사명2, 전화번호2로 만드시오
고객회사명2의 조건 : 기존 고객회사명의 앞 2자리를 *로 변환
전화번호2의 조건 : (02)978-1984의 형태를 02-978-1984로 변환 */
select 고객회사명,
	concat('**',substr(고객회사명, 3))  as 고객회사명2,
	전화번호,
	replace(substr(전화번호, 2), ')', '-') as 전화번호2
from 고객;


/*2. 주문세부 테이블에서 아래 3개의 컬럼을 조건대로 만드시오
주문금액 : 주문수량 * 단가
할인금액 : 주문수량 * 단가 * 할인율
실주문금액 : 주문금액 - 할인금액 */


/* 3. 사원테이블에서 전체사원의 이름, 생일, 만나이(as 만나이), 입사일, 입사일수(as 입사일수), 
입사한지 500일후(as 입사500일후)의 날짜를 만드시오 */

/* 4. 주문테이블에서 요청일보다 발송일이 7일 이상 늦은 주문내역 */

/*5. 고객테이블에서 아래와 같은 컬럼을 만드시오. 단, 도시구분과 마일리지구분
컬럼의 조건은 아래 조건을 따르시오
담당자명, 고객회사명, 도시, 도시구분, 마일리지, 마일리지구분
조건1(도시구분) : 특별시나 광역시는 '대도시', 나머지 도시는 '도시'로 표현
조건2(마일리지구분) : 마일리지가 100,000점 이상이면 'VVIP', 10,000점 
이상이면 'VIP', 나머지는 '일반고객'으로 표현 */

/* 6. 주문테이블에서 아래 컬럼을 만드시오
주문번호, 고객번호, 주문일, 주문년도, 주문분기, 주문월, 주문일, 주문요일, 
한글요일
조건1 : 한글요일은 case문을 이용하여 정수값을 '월요일'같은 한글 요일표시로 
표현 */

/* 1. 제품테이블과 주문세부테이블을 조인하여 제품명별로 주문수량합과
	주문금액합을 보이시오 */
select 제품명,
	sum(주문수량) as 주문수량합,
	sum(주문수량 * 주문세부.단가) as 주문금액합
from 제품
inner join 주문세부
on 제품.제품번호  = 주문세부.제품번호 
group by 제품명;

/* 2. 주문, 주문세부, 제품테이블을 조인하여 '아이스크림'제품에 대하여
	주문년도별 제품명별로 주문수량합을 보이시오 */


/* 3. 제품, 주문세부 테이블을 조인하여 제품명별로 주문수량합을 보이시오.
 * 	이때 주문이 한 번도 안된 제품에 대한 정보도 나타내시오 */

/* 4. 고객회사중 마일리지등급이 'A'인 고객의 정보를 조회하시오. 
 * 	컬럼은 고객번호, 담당자명, 고객회사명, 등급명, 마일리지 */