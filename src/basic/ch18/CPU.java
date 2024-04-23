package basic.ch18;

public class CPU {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void process() {
		System.out.println("....처리중....");
	}
}
