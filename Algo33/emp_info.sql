

-- 0531/emp_info.sql

declare
   -- ����ο��� ����� ���� ����!!
   -- ����)  ������  �ڷ���;
   vempno number(4);
   vename varchar2(15);
   vsal   emp.sal%type;

begin
   -- SQL�� (DQL, DML)	
   select empno, ename, sal into vempno, vename, vsal
   from emp
   where empno=7788;
  
   -- ��ȸ��(select) ���� into���� ����ؾ� �ϴ� ����?
   -- select���� �����ϰ� �� �� begin~end���� ��ȸ�� �����͸� �����Ϸ��� ������� ���� ��ƾ� ��
   -- select �÷���  into ������ !!   
   dbms_output.put_line('�����ȣ:' || vempno);-- ��ȸ�� �÷��� �ν�X, �����͸� ���� ������ �ν�O
   dbms_output.put_line('�����:' || vename || ', �޿�:' || vsal);
   
   
end;
/


