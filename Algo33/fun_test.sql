
create or replace function call_bonus(vename emp.ename%type)
return number -- ���ڸ� �����ҷ���
is
	sal emp.sal%type;
	bonus number;
begin
	select sal into sal
	from emp
	where ename=vename;
	
	bonus := sal*2;
	return bonus; -- return�����Ͱ� �ݵ�� ���
end ;
/ 
-- variable bonus number; ��������
-- exec :bonus :=  call_bonus('SMITH'); function�����ϴ� ���