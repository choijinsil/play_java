
-- pro_test.sql(40번부서 삭제)

	-- create or replace procedure del_dept
	-- create or replace procedure del_dept (delNo number)
	create or replace procedure del_dept (delNo number, tomorrow out varchar2)
	is
	
	begin
		tomorrow := sysdate;
		
		delete from dept4
		where deptno = delNo;
		dbms_output.put_line('# '||delNo||'번 부서 삭제하였습니다.');
		
		commit;
		-- select문을 통해 tommorrow에 오늘의 요일이 out되도록 변경해보세요.
		
		select to_char(sysdate, 'day') into tomorrow
		from dual;
	end;
	/
	
	-- 꼭 cmd 창에서 execute (exec) del_dept를 실행해줘야 한다.

	show errors; -- error보여줄것이다.
	
	