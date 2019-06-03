-- 사원명, 보너스 비율을 넣어서 보너스 금액을 출력하시오.
create or replace function call_bonus2(vename emp.ename%type, percent number ) --percent에는 300등..
return number -- 숫자를 리턴할래요
is
	sal emp.sal%type;
	bonus number;
begin
	select sal into sal
	from emp
	where ename=vename;
	
	bonus := sal*(percent/100);
	return bonus; -- return데이터가 반드시 명시
end ;
/ 
-- variable bonus number; 변수선언
-- exec :bonus :=  call_bonus('SMITH'); function실행하는 방법