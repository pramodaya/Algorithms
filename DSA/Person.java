
public class Person {
	private String name;
	private String rollno;
	
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}



	
	public Person(String name, String rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	
	
	public String toString(){
		return "Name: "+this.name+ " Rollno: "+ this.rollno;
	}
}
