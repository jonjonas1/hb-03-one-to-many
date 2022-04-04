package com.test;

import org.hibernate.Session;

import com.Util.HibernateUtil;
import com.instructor.Instructor;
import com.instructor.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		System.out.println("Creating new Instructor");
//		Instructor inst = new Instructor("Susan", "Vanila", "susan@gmail.com");
//		InstructorDetail instDetail = new InstructorDetail("www.youtube.com/abc", "loveToCode");
		Instructor inst2 = new Instructor("Joni", "Otash", "otashjoni@gmail.com");

		InstructorDetail instDetail = new InstructorDetail("www.youtube.com/otash", "soccer player");

		// associate the objects, mapping together
		inst2.setInstructorDetail(instDetail);

		// save the instructor
		// Note: this will ALSO save the details object
		// because of CascadeType.All
		System.out.println("Saving instructor " + inst2);
		session.save(inst2);

		session.getTransaction().commit();
		HibernateUtil.shutdown();
		System.out.println("Done!");
	}

}
