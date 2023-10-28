package app_java_10;

public class Student {
	private String name;
	private int marks;
	private int id;

	public Student(String name, int marks, int id) {
		super();
		this.name = name;
		this.marks = marks;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
