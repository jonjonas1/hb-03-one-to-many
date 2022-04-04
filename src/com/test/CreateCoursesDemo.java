package com.test;

import org.hibernate.Session;

import com.Util.HibernateUtil;
import com.instructor.Course;
import com.instructor.Instructor;
import com.instructor.InstructorDetail;

public class CreateCoursesDemo {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		System.out.println("Creating new Course");
		
		// get the instructor from db
		int theId = 2;
		Instructor inst = session.get(Instructor.class, theId);
		
		//create some courses
//		Course tempCourse1 = new Course("AP Computer science");
		Course tempCourse2 = new Course("Human science");
		
		// add courses to instructor
//		tempInst.add(tempCourse1); 
//		tempInst.add(tempCourse2);
		
		//save the courses
//		session.save(tempCourse1);
//		session.save(tempCourse2);
		
		Course c = session.get(Course.class, 12);
		inst.add(c);
		
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		System.out.println("Done!");
	}

}
