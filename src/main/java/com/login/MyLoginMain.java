package com.login;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MyLoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLogin ml = new MyLogin();
		
		int a = 1007;
		
		Configuration con = new Configuration().configure().addAnnotatedClass(MyLogin.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();
		s.beginTransaction();
		
		//Select record
		Query q = s.createQuery("select id, name from MyLogin where id= :i");
		q.setParameter("i", a);
		Object[] obj = (Object[]) q.uniqueResult();
		System.out.println(obj[0]+" "+obj[1]);
//		List<Object[]> list = q.list();
//		for(Object[] obj : list) {
//			System.out.print(obj[0]+" "+obj[1]);
//			System.out.println();
//		}
//		MyLogin m = (MyLogin) q.uniqueResult();
//		System.out.println(m.getId()+" "+m.getName());
		
		
		//Insert Record
//		ml.setId(a);
//		ml.setName(name);
//		s.save(ml);
		
		
		//Update Record
//		Query q = s.createQuery("update MyLogin set name= :n where id= :i");
//		q.setParameter("i", a);
//		q.setParameter("n", name);
//		q.executeUpdate();
		
		
		//Delete Record
//		Query q = s.createQuery("delete from MyLogin where id= :i");
//		q.setParameter("i", a);
//		q.executeUpdate();
		
		s.getTransaction().commit();
		s.close();
//		System.out.println("Record Updated");
	}

}
