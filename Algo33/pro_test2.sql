
	-- 사원테이블(emp3)에서 특정 사원명을 (매개변수) 입력을 통해 삭제하는 프로시저를 작성하고 현재 사원수를 출력하시요.

	create or replace procedure del_ename (delName varchar2)
	is
	x number;
	ename emp3.ename%type;
	
	begin
		select ename into eenn from emp3;
		if (eenn in (delName))
		then delete from emp3 where ename = delName;
		select count(empno) into x from emp3;
		
		dbms_output.put_line('# '||delName||'님이 삭제되었고, 총 사원수는'||x||'명입니다!');

		commit;
		
		else
		select count(empno) into x from emp3;
		dbms_output.put_line('# '||delName||'님이 존재하지 않고, 총 사원수는'||x||'명입니다!');
		
		end if;
		
	end;
	/
	show errors; 
	-- error보여줄것이다.
	
	-- 꼭 cmd 창에서 execute (exec) del_dept를 실행해줘야 한다.
