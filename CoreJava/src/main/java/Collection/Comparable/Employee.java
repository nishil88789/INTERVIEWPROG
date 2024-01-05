package Collection.Comparable;

public class Employee implements Comparable<Employee> {

	private String name;
	
	private int id;
	
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return(id + " " + name);
	}
	@Override
	public int compareTo(Employee e) {
		
		if (this.id ==(e.id)) {
			
			return name.compareTo(e.name);
	} else {
		return this.id - e.id;

	}
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}
