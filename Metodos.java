import java.util.*;
public class Metodos{
public static void main(String args[]){

ArrayList lista = new ArrayList<>();  // creating array by deaulft it is an object
lista.add("a");
lista.add(Boolean.FALSE);

System.out.print(lista.toString()); 
lista.set(0,"b");  //changes one element of the given index without changing the size
System.out.println(lista.toString()); 
System.out.println(lista.isEmpty());
System.out.println(lista.size());
// lista.clear();  //discard all the  elements in the arraylist
System.out.println(lista.toString());
System.out.println(lista.contains("b"));
ArrayList nueva = new ArrayList();
nueva.add("b");
nueva.add(Boolean.FALSE);
System.out.println(nueva.toString());
System.out.println(lista.equals(nueva)); // compares if the arraylist are equal
Integer a = Integer.valueOf(27);
a=null;
System.out.println(a);

List<Integer> yoya = new ArrayList<>();
yoya.add(Integer.valueOf(2));
yoya.add(new Integer(5));
Integer num = 29;
yoya.add(num);
System.out.println(yoya.toString());
yoya.remove(new Integer(2));
System.out.println(yoya.toString());
}
}