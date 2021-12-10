package com.tj.java1027;

public class If_5 {

	public static void main(String[] args) {
		String id = "luna";
		String pw = "1106";
		
		//id와 pw가 luna와 1106면 로그인 성공
		//id는 luna가 맞는데 비밀번호가 1106이 아니면 비밀번호가 틀림
		//id가 luna가 아니면 없는 아이디
		//라고 출력
		//나중에 id와 pw는 입력 화면에서 읽어오고 데이터를 데이터베이스와
		//비교하면 실제 로그인을 만들 수 있습니다.
		
		if(id == "luna" && pw == "1106") {
			System.out.println("로그인 성공");
		}else if (id == "luna") {
			System.out.println("비밀번호 틀림");
		}else {
			System.out.println("없는 아이디");
		}
		}

	}


