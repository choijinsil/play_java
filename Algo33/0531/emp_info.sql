

-- 0531/emp_info.sql

declare
	-- 실행부에서 사용할 변수 선언
	-- 형식) 변수명 자료형;
	vempno number(4);
	vename varchar2(15);
	vsal emp.sal%type;
	

begin
   -- SQL문 (DQL, DML)	
   select empno, ename, sal into vempno, vename, vsal
   from emp
   where empno=7788;
   -- 조회문(select) 사용시 into절을 사용해야 하는 이유?
   -- select 문을 실행하고 난 후 begin~end에서 조회한 데이터를 유지하려면 변수에 담아야 한다.
   -- select 컬럼명 into 
   
   dbms_output.put_line('사원번호:' || vempno ); -- 조회된 컬럼명 인식x, 데이터를 담은 변수명 인식 0
   dbms_output.put_line('사원명:' || vename || ', 급여:' || vsal);
end;
/


