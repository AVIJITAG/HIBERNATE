package maven.employe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ){
 
// Configuration -activates  hibernate framework
// configure -read both cfg files and mapping details
// buildSessionFactory -from cfg object it takes jdbc information and create a jdbc  connection
    	
      SessionFactory s = new Configuration().configure().buildSessionFactory();
      
// opens an connection with db and session object perform CRUD
      Session ses = s.openSession();

// operation performed indb, save permanent
      Transaction t = ses.beginTransaction();
      
// create a object of persistent class      
      Employee e = new Employee();
      
// use object to enter data in table using setter method
      e.setEmpID(101);
      e.setEmpfirstname("AVIJIT");
      e.setEmplastname("GARAI");
      e.setEmpemail("avijit76@j");
      e.setEmpphone(884889);
      e.setEmpadd("kol");
      e.setEmpsalary(5555);
      
// session object is used to save the persistent object
       ses.save(e);
       
// transaction object to commit changes
      t.commit();
      
// closing session      
      ses.close();
      
    }
}
