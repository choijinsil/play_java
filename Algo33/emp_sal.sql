
-- 사번 7788은 SCOTT 사원이고 연봉은 36000입니다.
-- 연봉계산은 급여 * 12+comm

declare
  -- 변수선언
  vempno emp.empno%type;
  vename emp.ename%type;
  vsal emp.sal%type;
  vcomm emp.comm%type;
 
  -- 연봉
  annsal number;
begin
  	
  --  PL/SQL내에서 대입,치환 연산자는 새우(:=)다!!
  select empno, ename, sal, comm into vempno, vename, vsal, vcomm
  from emp 
  where empno=7788;
	annsal := vsal*12+vcomm;
	-- scott사원의 경우: 3000*12+null --> null
	-- martin사원의 경우: 1250 * 12+1400 --> null
	
	if vcomm is null
		then annsal := vsal*12+0;
		else annsal :=vsal*12+vcomm;
	end if;
		
	dbms_output.put_line('사번' ||vempno||'은 '||vename||' 사원이고 연봉은 '||annsal||'입니다.');
  
end;
/




