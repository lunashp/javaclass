package practice;

public class Main {

	public static void main(String[] args) {
		//DTO 인스턴스 2개 생성
		DTO obj1 = new DTO();
		obj1.setNum(1);
		obj1.setName("luna");
		
		DTO obj2 = new DTO();
		obj2.setNum(1);
		obj2.setName("luna");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		//각각 new를 이용해서 생성자를 호출했기 때문에 별도의 메모리 영역을
		//차지하고 있어서 false
		System.out.println(obj1 == obj2);
		//2개의 내용이 같은지 확인 - 인스턴스의 클래스에 equals 메소드를 재정의하고  
		//그 메소드를 통해서 비교하면 됩니다.
		System.out.println(obj1.equals(obj2));
		
		int x = 100;
		int y = x; //x를 복사한 것이 아니고 x가 가진 데이터인 100을 y가 가리키도록 한 것
		y = 200; //y 값을 변경
		System.out.println("x:" + x); 
		//x는 100을 복사해준 것이므로 영향이 없음
		//call by value
		System.out.println("y:" + y);
		
		//값과 참조 복사
		int [] ar = {100, 200, 300};
		int [] br = ar;
		//ar이 가리키고 있는 100, 200, 300의 대표이름을 가리키도록 한 것
		br[0] = 123; //br이 가리키고 있는 첫번째 데이터를 123으로 수정
		System.out.println("ar[0]:" + ar[0]);
		//참조를 복사해주었으므로 참조를 받은 곳에서 참조를 이용해서 세부 데이터를 수정하면
		//원본 데이터도 수정됩니다 - call by reference
		System.out.println("br[0]:" + br[0]);
		
		DTO luna = new DTO();
		luna.setNum(1);
		luna.setName("luna");
		
		DTO hunt = luna; //참조를 복사
		//luna의 것도 같이 변경되는 것처럼 보입니다.
		//luna와 hunt는 동일한 인스턴스 입니다. 
		hunt.setNum(2);
		
		System.out.println(luna);
		System.out.println(hunt);
		
		//복제
		DTO solar = luna.clone();
		solar.setNum(12);
		
		//복제를 했으므로 solar의 데이터를 변경해도 luna에는 변경이 없음
		System.out.println(luna);
		System.out.println(solar);
				
	}

}
