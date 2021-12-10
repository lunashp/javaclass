package member;

//회원 관리 작업을 위한 인터페이스
public interface MemberService {
	//회원 가입을 위한 처리
	public boolean memberregister (Member member);
	//회원 탈퇴를 위한 처리
	public boolean memberout(String password);
	//정보 조회
	public Member memberinfo(String id, String password);
	//정보 수정
	public boolean memberupdate(Member memeber);
	//로그인
	public boolean memberlogin(String id, String password);
	//로그아웃
	public void memberlogout();
	
}
