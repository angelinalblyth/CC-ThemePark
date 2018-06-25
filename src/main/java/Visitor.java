public class Visitor {

    private Integer age;
    private Double height;
    private Integer money;

    public Visitor(int age, double height, int money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Integer getMoney() {
        return money;
    }
}
