package in.cs.main.beans;

public class Student {

	private String name;
	private int rolno;
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRolno() {
		return rolno;
	}
	public void setRolno(int rolno) {
		this.rolno = rolno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Student(String name, int rolno, float marks) {
		super();
		this.name = name;
		this.rolno = rolno;
		this.marks = marks;
	}
	
	
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("name "+name+"rolno"+rolno+"marks : "+marks);
	}
}
