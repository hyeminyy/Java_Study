package arrayTest;

public class 실습_4_2_2차원배열집계 {

	public static void main(String[] args) {
		//int[][] matrix = new int[3][4];
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int max=0;
		int min=999;
		int sum=0;
		int count=0;
		int avg = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
			System.out.print(matrix[i][j]);
			System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("----------------------------------\n");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				//sum
				sum = sum + matrix[i][j]; 
				//avg
				avg = sum / matrix[i][j];
				//max
				if(max < matrix[i][j]) {
					max = matrix[i][j];
				}
				//min
				if(min > matrix[i][j]) {
					min = matrix[i][j];				
				}

			}

		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		// 2차원 배열 생성 및 초기화
    	/*
    	 * 2차원 행렬 [3][4]을 matrix 정수 변수로 선언하고 12개 값을 초기화
    	 */

        // 최대값, 최소값, 합 개수 초기화
    	/*
    	 * max, min, sum, count 정수 변수를 선언, 초기 값 지정
    	 * for 문을 사용하여 최대, 최소, 합, 개수를 계산  
    	 */


        // 평균 계산
    	/*
    	 * sum을 사용하여 평균을 avg 변수로 선언하여 저장
    	 */


        // 결과 출력
    	/*
    	 * 2차원 배열을 행렬 형태(테이블 형태)로 출력
    	 * 최대, 최소, 합, 개수, 평균을 다음과 같이 출력
    	 * "최대=**, 최소=**, 합 = **, 갯수=**, 평균=**"
    	 */
	}

}
