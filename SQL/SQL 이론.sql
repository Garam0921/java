SQL 이론

4월 8일 (월)
/* SQL (Structured Query Langauge) 
: 구조화된 요청 언어
: Database에서 필요한 기능을 실행시키기 위한 명령어 모음
: 형태는 간단한 프로그래밍 명령어와 유사함
*/
use testdb; -- use 명령어는 database를 선택한다는 뜻

select * from 고객; -- 고객테이블의 모든 데이터 요청

select 고객번호, 담당자명, 고객회사명, 마일리지	
	from 고객; -- 특정 컬럼명을 명시하여 요청
	
select 고객번호, 담당자명, 고객회사명, 마일리지 as 포인트,
	마일리지 * 1.1 as "10% 인상된 마일리지"
	from 고객;
-- as는 별명. 인용부호""는 별명에 특수문자가 있을 경우 사용
-- 테이블내의 컬럼이외에 새로운 컬럼을 보여줄 수 있다(실제 저장안됨)

select 고객번호, 담당자명, 마일리지 from 고객
where 마일리지 >= 100000;
-- 원하는 데이터를 필터링하여 가져오고 싶을때 where를 사용함
-- 순서가 중요. select from where 순서대로 사용함

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시'
order by 마일리지 desc;
-- 역시 키워드 사용 순서가 중요함. order by가 제일 뒤
-- order by는 디폴트가 오름차순이므로 내림차순은 desc를 사용해야함
/* '서울특별시'처럼 단따옴표가 기본. 쌍따옴표는 대소문자가 구별되어야하는 
경우에만 사용하는것이 권장됨 */

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시'
order by 마일리지 desc 
limit 10;  -- limit은 읽어오는 데이터의 갯수를 제한함

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시'
order by 마일리지 desc 
limit 10, 10;  
/*내림차순이므로 상위 10명을 제외하고 그 이후 10명의 데이터를 읽는 방법임
**/

-- 고객들이 위치한 도시정보만 보도 싶은 경우
select 도시 from 고객;
select distinct 도시 from 고객; -- distinct는 중복제거

=================================

4월 9일 (화)



=================================

4월 11일 (목)
use testdb;

<집계함수>


5개 함수 기억하기

join




-- 모든 사원의 사원번호, 이름, 부서명 표시
-- 주문번호 'H0255'의 제품명과 주문수량, 단가 표시
주문, 주문세부 조인


-- ANSI 스타일
select 고객.고객번호, 담당자명, 고객회사명, sum(단가*주문수량) as 주문금액합 from 고객
inner join 주문
on 고객.고객번호 = 주문.고객번호 
inner join 주문세부
on 주문.주문번호 = 주문세부.주문번호 
group by 고객.고객번호, 담당자명, 고객회사명
order by 주문금액합 desc; -- 4, sum(단가*주문수량), 주문금액합

이소미
배재용
유대현
최소민
안주훈
이현진
오영수
선하라
유가을
정수진


주문번호
제품명
주문수량
단가 



-- join이란 두개 이상의 테이블을 연결하여 데이터를 검색하는 방법
/*
<join의 종류
cross join
inner join (순서중요함). 
outer join
self join
*/


1. 제품테이블과 주문세부터에브를 조인하여 제품명별로 주문수량합과 주문금액합을 보이시오

2. 주문, 주문세부, 제품테이블을 조인하여 '아이스크림' 제품에 대하여
group by year(주문일), 제품명

3. 제품, 주문세부 테이블을 조인하여 제품명별로 주문수량합을 보이시오. 이때 주문이 한 번도 안된 제품에 대한 정보도 나타내시오

4. 고객회사중 마일리지등급이 'A'인 고객의 정보를 조회하시오. 컬럼은 고객번호, 담당자명, 고객회사명, 등급명, 마일리지
 

 
서브쿼리

<서브쿼리 (SubQuery)>
sql문 내부에서 사용하녀 select문을 의미함
장점: 복잡한 데이터추출 및 조작작업에 유용하며 유연성과 기능확장에 도움이 됨
단점: 지나치게 복잡한 서브쿼리를 사용하면 성능을 저하시킬 수 있음 



















