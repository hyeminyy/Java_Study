package classTest;

import java.util.Arrays;

class Student8 {
    private String name;
    private int age;
    private String[] subjects;
    private int[] score;
    private int[] passFail;
    private static int count;

    public Student8(String name, int age, String[] subjects, int[] score, int[] passFail, int value) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.score = score;
        this.passFail = passFail;
        count++;
    }

    public static void getNumberStudents() { // 학생 수를 반환하는 정적 메소드
    	System.out.println("-----------------------------------");
        System.out.println("총 : " + count + "명");
        System.out.println("-----------------------------------");
        System.out.println();
    }

    public void printStudent() {
    	System.out.println("-----------------------------------");
    	 System.out.println("이름 : " + name + ", 나이 : " + age);
    	    for (int i = 0; i < subjects.length; i++) {
    	        String result = score[i] >= passFail[i] ? "Pass" : "Fail";
    	        System.out.println("과목 : " + subjects[i] + " , 점수 : " + score[i] + ", 통과여부 : " + result);
    	    }
    	    System.out.println("-----------------------------------");
    	    System.out.println();
    }

//    public boolean isPassed() {
//    	  for (int i = 0; i < subjects.length; i++) {
//    	        if (score[i] < passFail[i]) {
//    	            return false;
//    	        }
//    	    }
//    	    return true; 
//    }

    // 각 학생의 성적 테이블을 출력하는 정적 메소드
    public static void printAllStudents(Student8[] students) {
        for (Student8 student : students) {
            student.printStudent();
        }
    }

    // 과목별 최대/최소 점수 및 해당 학생을 출력하는 정적 메소드
    public static void printSubjectStats(Student8[] students) {
        int subjectCount = students[0].subjects.length;
        int[] maxScores = new int[subjectCount];
        int[] minScores = new int[subjectCount];
        Arrays.fill(maxScores, Integer.MIN_VALUE);
        Arrays.fill(minScores, Integer.MAX_VALUE);
        String[] maxScoreStudents = new String[subjectCount];
        String[] minScoreStudents = new String[subjectCount];

        for (Student8 student : students) {
            for (int i = 0; i < subjectCount; i++) {
                if (student.score[i] > maxScores[i]) {
                    maxScores[i] = student.score[i];
                    maxScoreStudents[i] = student.name;
                }
                if (student.score[i] < minScores[i]) {
                    minScores[i] = student.score[i];
                    minScoreStudents[i] = student.name;
                }
            }
        }

        for (int i = 0; i < subjectCount; i++) {
        	System.out.println("-----------------------------------");
           System.out.println(students[0].subjects[i] + " 과목");
            System.out.println("최고 점수: " + maxScores[i]  +" 학생 이름 : "+ maxScoreStudents[i] );
            System.out.println("최고 점수: " + minScores[i]  +" 학생 이름 : "+ minScoreStudents[i] );
            System.out.println("-----------------------------------");
            System.out.println();
        }
    }
    
    public static void showStudents(Student8[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i].printStudent();
        }
    }
}

public class 실습6_3정적메소드 {
    public static void main(String[] args) {
        String[] subjects = {"수학", "국어", "영어", "과학", "역사"};
        int[] passFails = {40, 70, 60, 55, 80};
        Student8[] students = {
            new Student8("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92}, passFails, -1),
            new Student8("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, passFails, -1),
            new Student8("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, passFails, -1),
            new Student8("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, passFails, -1),
            new Student8("을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, passFails, -1)
        };

        // 학생 수를 정적 메소드 호출로 처리
        Student8.getNumberStudents();

        // 학생 정보 출력 (예시)
        Student8.showStudents(students);

        // 각 학생의 성적 테이블 출력
        Student8.printAllStudents(students);

        // 과목별 최대/최소 점수 및 해당 학생 출력
        Student8.printSubjectStats(students);
    }
}
