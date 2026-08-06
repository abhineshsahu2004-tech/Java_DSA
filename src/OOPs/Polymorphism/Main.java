package OOPs.Polymorphism;

class Employee {
    String company = "Parent Company";
}
class Developer extends Employee {
    String company = "Child Company";
    void showCompany() {
        System.out.println(company);
        System.out.println(super.company);
    }
}
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.showCompany();
    }
}