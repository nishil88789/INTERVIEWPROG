package Collection.StreamApi;

public class LotteryStream {

	String name;
	String no;
	
	public LotteryStream(String name, String no) {
		
		super();
		
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
}
