package arrayTest;

public class 실습_4_3_2차원행렬더하기 {

	public static void main(String[] args) {
		//int arr[][] = new int[5][7];
		int arr1[][] = {{1,2,3,4,5},{2,3,4,5,6},{7,8,9,10,11},{12,13,14,15,16},{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
		int arr2[][] = {{5,4,3,2,1},{6,4,3,5,7},{1,1,1,1,1},{88,77,66,55,44},{4,5,3,6,7},{3,3,3,3,3},{9,9,9,9,9}};
		//int arr3[][] = new int[5][7];
		    
		//A출력
		System.out.println("A출력");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
		                                               
			System.out.println("\n");
		}
		System.out.println("===================================");
		//B출력
		System.out.println("B출력");
		for (int a = 0; a < arr2.length; a++) {
			for (int b = 0; b < arr2[a].length; b++) {
				System.out.print(arr2[a][b] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("===================================");
		//c출력
		System.out.println("C출력");
		 int[][] arr3 = new int[arr1.length][arr1[0].length];

	        // 행렬 덧셈 수행
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr1[i].length; j++) {
	                arr3[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }
	        
	        for (int i = 0; i < arr3.length; i++) {
	            for (int j = 0; j < arr3[i].length; j++) {
	                System.out.print(arr3[i][j] + " ");
	            }
	            System.out.println("\n");
	        }
		
		
		// 두 개의 2차원 배열 생성 및 초기화
				/*
				 * 행렬 [5][7] A, B를 정수로 선언하고 12개의 값을 초기화
				 */


		        // 결과를 저장할 2차원 배열
				/*
				 * C = A + B => 행렬 A와 B를 더하여 C에 넣기 위한 정수 배열 C를 선언
				 */

		        // 행렬 더하기
				/*
				 * A, B를 더한 결과를 저장하는 C를 구하는 for 문 구현
				 */


		        // 결과 출력
				/*
				 * 행렬 A, B, C를 출력하는 코드 작성
				 * 출력 형태는 
				 * "A = 
				 *      1,2,3,4,5,6,7
				 *      8,9, ...
				 *  B = 
				 *  
				 *  C = 
				 */

	}

}
