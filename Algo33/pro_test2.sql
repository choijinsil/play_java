
	-- ������̺�(emp3)���� Ư�� ������� (�Ű�����) �Է��� ���� �����ϴ� ���ν����� �ۼ��ϰ� ���� ������� ����Ͻÿ�.

	create or replace procedure del_ename (delName varchar2)
	is
	x number;
	ename emp3.ename%type;
	
	begin
		select ename into eenn from emp3;
		if (eenn in (delName))
		then delete from emp3 where ename = delName;
		select count(empno) into x from emp3;
		
		dbms_output.put_line('# '||delName||'���� �����Ǿ���, �� �������'||x||'���Դϴ�!');

		commit;
		
		else
		select count(empno) into x from emp3;
		dbms_output.put_line('# '||delName||'���� �������� �ʰ�, �� �������'||x||'���Դϴ�!');
		
		end if;
		
	end;
	/
	show errors; 
	-- error�����ٰ��̴�.
	
	-- �� cmd â���� execute (exec) del_dept�� ��������� �Ѵ�.
