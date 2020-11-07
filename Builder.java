public class Builder{
public static void main(String args[]){

 StringBuilder panda = new StringBuilder();
for(char current='a'; current<='z'; current++)
	panda.append(current);
System.out.println(panda);

StringBuilder sb = new StringBuilder("hola");
StringBuilder sb2 = new StringBuilder(5);
 sb2.append("hola como estas");
System.out.println(sb2);
sb2.append(" bien y tu ?");
System.out.println(sb2);
System.out.println("estas solo por asi lo quieres \n".toUpperCase());

System.out.println(sb2.insert(5,"Aaron ")); // inserts character at the given index 
System.out.println(sb2.delete(5, 11));  // deletes characters at the given range 
System.out.println(sb2.deleteCharAt(0)); // deletes character at the given index position

StringBuilder nombre = new StringBuilder("Aaron Quejada");
nombre.replace(8,20,"ico");
System.out.println(nombre);
System.out.println(nombre.reverse());

String a = nombre.toString();
System.out.println("Soy un STRING!: "+a);



}
}