package java1.�dev;

public class main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C#+Angular)",12);
		Courses course2 = new Courses(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java+React)",8);
		
		Courses[] courses = {course1,course2};
		
		System.out.println("----Kurs ��lemleri---");
		for(Courses course : courses) {
			System.out.println( course.getId()+" " + course.getName()+" " +course.getWeekCount()+" ");
		}
	
		�nstructor instructor1 = new �nstructor(1,"Engin Demirog");
		
		�nstructor[] instructors = {instructor1}; 
		System.out.println("----E�itmen �simleri---");
		for(�nstructor instructor : instructors) {
			System.out.println(instructor.getId()+" " + instructor.getName());
		}
		
}
	
}