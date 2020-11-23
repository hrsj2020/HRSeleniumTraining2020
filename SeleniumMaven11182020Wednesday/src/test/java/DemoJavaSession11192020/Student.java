package DemoJavaSession11192020;

public class Student {
	int studentID;
	String studentName;
	String studentAddress;
	static int collegeID;
	static int collegeName;
	private int collegeSSONumber = 456;	
	//obj.play();
	
	public void study() {
		System.out.println("Student is studying " + studentID + " and CollegeID is " + collegeID);
	}

	public void play() {
		System.out.println("Students are playing " + studentName);
			}
	public int getcollegeSSONumber() {
		return collegeSSONumber;
		
	}
}
