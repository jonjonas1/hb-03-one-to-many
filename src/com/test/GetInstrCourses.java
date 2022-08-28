package com.test;

import org.hibernate.Session;

import com.Util.HibernateUtil;
import com.instructor.Course;
import com.instructor.Instructor;
import com.instructor.InstructorDetail;

public class GetInstrCourses {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		System.out.println("Getting instructor details / Course");
		
		// get the instructor from db
		int theId = 1;
		Instructor inst = session.get(Instructor.class, theId);
		
		System.out.println("Instructor: "+inst);
		
		//get course for the instructor
		System.out.println("courses: "+ inst.getCourse());
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		System.out.println("Done!");
	}

}
