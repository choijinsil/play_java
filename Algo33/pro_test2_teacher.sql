-- 0603/pro_test2.sql


create or replace procedure del_ename2(delEname varchar2)
is
 -- ��������
   total number;
   cnt   number;
begin
	
   --����̸� ���� ��(1)��(0) ��ȸ
   select count(ename) into cnt
   from emp3
   where ename=delEname;
	
   --if cnt=0
   if cnt>0
     then /*�����Ѵٸ�*/
        delete from emp3
        where ename= delEname;	
   
        commit;
   
        select count(*) into total
        from emp3;
   
        dbms_output.put_line('#'||delEname||'����� �����Ǿ��� �� ������� '||
                  total||'�� �Դϴ�!!');
     else
        select count(*) into total
        from emp3;
   
        dbms_output.put_line('#'||delEname||'����� ���������ʰ� �� ������� '||
                  total||'�� �Դϴ�!!');
   end if;
   
   /*
   delete from emp3
   where ename= delEname;	
   
   commit;
   
   select count(*) into total
   from emp3;
   
   dbms_output.put_line('#'||delEname||'����� �����Ǿ��� �� ������� '||
                  total||'�� �Դϴ�!!');
   */
end;
/

