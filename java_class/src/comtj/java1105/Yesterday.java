package comtj.java1105;

public class Yesterday {

	public static void main(String[] args) {
		
		int x = 123;
		//Object Type에는 모든데이터를 삽입할 수있음
		Object y = 123;
		int result = x+456;
		//Object Type의 데이터를 사용할 때는 원래의 자료형으로 강제 형변환을 해야합니다. 
		result = (Integer)y + 456;
				
		System.out.println(y.toString());
		//출력하는 메소드에 인스턴스 이름을 대입하면 toString 메소드를 호출한 효과
		System.out.println(y);

	}

}
