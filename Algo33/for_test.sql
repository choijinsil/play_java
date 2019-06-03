
-- 0603/loop_test.sql

declare

begin
	for i in 1..10 -- i의 값이 1부터 10까지
	loop
  		dbms_output.put_line('나는 sql이 좋아요.');
  	end loop;
  	
    dbms_output.put_line('====================');
  	
  	for j in reverse 1..10
  	loop
  		dbms_output.put_line(j);
  	end loop;
end;
/



