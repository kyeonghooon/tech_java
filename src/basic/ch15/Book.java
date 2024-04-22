package basic.ch15;

public class Book {

	private int totalPage;
	private String title;
	private String author;

	// 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// 생성자 오버로딩
	public Book(String title, String author, int totalPage) {
		this(title, author);
		this.totalPage = totalPage;
	}
	
	// getter 
	public int getTotalPage() {
		return totalPage;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showInfo() {
		System.out.println(">>> 책 정보 <<<");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
	}

}
