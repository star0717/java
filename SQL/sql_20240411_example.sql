/*1. 고객테이블에서 고객회사명과 전화번호를 아래 규칙에 따르도록 변경하고 변경된 컬럼
의 이름은 고객회사명2, 전화번호2로 만드시오
고객회사명2의 조건 : 기존 고객회사명의 앞 2자리를 *로 변환
전화번호2의 조건 : (02)978-1984의 형태를 02-978-1984로 변환 */
select 고객회사명, 
	concat('**', substr(고객회사명, 3)) as 고객회사명2,
	전화번호,
	replace(substr(전화번호, 2), ')', '-') as 전화번호2
from 고객

/*2. 주문세부 테이블에서 아래 3개의 컬럼을 조건대로 만드시오
주문금액 : 주문수량 * 단가
할인금액 : 주문수량 * 단가 * 할인율
실주문금액 : 주문금액 - 할인금액 */
select *,
	주문수량 * 단가 as 주문금액,
	truncate(주문수량 * 단가 * 할인율, 1) as 할인금액,
	(주문수량 * 단가) - (truncate(주문수량 * 단가 * 할인율, 1)) as 실주문금액
from 주문세부

/* 3. 사원테이블에서 전체사원의 이름, 생일, 만나이(as 만나이), 입사일, 입사일수(as 입사일수), 
입사한지 500일후(as 입사500일후)의 날짜를 만드시오 */
select 이름,
	생일,
	timestampdiff(year, 생일, now()) as 만나이,
	입사일,
	timestampdiff(day, 입사일, now()) as 입사일수,
	adddate(입사일, 500) as 입사500일후
from 사원