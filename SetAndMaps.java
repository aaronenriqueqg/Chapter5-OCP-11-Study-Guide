import java.util.*;
public class SetAndMaps{
public static void main(String ...args){
Map<String,String> map= new HashMap<>();
map.put("kill","me");  // key with value
String food = map.get("kill");    //we look for a key and we get the value returned
String other = map.getOrDefault("and","leaf"); // "and" is not mapped then we returnd the value "leaf"
System.out.println(food);
System.out.println(other);
for(String key :map.keySet())
    System.out.println(key+ " "+ map.get(key));
System.out.println(map.containsKey("kill"));
System.out.println(map.containsValue("me"));

}
}
