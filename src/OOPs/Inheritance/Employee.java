package OOPs.Inheritance;

public class Employee {

    String Name;
    int salary;
    int id;
    boolean password;


    Employee() {
        System.out.println("-----------Employee---------");
        System.out.println(Name);
        System.out.println(salary);
    }
    Employee(String Name){
        this.Name=Name;
        System.out.println(Name);
    }
    Employee(int id){
        this.id=id;
        System.out.println(id);
    }
    Employee(boolean password){
        this.password=password;
        System.out.println(password);
    }

    static void main(String[] args) {
        Employee E = new Employee();
        Developer D = new Developer();
        Tester T=new Tester();
        Manager M= new Manager();
    }
}

class Developer extends Employee {
    String Proglang = "java";

    Developer() {
        super("Abhinesh");
        System.out.println("-----------Developer---------");
        System.out.println(Proglang);
    }
}

class Manager extends Employee {
    int Teamsize;

    Manager() {
        super(500);
        System.out.println("------------Manager-----------");
        System.out.println(Teamsize);
    }
}

class Tester extends Employee {
    int Tools;

    Tester() {
        super(true);
        System.out.println("-----------Tester--------");
        System.out.println(Tools);
    }
}


