
public class Person {    //blueprint describes object == code defines data and methods (operations)
    
    //defines data == Attributes == Properties == instance vars.
    String name;
    String city;
    String phone;
    int yearOfBirth;
    
    
//defines methods

// constructor == special method    ==> 1. name same as class name   2. without return type 

Person(String n, String c, String p, int y){   // task ==> gives (set) initial value to data (attributes) ==> initial state
     name=n;
     city=c;
     phone=p;
     yearOfBirth=y;
  }
  

//method #1 : without return type
void checkCity(){
    if(city.equals("Amman")){
        System.out.println(name+" lives in Amman");
    }
    else{
         System.out.println(name+" doesn't live in Amman");
    }
}
    
    
 //method #2 : with return type
    
//   int findAge(){
//      return  2022-yearOfBirth;     // for p ===> 2022-2002     for p2 ===> 2022-2000
//   } 

    int findAge(){
     int age;
     age= 2022-yearOfBirth;     // for p ===> 2022-2002     for p2 ===> 2022-2000
     return age;    //20
    } 
    
}
