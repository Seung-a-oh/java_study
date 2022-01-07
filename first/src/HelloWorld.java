
public class HelloWorld {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		System.out.println("Hello Wolrd!");
		
//		행 단위 주석
/*		블록
		단위
		주석*/
/** 
 * 문서화 주석
 */
		
//		변수 - 단어와 단어 사이는 대문자
		int countNumber;
		countNumber = 1;
		
//		상수 - 대문자로만 명명, 단어 사이는 _ 
		final int J_K = 10;
		
//		long 타입은 l을 마지막에 붙여줘야한다.
		long l = 195916l;
		
//		char는 문자를 하나만 나타낼 수 있다.
		char c = 'c';
		
//		묵시적 형 변환
		int x = 50000;
		long y = x;
		
//		명시적 형 변환, 강제적 형 변환
		long a = 5;
		int b = (int) a;
	}

}
 