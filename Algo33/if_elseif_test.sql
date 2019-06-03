
-- 특정사원의 사원번호, 사원명, 소속된 부서명을 출력하시오
-- ex. 사번 7788은 SCOTT사원이고 RESEARCH부서에 근무합니다.

declare
  -- 변수선언
  vempno emp.empno%type;
  vename emp.ename%type;
  vdeptno emp.deptno%type;
  vdname dept.dname%type;
  vv varchar(22);
  
begin
  	vempno :=7788;
  --  PL/SQL내에서 대입,치환 연산자는 새우(:=)다!!
  select ename, deptno into vename, vdeptno
  from emp 
  where empno=vempno;
  
  if(vdeptno=10 ) then vdname :='ACCOUNTING';
  	elsif(vdeptno=20) then vdname :='RESEARCH';
  	elsif(vdeptno=30) then vdname :='SALES';
    else vdname :='OPERATIONS';
  end if;
  
  dbms_output.put_line('사번' ||vempno||'은 '||vename||' 사원이고 '||vdname||'부서에 근무합니다.');
  
--	case vdeptno
--		when 10 then vv:='ACCOUNTING'
--		when 20 then vv:='RESEARCH'
--		when 30 then vv:='SALES'
--		else vv:='OPERATIONS'
--		end
		
end;
/
