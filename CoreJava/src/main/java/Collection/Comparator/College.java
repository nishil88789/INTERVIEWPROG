package Collection.Comparator;

public class College {

	public String name;
	public int no;
	
	public College(String a ,int b) {
		
		this.name =a;
		this.no = b;
	}
	public String toString() {
		return(name + " "+no);
	}
}
