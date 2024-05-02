package structure;

public class MainTest1 {

	public static void main(String[] args) {
		
		TencoIntArray tencoIntArray = new TencoIntArray();
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
		// tencoIntArray.insertElement(5, 50); // 테스트 이후에 수정 - todo
		
		tencoIntArray.printAll();
		System.out.println("---------------------------------------");
		System.out.println(tencoIntArray.getElementSize());
		System.out.println("---------------------------------------");
		System.out.println(tencoIntArray.isEmpty());
		System.out.println("---------------------------------------");
		tencoIntArray.removeAll();
		tencoIntArray.printAll();
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
		tencoIntArray.removeElement(1);
		tencoIntArray.printAll();
	}

}
