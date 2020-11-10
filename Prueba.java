import java.util.*;
public class Prueba{
public static void main(String args[]){

System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1})); //if they are equal returns -1
System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"})); //return 0 if they are equal but with differente uppercase or lowercase
System.out.println(Arrays.mismatch(new int[]{1,2}, new int[]{1}));//return  the first index where they differ
System.out.println(Arrays.mismatch(new int[]{1,2,3}, new int[]{1,2,3,5,6,7})); //returns 3



}
}