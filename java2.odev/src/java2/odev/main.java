package java2.odev;

public class main {

	public static void main(String[] args){
		
	Student student1= new Student();
	student1.setFirstName("Mert");
	student1.setId(1);
	student1.setLastName("Enikonu");
	student1.setNationalIdentity("999999999");
	student1.setStudentId("20");
	
	Student student2= new Student();
	student1.setFirstName("Eda");
	student1.setId(2);
	student1.setLastName("Enikonu");
	student1.setNationalIdentity("999999999");
	student1.setStudentId("35");
	
	Instructor �nstructor1 = new Instructor();
	�nstructor1.setAddCourseVideo("Java");
	�nstructor1.setFirstName("Engin");
	�nstructor1.setId(3);
	�nstructor1.setLastName("Demirog");
	�nstructor1.setNationalIdentity("888888888");
	
	Instructor �nstructor2 = new Instructor();
	�nstructor2.setAddCourseVideo("C#");
	�nstructor2.setFirstName("Ali");
	�nstructor2.setId(4);
	�nstructor2.setLastName("Akbay");
	�nstructor2.setNationalIdentity("777777777");
	
	UserManager userManager = new UserManager();
	userManager.add(�nstructor1);
	userManager.login(�nstructor1);
	userManager.logout(�nstructor1);
	
	StudentManager studentManager= new StudentManager();
	studentManager.add(student1);
	studentManager.delete(student1);
	
	InstructorManager �nstructorManager = new InstructorManager();
	�nstructorManager.add(�nstructor2);
	�nstructorManager.delete(�nstructor2);
	
			
	

	}

}
