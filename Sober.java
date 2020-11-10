import java.util.*;
public class Sober{
public static void main(String...args){

Set<Integer> set = new HashSet<>();
System.out.println(set.add(66)); //true
System.out.println(set.add(66)); //false  because we cannot create two equal objects
System.out.println(set.size()); // we only have 1 element in our set.
set.remove(66);
System.out.println(set.isEmpty());

}
}