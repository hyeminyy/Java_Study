package classTest;

class Person1 {
    private String name;
    private int age;
    private float weight;
    
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

    public void show(String msg) {
        System.out.println("메시지 = " + msg);
        System.out.println("이름 = " + name + ", 나이 = " + age + ", 몸무게 = " + weight);
    }

    public void show() {
        
    }
}

public class 실습5_2메소드오버로딩 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.setName("홍길동");
        p.setAge(25);
        p.setWeight(62.123f);

        p.show();
        p.show("오버로딩");
    }
}
