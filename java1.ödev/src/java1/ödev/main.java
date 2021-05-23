package java1.ödev;

public class main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(C#+Angular)",12);
		Courses course2 = new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(Java+React)",8);
		
		Courses[] courses = {course1,course2};
		
		System.out.println("----Kurs Ýþlemleri---");
		for(Courses course : courses) {
			System.out.println( course.getId()+" " + course.getName()+" " +course.getWeekCount()+" ");
		}
	
		Ýnstructor instructor1 = new Ýnstructor(1,"Engin Demirog");
		
		Ýnstructor[] instructors = {instructor1}; 
		System.out.println("----Eðitmen Ýsimleri---");
		for(Ýnstructor instructor : instructors) {
			System.out.println(instructor.getId()+" " + instructor.getName());
		}
		
}
	
}