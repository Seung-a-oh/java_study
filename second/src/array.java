
public class array {
	public static void main(String[] args) {
		int[] array1 = new int[100];
		int[] array2 = new int[] {1,2,3,4};
		int[] array3 = {1,2,3,4};
		
		System.out.println(array3[3]);
		
		for(int i=0; i<array1.length; i++) {
			array1[i] = i+1;
		}
		
		int[][] array4 = new int[3][4];
		
//		for(타입 값을 받아줄 변수명 : 출력하고 싶은 자료구조)
		for(int value:array2) {
			System.out.println(value);
		}
	}
}
