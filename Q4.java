/*
    Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and
    get the instance of the Class using constructor reference
 */
interface Emp{
    Employee emp (String name, int age, String city);
}
class Employee{
    private String name;
    private int age;
    private String city;

    Employee(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public void details(){
        System.out.println("name: " + name + " age: " + age + " city: " + city);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Emp emp1 = Employee::new;
        Employee ep1 = emp1.emp("Nitin", 23,"Delhi");
        ep1.details();
        Employee ep2 = emp1.emp("Yash", 18,"Mumbai");
        ep2.details();
        Employee ep3 = emp1.emp("Rahul", 21,"kolkata");
        ep2.details();
    }
}
