package OOPs;

public class Student {
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    void ShowDetails(){
        System.out.println("Name :"+name);
        System.out.println("Marks :"+marks);
    }

    static void main(String[] args) {
        Student s1=new Student("Rahul",91);
        Student s2=new Student("Raj",87);
        Student s3=new Student("Kartik",78);
        Student Student[]=new Student[3];
        Student[0]=s1;
        Student[1]=s2;
        Student[2]=s3;
        for(int i=0;i<Student.length;i++){
            System.out.println(Student[i].name+" : "+Student[i].marks);
        }
    }
}
