package Collection.Set;

public class EqualAndHashCode {

	public String name;
	
	public String rollno;
	
	public Integer marks;
	
	public EqualAndHashCode(String a, String b, Integer i) {
		
		this.name = a;
		this.rollno = b;
		this.marks = i;
	}
	public boolean equals(Object obj) {
		
		EqualAndHashCode eq = (EqualAndHashCode) obj;
		
 boolean b = rollno.equals(eq.rollno) && marks.equals(eq.marks) && name.equals(eq.name);
		return b;
	}
	
	public int hashcode() {
		
		String s = rollno + marks + name;
		
		return s.hashCode();
	}
}
