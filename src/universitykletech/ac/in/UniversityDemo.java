package universitykletech.ac.in;

public class UniversityDemo {
	public static void main(String[] args) {
		College c=new College("CS",30);
		c.courses();
		c.students();
		student[] s = new student[3];
		c.studentcreate(s);
		student s1=new student(1,"DDDA",200,"DMS");
		s1.attendence(55);
		s1.grade();
		Faculty f=new Faculty("AAA","DS",300,"dsd");
		f.display();
		f.Facultysalary("HOD");

}
}
