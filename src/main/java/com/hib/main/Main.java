package com.hib.main;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.hib.entity.Student;
import com.hib.entity.StudentDetails;

public class Main {
	
	public static void main(String[] args) {
		Session session = new Configuration().
				configure("student.xml").
				addAnnotatedClass(Student.class).
				addAnnotatedClass(StudentDetails.class).
				buildSessionFactory().
				openSession(); 
		
   

		//TO DELETE RECORD FROM THE TABLE
		Student s = session.get(Student.class, 2);
        session.beginTransaction();

        session.delete(s);
        session.getTransaction().commit();
        System.out.println("Data deleted successfully.");
        
        //UPDATE THE DATA OF THE TABLE
//      Student s = session.get(Student.class,102);
//		s.getStudentDetails().setArea("MG ROADDDD");
//		
//		session.beginTransaction();
//		session.persist(s);
//		session.getTransaction().commit();
//	 	
//		System.out.println("Data Upated");
		
		
		
		//IT IS FETCHING DATA BY USING PRIMARY KEY
		
//		Student s = session.get(Student.class,102);
//		
//		System.out.println("id : "+s.getSid());
//		System.out.println("Name : "+s.getName());
//		System.out.println("Email : "+s.getEmail());
//		System.out.println("Mobile : "+s.getMobile());
//		System.out.println("SdId : "+s.getStudentDetails().getSdid());
//		System.out.println("Area : "+s.getStudentDetails().getArea());
//		System.out.println("City : "+s.getStudentDetails().getCity());
//		System.out.println("Pincode : "+s.getStudentDetails().getPincode());
		
		
		
		
		
		
		
		
		
		//INSERT INTO TO THE TABLE... HERE IT WILL INSERT BY DOING MAPPING TO THE STUDENT_DETAILS TABLE
		
//		Student s1 = new Student("Hari","hari@gmail.com",765231);
//		StudentDetails sd = new StudentDetails("BTM", "Bangalore",560076);
//		
//		s1.setStudentDetails(sd);
//		session.beginTransaction();
//		session.persist(s1);
//		session.getTransaction().commit();
//		System.out.println("Data inserted successfully");
		
		
		
		
	}
}
































