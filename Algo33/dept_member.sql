 create or replace procedure dept_member(vdeptno emp.deptno%type)
  is
     -- ��������, Ŀ������(Ŀ������ ����)
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
  
     dbms_output.put_line('�����ȣ/�����/�޿�/�Ի���');
     dbms_output.put_line('-----------------------------------');
     
     for vemp in cur   -- cur�� �������� �� ����ŭ �ݺ�!!
     --    <-----cur�� ���ǵ� select ������ �� �� ����
     loop
         dbms_output.put_line(vemp.empno||' / '||vemp.ename||' / '||
                        vemp.sal||' / '||vemp.hiredate);
     
     end loop;
     
  
  end;
  /