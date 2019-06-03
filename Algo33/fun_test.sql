
create or replace function call_bonus(vename emp.ename%type)
return number -- 숫자를 리턴할래요
is
	sal emp.sal%type;
	bonus number;
begin
	select sal into sal
	from emp
	where ename=vename;
	
	bonus := sal*2;
	return bonus; -- return데이터가 반드시 명시
end ;
/ 
-- variable bonus number; 변수선언
-- exec :bonus :=  call_bonus('SMITH'); function실행하는 방법