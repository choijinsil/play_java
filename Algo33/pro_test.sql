
-- pro_test.sql(40���μ� ����)

	-- create or replace procedure del_dept
	-- create or replace procedure del_dept (delNo number)
	create or replace procedure del_dept (delNo number, tomorrow out varchar2)
	is
	
	begin
		tomorrow := sysdate;
		
		delete from dept4
		where deptno = delNo;
		dbms_output.put_line('# '||delNo||'�� �μ� �����Ͽ����ϴ�.');
		
		commit;
		-- select���� ���� tommorrow�� ������ ������ out�ǵ��� �����غ�����.
		
		select to_char(sysdate, 'day') into tomorrow
		from dual;
	end;
	/
	
	-- �� cmd â���� execute (exec) del_dept�� ��������� �Ѵ�.

	show errors; -- error�����ٰ��̴�.
	
	