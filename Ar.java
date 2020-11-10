import java.util.*;  
public class Ar{
public static void main(String...args){

ArrayList list1 = new ArrayList();
ArrayList list2 = new ArrayList(10); // reserves 10 slots
//ArrayList list3= new ArrayList(list2); // we make a copy of the list2 arraylist (both size and contents)

ArrayList<String> list4 = new ArrayList<String>();
ArrayList<String> list5 = new ArrayList<>(); // we can drop the String

//using var

var lista = new ArrayList<String>(5); 
lista.add("hello");
for(String element: lista)
System.out.print(element+ " ");

var nuevo = new ArrayList<>(); // arraylist of type object
nuevo.add("a");
nuevo.add("b");
for(Object o : nuevo)
System.out.print(o + " ");

//ArrayList implements List so...

List<String> panda = new ArrayList<>();  // Storing an ArrayList in a List reference
//ArrayList<String> pandita = new List<>(); // List being an interface it can't implements methods(can't be instantiated)

System.out.print(nuevo.toString());



}
}