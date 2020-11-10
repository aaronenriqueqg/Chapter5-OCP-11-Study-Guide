import java.util.*;
public class Convert{
public static void main(String ...args){

List<String> list = new ArrayList<>();
list.add("one");
list.add("two");
String[] con = list.toArray(new String[0]);
System.out.println(Arrays.toString(con));


String[] array={"hawk","robin"};
List<String> lista = Arrays.asList(array); //returns fixed size list (mutable) 
System.out.println(lista.size());
lista.set(1,"test");
lista.set(0,"panda");
lista.add("cama");
array[0]="yoya";   // yoya,test

System.out.print(Arrays.toString(array));
//lista.remove(1); we cannot remove from a mutable list



}
}