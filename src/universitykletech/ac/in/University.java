package  universitykletech.ac.in;

	interface University {
		void courses();
		void students();
		public void studentcreate(student[] s);


	}
	 class College implements University{
		static final String Scode="KLETECH E05";
		static final String Sname="KLE UNIVERSITY";
		 String branches;
		 int students;
		 student[] s=new student[3];
				 
		public College (String courses, int students){
			this.branches=courses;
			this.students=students;	
			}
		public void courses(){
			System.out.println("DMS");
			System.out.println("OOP");
			System.out.println("DS");
			System.out.println("DSD");
		}
		public void students(){
			System.out.println("Details of student:");
			if(students<500)
				System.out.println("college has minimum students");
			else
				System.out.println("college has maximum students");
		
		}
	 
	public void studentcreate(student[] s) {
		s[0]=new student(1,"Ramu",75,"DS");
		s[1]=new student(1,"Raju",86,"DMS");
		s[2]=new student(1,"sham",90,"OOP");
	}
		
	}
	
	class student extends College{
		
			String sStudname;
		 int rollno;
		 float marks;
		 public student(int rollno, String sStudname, int studentstr,String courses) {
			super(courses,studentstr);
		}
		 public void grade(){
				for(int i=0;i<s.length;i++)
				{
				if(s[i].marks>95)
					 System.out.println("Grade S\n");
				 else if(s[i].marks>90)
					 System.out.println("Grade A\n");
				 else if(s[i].marks>80)
					 System.out.println("Grade B\n");
				 else
					 System.out.println("Grade c\n");
				}
			    
			 }
		 
		 public void attendence(int studentstr){
			 if(studentstr<85)
				 System.out.println("student is ineliible for exam\n");
			 else
				 System.out.println("student is eligible for exam");
		 }

		
	}
	class Faculty extends College{
		String sFacname;
		String sDept;
		String sFtype;
		float salary;
		public Faculty(String sFacname, String dept,int studentstr,String courses){
			super(courses,studentstr);
			this.sFacname=sFacname;
			this.sDept=dept;
		
			
		}
	void display(){
		System.out.println("Details of faculty:");
		System.out.println("The faculty name "+  sFacname);
		System.out.println("The faculty's departement "+  sDept);
		
		}
	void Facultysalary(String sFtype){
		if(sFtype=="HOD")
		salary=60000;
		else if(sFtype=="professor")
			salary=450000;
		else
			salary=20000;
		System.out.println("faculty salary= "+ salary);
	}
		
	}


