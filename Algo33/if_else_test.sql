

-- ��� 7788�� SCOTT����̰� Ŀ�̼��� ���� �ʴ´�.
-- ��� 7654�� MARTIN����̰� Ŀ�̼��� 1400�޴´�.

declare
  -- ��������
  vempno number(4);
  vename emp.ename%type;
  vcomm emp.comm%type;
 
begin
  	
  --  PL/SQL������ ����,ġȯ �����ڴ� ����(:=)��!!
  select empno, ename, comm into vempno, vename, vcomm
  from emp where empno=7654;
	
  if (vcomm is not null)
  	 then dbms_output.put_line('���'||vempno||'��'||vename||'����̰� Ŀ�̼��� '||vcomm||'�޴´�.');
     else dbms_output.put_line('���'||vempno||'��'||vename||'����̰� Ŀ�̼��� ���� �ʽ��ϴ�.');
     
  end if;     
  
end;
/




