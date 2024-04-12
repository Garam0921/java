<연습문제 모음>


4월 8일 (월)
-- <SQL 연습문제>
-- 1. 모든 사원의 이름과 부서번호를 조회하세요.
SELECT 이름, 부서번호 FROM 사원;

-- 2. 사원 중에서 직위가 과장인 사원들의 이름과 직위를 사원번호의 내림차순으로 조회하세요.
SELECT 이름, 직위 FROM 사원 WHERE 직위 = '과장'
ORDER BY 사원번호 DESC;

-- 3. 고객번호가 'CCOPI'인 고객의 고객회사명과 담당자명을 조회하세요.
SELECT 고객회사명, 담당자명 FROM 고객
WHERE 고객번호 = 'CCOPI';

-- 4. 주문일이 2021년 5월 1일 이후인 주문의 주문번호와 주문일을 최신 주문일 순으로 조회하세요.
SELECT 주문번호, 주문일 FROM 주문 WHERE 주문일 > '2021-05-01'
ORDER BY 주문일 DESC;

-- 5. 제품의 재고가 50개 미만인 제품들의 제품명과 재고를 조회하세요.
SELECT 제품명, 재고 FROM 제품 WHERE 재고 < 50;

-- 6. 사원 중에서 남성 사원의 이름과 성별을 조회하세요.
SELECT 이름, 성별 FROM 사원 WHERE 성별 = '남';

-- 7. 고객의 마일리지가 1000 이상인 고객들의 고객회사명과 마일리지를 조회하세요. 결과는 마일리지가 높은 순으로 정렬하세요.
SELECT 고객회사명, 마일리지 FROM 고객 WHERE 마일리지 >= 1000
ORDER BY 마일리지 DESC;

-- 8. 주문세부에서 제품번호가 77인 제품의 주문번호와 주문수량을 조회하세요.
SELECT 주문번호, 주문수량 FROM 주문세부 
WHERE 제품번호 = 77;

-- 9. 주문일이 2021년 1월 1일이전인 주문의 주문번호와 주문일을 조회하세요.
SELECT 주문번호, 주문일 FROM 주문
WHERE 주문일 < '2021-01-01';

-- 10. 사원의 성별이 여성이고, 직위가 '사원'인 사원들의 이름과 성별, 직위를 조회하세요.
SELECT 이름, 성별, 직위 FROM 사원
WHERE 성별 = '여' AND 직위 = '사원';

-- 11. 제품의 단가가 8000원 이상인 제품들 중에서 제품명 순으로 정렬하여 조회하세요.
SELECT 제품명 FROM 제품 WHERE 단가 >= 8000
ORDER BY 제품명 ASC;

-- 12. 주문세부에서 주문수량이 5개 이상인 주문의 주문번호와 주문수량을 조회하세요. 결과는 주문수량이 많은 순으로 정렬하세요.
SELECT 주문번호, 주문수량 FROM 주문세부 WHERE 주문수량 >= 5
ORDER BY 주문수량 DESC;

-- 13. 사원의 생일이 1990년 1월 1일 이후인 사원들의 이름과 생일을 조회하세요.
SELECT 이름, 생일 FROM 사원 
WHERE 생일 > '1990-01-01';

-- 14. 사원의 직위가 '사원'인 사람들 중에서 가장 최근에 입사한 사원의 이름과 입사일을 조회하세요.
SELECT 이름, 입사일 FROM 사원 WHERE 직위 = '사원'
ORDER BY 입사일 desc LIMIT 1;

-- 15. 고객들 중에서 도시가 '대전광역시'인 고객들의 고객번호와 고객회사명을 조회하세요.
SELECT 고객번호, 고객회사명 FROM 고객 WHERE 도시 = '대전광역시'
ORDER BY 고객번호;


4월 9일 (화)

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

/* 4. 주문테이블에서 요청일보다 발송일이 7일 이상 늦은 주문내역 */
select *,
	datediff(발송일, 요청일) as 지연일수
from 주문
where datediff(발송일, 요청일) >= 7; 


/*5. 고객테이블에서 아래와 같은 컬럼을 만드시오. 단, 도시구분과 마일리지구분
컬럼의 조건은 아래 조건을 따르시오
담당자명, 고객회사명, 도시, 도시구분, 마일리지, 마일리지구분
조건1(도시구분) : 특별시나 광역시는 '대도시', 나머지 도시는 '도시'로 표현
조건2(마일리지구분) : 마일리지가 100,000점 이상이면 'VVIP', 10,000점 
이상이면 'VIP', 나머지는 '일반고객'으로 표현 */
select 담당자명,
	고객회사명,
	도시,
	if(도시 like '%특별시%' or 도시 like '%광역시%',
		'대도시', '도시') as 도시구분,
	마일리지,
	case when 마일리지 >= 100000 then 'VVIP'
		when 마일리지 >= 10000 then 'VIP'
		else '일반고객'
	end as 마일리지구분
from 고객;


/* 6. 주문테이블에서 아래 컬럼을 만드시오
주문번호, 고객번호, 주문일, 주문년도, 주문분기, 주문월, 주문일, 주문요일, 
한글요일
조건1 : 한글요일은 case문을 이용하여 정수값을 '월요일'같은 한글 요일표시로 
표현 */
select 주문번호, 고객번호, 주문일,
	year(주문일) as 주문년도,
	quarter(주문일) as 주문분기,
	month(주문일) as 주문월,
	day(주문일) as 주문일,
	weekday(주문일) as 주문요일, 
	case weekday(주문일) when 0 then '월요일'
						when 1 then '화요일'
						when 2 then '수요일'
						when 3 then '목요일'
						when 4 then '금요일'
						when 5 then '토요일'
						when 6 then '일요일'
	end as 한글요일
from 주문


4월 11일 (목)

/* 1. 제품테이블과 주문세부테이블을 조인하여 제품명별로 주문수량합과
	주문금액합을 보이시오 */
select  제품명, 
	sum(주문수량) as 주문수량합, 
	sum(주문수량 * 주문세부.단가) as 주문금액합
from 제품
inner join 주문세부
on 제품.제품번호 = 주문세부.제품번호 
group by 제품명;

/* 2. 주문, 주문세부, 제품테이블을 조인하여 '아이스크림'제품에 대하여
	주문년도별 제품명별로 주문수량합을 보이시오 */
select year(주문일) as 주문년도, 
	제품명, 
	sum(주문수량) as 주문수량합
from 주문
inner join 주문세부 on 주문.주문번호 = 주문세부.주문번호 
inner join 제품 on 주문세부.제품번호 = 제품.제품번호 
where 제품명 like '%아이스크림%'
group by year(주문일), 제품명
order by 1, 2;

/* 3. 제품, 주문세부 테이블을 조인하여 제품명별로 주문수량합을 보이시오.
 * 	이때 주문이 한 번도 안된 제품에 대한 정보도 나타내시오 */
select 제품.제품번호, 제품명, sum(주문수량) as 주문수량합
from 주문세부 right join 제품
on 주문세부.제품번호 = 제품.제품번호
group by 제품명
order by 1;

/* 4. 고객회사중 마일리지등급이 'A'인 고객의 정보를 조회하시오. 
 * 	컬럼은 고객번호, 담당자명, 고객회사명, 등급명, 마일리지 */
select 고객번호, 담당자명, 고객회사명, 등급명, 마일리지
from 고객
inner join 마일리지등급
on 마일리지 between 하한마일리지 and 상한마일리지
where 등급명 = 'A';




4월 12일 (금)

/* 1. 제품테이블에 있는 제품 중 단가가 가장 높은 제품명 */
select 제품명	
from 제품
where 단가 = (select max(단가) from 제품);

/* 2. 제품 테이블에 있는 제품 중 단가가 가장 높은 제품의 주문수량합 */
select sum(주문수량) 수량합
from 주문세부
where 제품번호 = (select 제품번호 from 제품 
				where 단가 = (select max(단가) from 제품));
			
/* 3. '아이스크림'제품의 주문수량합 */
select sum(주문수량) 주문수량합
from 주문세부
where 제품번호 in (select 제품번호 from 제품
				where 제품명 like '%아이스크림%');
				
/* 4. '서울특별시'고객들에 대한 주문년도별 주문건수 */
select year(주문일) as 주문년도,
	count(*) as 주문건수
from 주문
where 고객번호 in (select 고객번호 from	고객
				where 도시 = '서울특별시')
group by year(주문일);	
