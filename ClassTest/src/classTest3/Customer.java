package classTest3;

 abstract class Customer {
    private String cname;
    private String city;
    private int age;
    
    public abstract double applyDiscount(double totalAmount);
    //추상 메서드 : 구체적인 할인 정책을 서브 클래스에서 정의해야 한다.

    public Customer(String cname, String city, int age) {
        this.cname = cname;
        this.city = city;
        this.age = age;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "이름: " + cname + ", 도시: " + city + ", 나이: " + age;
    }
}
