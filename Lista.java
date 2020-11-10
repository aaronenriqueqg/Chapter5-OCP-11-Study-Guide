import java.util.*;
public class Lista{
public static void main(String args[]){

  int[] numeros = {1,2,3,4,5};
  numeros[0]=1;
   numeros[1]=12;
   numeros[2]=2;
   numeros[3]=123;
   numeros[4]=76;
 for(int num: numeros)
	System.out.println(num);
  System.out.println(Arrays.toString(numeros));
  Arrays.sort(numeros);
   System.out.println(Arrays.toString(numeros)); 
 System.out.println(Arrays.binarySearch(numeros,0)); //-1 
 System.out.println(Arrays.compare(new int[]{2}, new int[]{1})); //returns 1 because the first parameter is bigger.
 
 System.out.println(Arrays.compare(new int[]{1}, new int[]{1})); //returns 0 because they are identical
System.out.println(Arrays.compare(new int[]{1}, new int[]{1,2})); // first element is contained in the second
 int[] some=null;
 int[] luck = new int[]{2,3,4};
System.out.println(Arrays.compare(some,luck)); //returns -1 because the first parameters is null 

//System.out.println(Arrays.compare(new int[]{2}, new String[] {"a"})); // this doesn't compile because the are different types
 
}
}