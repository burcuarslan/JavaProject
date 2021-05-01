package odev1;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)",0
	,"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.");
		
		Course course2=new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)",0
				,"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný");
		
		Course course3=new Course(3,"Programlamaya Giriþ için Temel Kurs",0
				,"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr");
		
		CourseManager courseManager=new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
	}

}
