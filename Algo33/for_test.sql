
-- 0603/loop_test.sql

declare

begin
	for i in 1..10 -- i�� ���� 1���� 10����
	loop
  		dbms_output.put_line('���� sql�� ���ƿ�.');
  	end loop;
  	
    dbms_output.put_line('====================');
  	
  	for j in reverse 1..10
  	loop
  		dbms_output.put_line(j);
  	end loop;
end;
/



