public class Cadena{
public static void main(String[] args){
  String perro= "panda";
 System.out.println(perro.charAt(4)); // retonar el caracter que existe en la posicion index indicada
 System.out.println(perro.indexOf("da")); // retonar la posicion del caracter or string
 System.out.println(perro.indexOf("a",3));// retona la posicion del caracter o cadena comenzando desde el index indicado
 System.out.println(perro.substring(1,5)); // retonar  el contenido desde el rango indicado 
 System.out.println(perro.substring(2)); // si no define el rango final entonces se asume hasta el final del string
 System.out.println(perro.toUpperCase()); // converts any lowercase to uppercase
 System.out.println(perro.toLowerCase()); // conver any uppercase to lowercase
System.out.println(perro.equals("pandA")); // checks if both objects have the same characters in the same order
System.out.println(perro.equalsIgnoreCase("Panda")); // check if both objects have the same character in the same order 
						// but ignores uppercase or lowercase
System.out.println(perro.startsWith("pand")); // checks if the string starts with the characters in the input
System.out.println(perro.endsWith("nda")); // check if the string end with the chacters in the input
System.out.println(perro.contains("an")); // check if the string contains the character or chain
System.out.println();
System.out.println(" abece  ".trim()); // cuts the blank spaces at the start and end of the string.
String text = " \t  avece \n ";
System.out.println(text.strip()); // does the same as trim but it accepts unicode
System.out.println(text.stripLeading()); //  cuts the blank spaces at the beginning 
System.out.println(text.stripTrailing()); // cuts the blank space at the ending.


 
}
}