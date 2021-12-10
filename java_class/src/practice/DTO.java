package practice;

//번호와 이름을 갖는 클래스
public class DTO {
	private int num; //번호를 저장할 속성
	private String name; //이름을 저장할 속성 
	
	//접근자 메소드 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	//디버깅을 위한 메소드
	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + "]";
	}
	
	//인스턴스의 내용이 같은지 비교하는 메소드
	public boolean equals(DTO other) {
		//문자열의 일치 여부는 equals로 비교해야 됩니다.
		if (num == other.num && name.equals(other.name)) {
			return true;
		}
		return false;
	}
	//내용을 복제해서 리턴해주는 메소드
	public DTO clone() {
		//빈 객체를 생성
		DTO other = new DTO();
		
		//현재 인스턴스의 내용을 새로 생성한 인스턴스에 복사 
		other.num = num;
		//문자열은 새로 생성해서 복사 - 깊은 복사
		other.name = new String (name);
		
		return other;
	}
}
