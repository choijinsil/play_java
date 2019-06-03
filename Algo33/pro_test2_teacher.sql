-- 0603/pro_test2.sql


create or replace procedure del_ename2(delEname varchar2)
is
 -- 변수선언
   total number;
   cnt   number;
begin
	
   --사원이름 존재 유(1)무(0) 조회
   select count(ename) into cnt
   from emp3
   where ename=delEname;
	
   --if cnt=0
   if cnt>0
     then /*존재한다면*/
        delete from emp3
        where ename= delEname;	
   
        commit;
   
        select count(*) into total
        from emp3;
   
        dbms_output.put_line('#'||delEname||'사원이 삭제되었고 총 사원수는 '||
                  total||'명 입니다!!');
     else
        select count(*) into total
        from emp3;
   
        dbms_output.put_line('#'||delEname||'사원은 존재하지않고 총 사원수는 '||
                  total||'명 입니다!!');
   end if;
   
   /*
   delete from emp3
   where ename= delEname;	
   
   commit;
   
   select count(*) into total
   from emp3;
   
   dbms_output.put_line('#'||delEname||'사원이 삭제되었고 총 사원수는 '||
                  total||'명 입니다!!');
   */
end;
/

