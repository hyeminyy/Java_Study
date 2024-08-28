package arrayTest;

import java.util.Iterator;

public class 실습_Exam3_배열 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "김유신", "계백", "강감찬", "을지문덕"};
		String[] subjs = {"국어", "수학", "영어", "과학", "역사"};
		int[] criteria = {50,60,70,80,90};
		int[][] scores = {{85,90,78,88,92},{75,80,85,90,95},{65,70,75,90,85},{95,92,88,84,91},{88,76,85,79,90}};
		
		
		System.out.println(">>> 학생별, 과목별 점수, 통과여부 출력");
		System.out.println("=======================================================================");
		for (int i = 0; i < names.length; i++) {
			System.out.println("[" + names[i] + "]"); //이름 출력
			for (int j = 0; j <subjs.length; j++) { //과목,점수 출력
				System.out.print(subjs[j] + " : " + scores[i][j] + " => " );
				if(scores[i][j] >= criteria[j]) {
					System.out.print("통과");
				}else {
					System.out.print("과락");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("=======================================================================");
		System.out.println(">>> 과목 총점 및 평균 점수를 테이블로 출력");
		System.out.println("=======================================================================");
		System.out.println("이름\t국어\t수학\t영어\t과학\t역사");                     
		System.out.println("-------------------------------------------------");
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			for (int j = 0; j < scores.length; j++) {
				System.out.print("\t"+scores[i][j]);
			}

			System.out.println("\n");
		}
		
		System.out.println("=======================================================================");
		System.out.println(">>> 과목별 최대, 최소 점수를 구하고, 해당 점수의 학생 이름을 테이블로 출력");
		System.out.println("=======================================================================");
		System.out.println("과목\t최대점수\t이름\t최소점수\t이름");                     
		System.out.println("-------------------------------------------------");
		
		for (int i = 0; i < subjs.length; i++) { //과목 출력
			int max =scores[0][i]; 
			int min =scores[0][i];
			String maxName =names[0]; 
			String minName =names[0]; 
			

            for (int j = 1; j < scores.length; j++) {
                if (scores[j][i] > max) {
                    max = scores[j][i];
                    maxName = names[j];
                }
                if (scores[j][i] < min) {
                    min = scores[j][i];
                    minName = names[j];
                }
            }

            System.out.println(subjs[i] + "\t" + max + "\t" + maxName + "\t" + min + "\t" + minName);
        }
		System.out.println("=======================================================================");
		System.out.println("END");
	}

}
