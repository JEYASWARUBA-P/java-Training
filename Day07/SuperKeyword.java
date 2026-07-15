package Day07;

class Person{
    String name;
    Person(String name){
        this.name =name;
    }
}
class Employee extends Person{
    Employee(){
        super("Ruba");
    }
   void Details(){
        System.out.println("Name: " + name);
   }
}
public class SuperKeyword {
    
}
