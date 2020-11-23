package DemoJavaSession11192020;

public class Applications {
	public static void main(String[] args){
		Student obj = new Student();
		obj.studentID = 45;
		obj.collegeID = 1;
		obj.study();
		System.out.println(obj.getcollegeSSONumber());
		//obj.play();
				
		Student obj1 = new Student();
		obj1.studentID = 60;
		obj1.collegeID = 21;
		obj1.study();
		obj.study();
	}

}
