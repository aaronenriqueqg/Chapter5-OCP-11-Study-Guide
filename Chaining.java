public class Chaining{
  public static void main(String args[]){

 String panda= "   PandIta   ";
 System.out.println(panda.trim().toLowerCase().replace('p','P'));  // chaining methods of string
 System.out.print(panda); // remember String in inmutable. We are printing the original String

  

}
}