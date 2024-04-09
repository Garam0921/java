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


4월 9일 (화)
use testdb;

-- 산술연산자
select 23 + 5 as 더하기, 23 -5 , 23 * 5, 23 / 5 as '나누기(실수)', 23 div 5 as '나누기(정수)',
23 % 5, 23 mod 5; -- div는 정수형 나누기


-- 비교연산자
select 23 >= 5, 23 <= 5, 23 > 23, 23 < 23, 23 = 23,
23 != 23, 23 <> 23; -- 결과값이 1또는 0. 1=true, 2=false. != 와 <>는 같지 않다는 의미.


-- 논리연산자 (and, or, not)
select * from 고객
where 도시 = '부산광역시'
and 마일리지 < 1000;



-- 집합연산자 (Union, Union All)
select 고객번호, 담당자명, 마일리지, 도시 from 고객
where 도시 = '부산광역시'
union all
select 고객번호, 담당자명, 마일리지, 도시 from 고객
where 마일리지 < 1000 
order by 마일리지;
/*union 사용 주의점 
1) 첫번쨰와 두번째 select문의 컬럼 갯수 동일
2) 컬럼이 다르다면 데이터타입은 같아야함(하나는 문자, 하나는 숫자면 오류)*/
-- union all 은 중복 허용



-- IS NULL
-- empty value(빈값)와 null은 다른 개념임

-- null
select * from 고객
where 지역 is null;

-- empty value(빈값)
select * from 고객
where 지역 = '';


-- IN 연산자 (or연산자의 간편버전)
select 고객번호, 담당자명, 담당자직위 from 고객
where 담당자직위 = '영업 과장' or 담당자직위 = '마케팅 과장';

select 고객번호, 담당자명, 담당자직위 from 고객
where 담당자직위 in ('영업 과장', '마케팅 과장');


-- between and (범위를 표현, ~이상이고 ~이하)
select 담당자명, 마일리지 from 고객
where 마일리지 >= 100000
and 마일리지 <= 200000;

select 담당자명, 마일리지 from 고객
where 마일리지 between 100000 and 200000; -- 시작과 끝값을 포함


-- like 연산자(문자열의 특정 패턴을 필터링)
-- 특수문자 %, _ 사용
select * from 고객
where 도시 like '부산%'; -- %는 여러개의 문자가 존재할 수 있음을 의미

select * from 고객
where 도시 like '%광역%'; -- 


select * from 고객
where 고객번호 like '_C%'; 
-- '_' 은 정확히 한 개의 문자를 의미. 두번째자리가 'C'인 문자열을 의미함 

select * from 고객
where 고객번호 like '__C%'; -- 3번째 문자가 'C'


-- char_length 문자의 갯수
-- length 바이트수 (영문=1바이트, 한글=3바이트)
select char_length('hello'),
	length('hello'),
	char_length('안녕'),
	length ('안녕');
	

-- concat 문자열을 연결
-- concat_ws 문자열을 구분자와 함께 연결(ws=with separator)
select concat('dreams', 'come', 'ture'),
	concat_ws('-', '2023', '01', '29'); 
	

-- left 문자열의 왼쪽부터 몇개
-- right 문자열의 오른쪽부터 몇개
-- substr 몇번째부터 몇개
-- substr
select left('SQL 공부', 3),
	right('SQL 공부', 2),
	substr('SQL 공부', 3, 4),
	substr('SQL 공부', 5);


-- substing_index 구분자를 만날때까지 문자열을 잘라냄
-- 인덱스는 몇번쨰 구분자를 만날때까지 자를지를 결정
-- 인덱스가 음수면 꺼꾸로(오른쪽부터)
select substring_index('서울시 동작구 흑석동', ' ', 1); -- 서울시
select substring_index('서울시 동작구 흑석동', ' ', 2); -- 서울시 동작구
select substring_index( 
	substring_index('서울시 동작구 흑석동', ' ', 2), ' ', '-1'); -- 동작구
	
	
-- lpad 지정한 길이에서 문자열을 제외한 나머지를 특수문자로 왼쪽부터 채움
-- rpad 오른쪽 부터 채움
select lpad('sql', 10, '#'), 
	rpad('sql', 5, '#'); 


-- ltrim 왼쪽 공백 제거
-- rtrim 오른쪽 공백 제거
-- trim 양쪽 공백 제거
select ltrim('    sql'), 
	rtrim('sql    '), 
	trim('    sql    ');


-- field 문자열의 위치를 찾음
-- field(찾는문자열, 문자열1, 문자열2, 문자열3, .....)
-- find_in_set 문자열 리스트에서 지정한 문자열을 찾음
-- find_in_set(찾는 문자열, 문자열리스트)
select field('java', 'sql', 'java', 'javascript'); -- 2
select find_in_set('java', 'sql,java,javascript'); -- 2


-- locate 기준문자열에서 부분문자열의 위치를 찾음
-- locate(부분문자열, 기준문자열)
select locate('world', 'hello world.'); -- 7

-- elt 지정한 위치에 있는 문자열을 반환
select elt(2, 'sql', 'java', 'javascript'); -- java


-- repeat 문자열의 반복
select repeat('*', 5); -- *****

-- replace 문자열의 일부를 다른 문자열로 대체
-- replace(기준문자열, 바꿀 문자열, 바뀔 문자열)
select replace('010_1234_5678', '_','-'); -- 010-1234-5678


-- reverse 문자열 거꾸로 바꿈
select reverse('hello'); -- olleh


-- ceiling 올림
-- floor 내림
-- round 반올림, 두번째 매개변수 자리에 반올림 자릿수 표시가능
-- truncate 버림, 지정한 위치에서 버림
select ceiling(123.16),
	floor(123.56),
	round(123.56),
	round(123.56, 1), 
	truncate(123.56, 1); 


-- abs 절대값
-- sign 음수면 -1, 양수면 1
select abs(-120),
	sign(-120),
	sign(120);


-- power 제곱
-- sqrt 제곱근
-- rand 랜덤넘버, 매개변수는 seed의 의미. seed가 같으면 랜덤값이 동일함
select power(2, 3),
	sqrt(16),
	rand(),
	rand(100),
	rand(200); 




