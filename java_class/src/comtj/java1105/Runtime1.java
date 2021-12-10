package comtj.java1105;

import java.io.IOException;

public class Runtime1 {

	public static void main(String[] args) {

		//Runtime 클래스 그림판 실행
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad.exe");
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
