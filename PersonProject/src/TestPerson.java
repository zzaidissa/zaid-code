
public class TestPerson {

    public static void main(String[] args) {

        //create an object ==> instance of class Person
        Person p = new Person("Ahmad Ali", "Amman", "0799797221", 2002); //1. locate location in memory 2. call (invoke) constructor
        System.out.println(p);
        System.out.println("Person name: " + p.name);
        System.out.println("Person City: " + p.city);
        p.phone = "0799797228";
        System.out.println("Person Phone: " + p.phone);
        Person p2 = new Person("Anas Ali", "As Salt", "0799797212", 2000); //1. locate location in memory 2. call (invoke) constructor
        System.out.println("Person name: " + p2.name);
        p.checkCity();
        p2.checkCity();
        
    //    int agePerson1=p.findAge();   //20
    //    System.out.println("Age of "+p.name+" is "+agePerson1);
         System.out.println("Age of "+p.name+" is "+p.findAge()+" years"); //20
         System.out.println("Age of "+p2.name+" is "+p2.findAge()+" years"); //22
        
        
        
    }

}
