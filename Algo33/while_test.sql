
-- 0603/loop_test.sql

declare

	i number :=1;
	sum1 number :=0;

begin
	while i <= 10
	loop
	sum1 := sum1+i;
	i :=i+1;
	end loop;
	dbms_output.put_line('SUM='||sum1);
end;
/



