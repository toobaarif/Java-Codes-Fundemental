
class Animal1{
    String   name;
    int age;
    String gender;
public void  produceSound(String voice){    
System.out.println(voice);
}
}
class Frog extends Animal1{

}
class Dog extends Animal1{
    

}
class Cats extends Animal1{
}
class kitten extends Cats{
    public void female(){
    System.out.println("Kittens are female! ");
    }
}
class tomcats extends Cats{
 public void male(){
     System.out.println("tomcats are male");
 }
}


class Tomcats extends Animal1{

}


public class Animal {

    public static void main(String[] args) {
        Animal1 obj = new Animal1();
        Frog f = new Frog();
        f.name = "frog";
        System.out.println("frog name: "+f.name);
        f.age = 12;
        System.out.println("Frog age: "+f.age);
        f.produceSound("frpg sound: tur turrr");
        
        Dog d = new Dog();
        d.name = "bruno";
        System.out.println("dog name: "+d.name);
        d.age = 4;
        System.out.println("Dog age: "+d.age);
        d.produceSound("dog sound bow bow");
        
        Cats c = new Cats();
        c.name = "bruno";
        System.out.println("cat name: "+c.name);
        c.age = 4;
        System.out.println("Cat age: "+c.age);
        c.produceSound("Cat sound meow meow1");
        
        
        
        
    
    }
}