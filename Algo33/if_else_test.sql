

-- 사번 7788은 SCOTT사원이고 커미션을 받지 않는다.
-- 사번 7654은 MARTIN사원이고 커미션을 1400받는다.

declare
  -- 변수선언
  vempno number(4);
  vename emp.ename%type;
  vcomm emp.comm%type;
 
begin
  	
  --  PL/SQL내에서 대입,치환 연산자는 새우(:=)다!!
  select empno, ename, comm into vempno, vename, vcomm
  from emp where empno=7654;
	
  if (vcomm is not null)
  	 then dbms_output.put_line('사번'||vempno||'는'||vename||'사원이고 커미션을 '||vcomm||'받는다.');
     else dbms_output.put_line('사번'||vempno||'는'||vename||'사원이고 커미션을 받지 않습니다.');
     
  end if;     
  
end;
/




