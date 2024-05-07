package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	public void Filesave(String 파일이름) {
		File file1 = new File(파일이름); 
		
		try {
			FileWriter fw1 = new FileWriter(file1);
			
			BufferedWriter bw = new BufferedWriter(fw1);
			
			Person 사람 = new Person("김영희",10);
			bw.write(사람.toString());
			bw.close();
			System.out.println("저장 완료");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		pm.Filesave("Person.txt");
	}
	
	
	
	
}
