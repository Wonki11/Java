package ncs.test5;

public class Book {
//필드 전역변수
	private String title; //멤버변수
	private String author;
	private int price;
	private String publisher;
	private double discountRet;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setDiscountRet(double discountRet) {
		this.discountRet = discountRet;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	public double getDiscountRet() {
		return discountRet;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, int price, String publisher, double discountRet) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRet = discountRet;
	}
	
	//할인율과 정상가격을 확인해서 할인가를 알고 싶을 때 작성하는 메서드
	public int get할인가() {
		//할인하는 계산 방식 실수
		double discountAmunt = price * discountRet; //예를들어 100원 10% 판매
		
		//정상가 - % 만큼 할인이 들어간 금액
		int 할인가격 = (int) (price - discountAmunt);
		return 할인가격;
	}
	
	
	
	@Override
	public String toString() {
		return "책 [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", discountRet=" + discountRet + "]";
	}
	
	
}
