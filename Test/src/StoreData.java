

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
	// System.out.println("main start");
	   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    // System.out.println("step one");
	   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	 //  System.out.println("step two");
	   SessionFactory factory = meta.getSessionFactoryBuilder().build();
       Session session =factory.openSession();
       org.hibernate.Transaction t =  session.beginTransaction();  
      // System.out.println("three");
       Employee e=new Employee( "smruti");
       Employee e1=new Employee( "gunjal");
		session.save(e);
		session.save(e1);
		t.commit();
		factory.close();
		session.close();
		 System.out.println("end");
		
	}

}
