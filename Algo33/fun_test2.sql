-- �����, ���ʽ� ������ �־ ���ʽ� �ݾ��� ����Ͻÿ�.
create or replace function call_bonus2(vename emp.ename%type, percent number ) --percent���� 300��..
return number -- ���ڸ� �����ҷ���
is
	sal emp.sal%type;
	bonus number;
begin
	select sal into sal
	from emp
	where ename=vename;
	
	bonus := sal*(percent/100);
	return bonus; -- return�����Ͱ� �ݵ�� ���
end ;
/ 
-- variable bonus number; ��������
-- exec :bonus :=  call_bonus('SMITH'); function�����ϴ� ���