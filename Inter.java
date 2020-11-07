public class Inter{
public static void main(String args[]){

String name = "Hello";
String space = new String("Hello");

System.out.println(name == space); // name is using the string pool and space is using a new object
space = space.intern();   // we tell the constructor to intern the object and use the string pool
System.out.println(name == space); 
System.out.println();
String first = "rat"+1;
String second ="r"+"a"+"t"+"1";
String third="r"+"a"+"t"+new String("1");
System.out.println(first == second); //true   because both are time constant
System.out.println(first == second.intern()); //true
System.out.println(first==third); //false
System.out.println(first==third.intern()); //true


}
}
