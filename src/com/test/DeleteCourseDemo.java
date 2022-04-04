package com.test;

import org.hibernate.Session;

import com.Util.HibernateUtil;
import com.instructor.Course;
import com.instructor.Instructor;
import com.instructor.InstructorDetail;

public class DeleteCourseDemo {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		System.out.println("Creating new Course");
		
		int theId = 11;
		Course course = session.get(Course.class, theId);
		
		System.out.println("deleting: " +course);
		session.delete(course);
		
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		System.out.println("Done!");
	}

}
