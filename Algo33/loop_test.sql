
-- 0603/loop_test.sql

declare

  i number := 0;
  j number := 3;
begin
  loop
     i := i+1;
     dbms_output.put_line(i);
     exit when i=10;
  end loop;
  
  dbms_output.put_line('======================');
  --------------ȭ�鿡 3 6 9�� ����Ͻÿ� ---------------
  loop
     dbms_output.put_line(j);--9���
     j := j+3; -- j=12
     
     if(j > 9)
       then exit;
     end if;
     
  end loop;
	
end;
/



