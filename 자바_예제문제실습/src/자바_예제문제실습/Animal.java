package 자바_예제문제실습;
/*
캡슐화 원칙에 맞게 구현하기
String 동물이름;
int 나이;


 * */
public class Animal {
	private String 동물이름;
	private int 나이;
	
	
	public String get동물이름() {
		return 동물이름;
	}
	public void set동물이름(String 동물이름) {
		this.동물이름 = 동물이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
	public Animal() {
		
	}
	public Animal(String 동물이름, int 나이) {
		super();
		this.동물이름 = 동물이름;
		this.나이 = 나이;
	}
	@Override
	public String toString() {
		return "Animal 동물이름=" + 동물이름 + ", 나이=" + 나이;
	}
	
	
	
	
}
