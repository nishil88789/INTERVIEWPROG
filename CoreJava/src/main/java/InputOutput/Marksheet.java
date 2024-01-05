package InputOutput;

import java.io.Serializable;

public class Marksheet  implements Serializable{

	public String name;
	public int math;
	transient int temp;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
}
