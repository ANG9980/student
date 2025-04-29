public class Student {

    String name;          
    int age;
    String dob;

    void details (String n ,int a ,String d){
        this.name=n;
        this.age=a;
        this.dob=d;
    }     
    void display(){

        System.out.println(" Name:"+name);
        System.out.println("age:"+age);
        System.out.println("dob:"+dob);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.details("shivaraj", 18,"12-april-2005");
        s1.display();
    }
}
