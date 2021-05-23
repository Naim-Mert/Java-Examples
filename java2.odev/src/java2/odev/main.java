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
	
	Instructor ınstructor1 = new Instructor();
	ınstructor1.setAddCourseVideo("Java");
	ınstructor1.setFirstName("Engin");
	ınstructor1.setId(3);
	ınstructor1.setLastName("Demirog");
	ınstructor1.setNationalIdentity("888888888");
	
	Instructor ınstructor2 = new Instructor();
	ınstructor2.setAddCourseVideo("C#");
	ınstructor2.setFirstName("Ali");
	ınstructor2.setId(4);
	ınstructor2.setLastName("Akbay");
	ınstructor2.setNationalIdentity("777777777");
	
	UserManager userManager = new UserManager();
	userManager.add(ınstructor1);
	userManager.login(ınstructor1);
	userManager.logout(ınstructor1);
	
	StudentManager studentManager= new StudentManager();
	studentManager.add(student1);
	studentManager.delete(student1);
	
	InstructorManager ınstructorManager = new InstructorManager();
	ınstructorManager.add(ınstructor2);
	ınstructorManager.delete(ınstructor2);
	
			
	

	}

}
