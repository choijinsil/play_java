 create or replace procedure dept_member(vdeptno emp.deptno%type)
  is
     -- 변수선언, 커서정의(커서변수 정의)
     CURSOR cur
     is
     select empno, ename, sal, hiredate
     from   emp
     where  deptno=vdeptno;
          
  begin
     /*
     OPEN cur;
     FETCH cur;
     CLOSE cur;
     */
  
     dbms_output.put_line('사원번호/사원명/급여/입사일');
     dbms_output.put_line('-----------------------------------');
     
     for vemp in cur   -- cur의 실행결과의 행 수만큼 반복!!
     --    <-----cur에 정의된 select 실행후 한 행 리턴
     loop
         dbms_output.put_line(vemp.empno||' / '||vemp.ename||' / '||
                        vemp.sal||' / '||vemp.hiredate);
     
     end loop;
     
  
  end;
  /