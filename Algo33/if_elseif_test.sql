
-- Ư������� �����ȣ, �����, �Ҽӵ� �μ����� ����Ͻÿ�
-- ex. ��� 7788�� SCOTT����̰� RESEARCH�μ��� �ٹ��մϴ�.

declare
  -- ��������
  vempno emp.empno%type;
  vename emp.ename%type;
  vdeptno emp.deptno%type;
  vdname dept.dname%type;
  vv varchar(22);
  
begin
  	vempno :=7788;
  --  PL/SQL������ ����,ġȯ �����ڴ� ����(:=)��!!
  select ename, deptno into vename, vdeptno
  from emp 
  where empno=vempno;
  
  if(vdeptno=10 ) then vdname :='ACCOUNTING';
  	elsif(vdeptno=20) then vdname :='RESEARCH';
  	elsif(vdeptno=30) then vdname :='SALES';
    else vdname :='OPERATIONS';
  end if;
  
  dbms_output.put_line('���' ||vempno||'�� '||vename||' ����̰� '||vdname||'�μ��� �ٹ��մϴ�.');
  
--	case vdeptno
--		when 10 then vv:='ACCOUNTING'
--		when 20 then vv:='RESEARCH'
--		when 30 then vv:='SALES'
--		else vv:='OPERATIONS'
--		end
		
end;
/
