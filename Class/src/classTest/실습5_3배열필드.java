package classTest;



	 class Person2{
		private String name;
		private int age;
		private float weight;
		private String subjects[]; //교육과목
		private int years[];
		private int subjectCount;


		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getAge() {
			return age;
		}



		public void setAge(int age) {
			this.age = age;
		}



		public float getWeight() {
			return weight;
		}



		public void setWeight(float weight) {
			this.weight = weight;
		}



		public String[] getSubjects() {
			return subjects;
		}



		public void setSubjects(String[] subjects) {
			this.subjects = subjects;
		}



		public int[] getYears() {
			return years;
		}



		public void setYears(int[] years) {
			this.years = years;
		}
		
		void addSubjectYear(String subject, int year) {//과목, 수강연도를 매개변수로 전달받아 배열에 추가
			int size = subjects.length;
			
			String[] newSubjects = new String[size+1];
			int[] newYears = new int[size+1];
			for (int i = 0; i < size; i++) {
				newSubjects[i] = subjects[i];
				newYears[i] = years[i];
			}
		    newSubjects[size] = subject;
		    newYears[size] = year;

		    subjects = newSubjects;
		    years = newYears;
			
		}
		
//		void addSubjectYear(String subject, int year) {//과목, 수강연도를 매개변수로 전달받아 배열에 추가
//		}
		
		void show() {	
			System.out.println(" name : "+name + " age : " +age+" weight : " + weight);
			int count = 0;
			while(count < subjects.length) {
				System.out.print(subjects[count]+" : " + years[count] +" ");
				count ++;
			}
			System.out.println("\n\n");
		}


	}
	 public class 실습5_3배열필드 {
	 public static void main(String[] args) {
	        
	        Person2 p1 = new Person2();
	        p1.setName("홍길동");
	        p1.setAge(25);
	        p1.setWeight(50.56f);
	        p1.setSubjects(new String[] {"Mathematics", "Science", "History"});
	        p1.setYears(new int[] {2020,2021,2022});

	        p1.show();
	        
	        
	        Person2 p2 = new Person2();
	        p2.setName("강감찬");
	        p2.setAge(55);
	        p2.setWeight(50.56f);
	        p2.setSubjects(new String[] {"Literature", "Philosophy", "Physics"});
	        p2.setYears(new int[] {2018,2019,2020});
	        
	        p2.addSubjectYear("computer",2024);
	        p2.addSubjectYear("computer2",2023);
	        
	        p2.show();
	        	        
	    }
	}

	
	    

