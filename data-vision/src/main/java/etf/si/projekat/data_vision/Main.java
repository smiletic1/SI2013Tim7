package etf.si.projekat.data_vision;
import java.sql.Date;
import java.util.Scanner; 

import org.hibernate.Transaction; 
import org.hibernate.Session; 
 



import ba.unsa.etf.si.beans.ActivityLogs;
import etf.si.projekat.util.HibernateUtil; 

 
public class Main { 
 private static Scanner sc = new Scanner(System.in); 
 
 public static void main(String[] args) { 
	 Session session = HibernateUtil.getSessionFactory().openSession();
	 dodajActivity(session);
	 nadjiActivity(session); 
	 session.close(); 
	 } 
	 
	 private static void dodajActivity(Session session) { 
	 Transaction t = session.beginTransaction(); 
	 
	 ActivityLogs s = new ActivityLogs(); 
	 s.setCommand("stop");
	 s.setGranted(true);
	 s.setTimestamp(Date.valueOf("2014-05-13"));
	 s.setUser("Korisnik");
	 s.setFixtureName("Light");
	 	 
	 Long id = (Long) session.save(s); 
	 System.out.println("Dodan log sa IDom "+id); 
	 t.commit(); 
	 } 
	 
	 private static void nadjiActivity(Session session) { 
	 Transaction t = session.beginTransaction(); 
	 
	 System.out.println("Unesite id loga"); 
	 long id = sc.nextLong(); 
	 ActivityLogs s = (ActivityLogs) session.get(ActivityLogs.class, id); 
	 if (s==null) { 
	 System.out.println("Nema log sa tim IDom u bazi"); 
	 } else { 
	 System.out.println("Korisnik: "+s.getUser()+" "+s.getCommand()+" "+s.getTimestamp()); 
	 } 
	 
	 t.commit(); 
	 } 
} 
