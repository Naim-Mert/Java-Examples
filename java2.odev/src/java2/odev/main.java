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
	
	Instructor żnstructor1 = new Instructor();
	żnstructor1.setAddCourseVideo("Java");
	żnstructor1.setFirstName("Engin");
	żnstructor1.setId(3);
	żnstructor1.setLastName("Demirog");
	żnstructor1.setNationalIdentity("888888888");
	
	Instructor żnstructor2 = new Instructor();
	żnstructor2.setAddCourseVideo("C#");
	żnstructor2.setFirstName("Ali");
	żnstructor2.setId(4);
	żnstructor2.setLastName("Akbay");
	żnstructor2.setNationalIdentity("777777777");
	
	UserManager userManager = new UserManager();
	userManager.add(żnstructor1);
	userManager.login(żnstructor1);
	userManager.logout(żnstructor1);
	
	StudentManager studentManager= new StudentManager();
	studentManager.add(student1);
	studentManager.delete(student1);
	
	InstructorManager żnstructorManager = new InstructorManager();
	żnstructorManager.add(żnstructor2);
	żnstructorManager.delete(żnstructor2);
	
			
	

	}

}
