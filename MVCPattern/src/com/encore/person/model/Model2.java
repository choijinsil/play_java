package com.encore.person.model;

import java.util.Vector;

public class Model2 {
	//(DataStore�� ����)�����Ϳ� ���� CRUD ����!!
	// -----> �����ʹ� Person����
	//Create - �Է�
	//Read   - ��ȸ
	//Update - ����
	//Delete - ����
	
	private DataStore store;
	     //����<Person>�����,  ��ȣ�߻� no
	
	
	public Model2(DataStore store) {
		this.store = store;
	}
	
	
	//---------- Vector personV�� �������� �߰�,����,����,��ȸ �۾� ------------------------
	
	public void insert(Person newp){
		//����!! ---> ����� Person�� ��ȣ�� 0
		int no = store.getNo();//���ο� ��ȣ �ޱ�
		newp.setNo(no);//Person�� ��ȣ ����
		
	   	store.personV.add(newp);//�ٽ�����Ʈ
      //--------------
	  //  �����	   	
	} 
	
	//���� ������(Person�� age,job)�� ����
    public void update(Person newp){
    	//newp- ������ ������ ��� Person
    	
     //store.personV.get(0).setAge(����� ����);//�ٽ�����Ʈ
     //store.personV.get(0).setJob(����� ����);//�ٽ�����Ʈ
    //----------------------
    //	    Person p
    	
     //����!! ---> ���Ϳ� ù��°��  ����� Person�� ��� ����!!
     //�ذ�) newp�� ��ȣ�� ��ġ�ϴ� Person��
    	//���Ϳ� ����� �� Person�� ��ȣ�� ���ؼ� ã�� : for�� �ʿ�
    	
     for(int i=0; i<store.personV.size(); i++) {
    	 //��ü Person
    	 
    	 Person oldp = store.personV.get(i);
    	 //oldp: ���Ϳ� �̹� ����� Person
    	 
    	 if(oldp.getNo() ==   newp.getNo()) {
    		 oldp.setAge(newp.getAge());//�ٽ�����Ʈ
    	     oldp.setJob(newp.getJob());//�ٽ�����Ʈ
    	     break;
    	 }    	 
     }
    	
    	
    } //update
    
    //���Ϳ� ����� (Ư�� �Ѱ�)Person�� ����
    public void delete(int no){
    	             //no: ������ ��ȣ
    	
      //store.personV.remove(0);//�ٽ�����Ʈ
      //����: ������ ���Ϳ� ����� ù��° Person�� ����!!
     
      for(int i=0; i<store.personV.size(); i++) {
    	  //���� ��ü Person
    	  
    	  Person oldp = store.personV.get(i);
    	  
    	  if(oldp.getNo() ==  no) {//��ġ�ϴ� ��ȣ ã��
    		  store.personV.remove(i);//�ٽ�����Ʈ	  
    	  }    	  
      }
    }//delete
    
    //(no�� ���������ϴ�)Person�Ѱ� ��ȸ ---> ��� ����!!
    public Person select(int no){//�뵵: �������� ���
      //return store.personV.get(0);	//�ٽ�����Ʈ
      //����: ���Ϳ� ù��° ����� Person������ ����
    	
      //��ü ���� ��ȸ (��ġ�ϴ� ��ȣ�� Person���� ���)
      for(int i=0; i<store.personV.size(); i++) {
    	  Person oldp = store.personV.get(i);
    	 if(oldp.getNo() ==  no) {//��ġ�ϴ� ��ȣ�� ã�Ҵٸ�
    		 return oldp;
    	 }    	  
      }
      return null;//ã���� �ϴ� ��ȣ�� Person�� �������� �ʴ´ٸ�	
    }//select
    
    //��ȸ: ��üPerson�� ���� == (��üPerson�� ����� )���� ����
    public Vector<Person> selectAll( ){//�뵵: JTable���
      return store.personV;	
    } 
}









