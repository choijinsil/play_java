
-- 0603/loop_test.sql

declare

begin
	
--	create table gugudan
--	(
--		i number(2),
--		j number,
--		result number
--	);
	
	for i in 3..5 -- i�� ���� 1���� 10����
	loop
  		dbms_output.put_line(i||'��');
  		
	  	for j in 1..9	
	  	loop
	  		dbms_output.put_line(i||'*'||j||'='||i*j);
	  		insert into gugudan(i,j,result)
	  					values(i, j, i*j);
	  	end loop;
  	
  	end loop;
end;
/



