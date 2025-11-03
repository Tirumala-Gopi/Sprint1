package Library_and_Member_ManagementSystem;

public class Runner {

	public static void main(String[] args) {
		LibraryController controller=new LibraryController();
		Member student=controller.createMember("student", "email@email.com", "Student");

		
		Member faculty=controller.createMember("faculty", "email@email.com", "Faculty");
		
	
		
		EBook eBook=controller.createBook("eBook", "title", "author",12.3);
		

		PrintedBook printedBook=controller.createBook("printedBook", "title", "author",123);
		student.addBook(eBook);
		
		student.addBook(printedBook);
		
		controller.removeMember(student);
		System.out.println(controller.getBooks());
		
		controller.returnBook(faculty, printedBook);
		
				
		
	}

}
