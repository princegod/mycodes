package first_hibernateproject;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		student_info student=new student_info();
		student.setName("gunjan");
		student.setRollno(123345);
try{
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(student);
	    session.getTransaction();
	    session.close();
	    sessionFactory.close();
	
}catch(HibernateException exception){
    System.out.println("Problem creating session factory");
    exception.printStackTrace();
}
}

}
