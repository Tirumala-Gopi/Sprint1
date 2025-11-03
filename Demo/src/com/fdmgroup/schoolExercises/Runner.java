package com.fdmgroup.schoolExercises;

public class Runner {

	public static void main(String[] args) {
		Student student1=new Student("Alice",12,"7");
		Student student2=new Student("Bob",13,"8");
		
		Teacher teacher1=new Teacher("Smith","Math",10);
		Teacher teacher2=new Teacher("Jhonson","English",5);
		
		Classroom classroom1=new Classroom("A101",30,"Algebra");
		Classroom classroom2=new Classroom("B202",25,"Grammar");
		
		
		System.out.println(student1.getinfo());
		System.out.println(student2.getinfo());
		System.out.println(teacher1.getinfo());
		System.out.println(teacher2.getinfo());
		System.out.println(classroom1.getinfo());
		System.out.println(classroom2.getinfo());
		
		student1.study(null);
		student2.study(null);
		teacher1.teach();
		teacher2.teach();
		classroom1.startLesson();
		classroom2.startLesson();
		
		student1.setGrade("8");
		System.out.println(student1.getGrade());
		
		
		
	}

}
