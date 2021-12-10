package comtj.java1105;

public class StringMethod3 {

	public static void main(String[] args) {
		String filename1 = "String.png";
		String filename2 = "String";
		//확장자는 마지막 .뒤의 글자들을 확장자라고 합니다.
		//위 2개의 문자열에서 확장자 부분을 추출하는데 확장자가 없으면 없다고 출력

		//split은 패턴을 찾아서 분할해서 배열로 리턴
		//패턴이 없으면 배열을 리턴하는데 분할하지 않고 원본 그대로 1개만 리턴 
		//.은 특수문자로 \\를 추가해야 합니다.
		//\를 찾을 때는 \\\\로 입력해야 합니다. 
		String [] result = filename1.split("\\.");
		//.이 있는지 확인 
		if (result.length<2) {
			System.out.println("확장자 없음");
		}else {
			//배열의 가장 마지막 요소를 출력
			System.out.println(result[result.length -1]);

			result = filename2.split("\\.");
			//.이 있는지 확인 
			if (result.length<2) {
				System.out.println("확장자 없음");
			}else {
				//배열의 가장 마지막 요소를 출력
				System.out.println(result[result.length -1]);
			}
			System.out.println("=======indexOf=======");

			//찾으면 찾은 위치를 리턴하고 못찾으면 음수를 리턴
			int idx = filename1.indexOf(".");
			System.out.println(idx);
			idx = filename2.indexOf(".");
			System.out.println(idx);
			//Substring은 인덱스를 1개 주면 그 인덱스부터 마지막까지 잘라줍니다. 
			//인덱스를 2개 주면 첫번째 인덱스부터 두번째 인덱스 앞까지 잘라줍니다. 

			//데이터를 찾으면 확장자를 찾으러 가면 되지만 데이터를 못찾으면 없다고 하면 됩니다.
			//찾은 위치에서 다음 칸부터 잘라오면 됩니다. 
			idx = filename1.indexOf(".");
			if(idx<0) {
				System.out.println("확장자 없음");
			}else {
				System.out.println(filename1.substring(idx+1));
			}
			idx = filename2.indexOf(".");
				if(idx<0) {
					System.out.println("확장자 없음");
				}else {
					System.out.println(filename2.substring(idx+1));
				}

				}
			}

		}
