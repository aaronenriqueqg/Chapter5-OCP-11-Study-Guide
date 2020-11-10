public class variables{
public static void main(String...arggs){  //varargs

//4 forms to create multidimensional arrays

int[][] multi;  //2d array
int[]  multi1[]; // 2d array
int multi2[][]; //2d array
int[] vars1[],vars2[][]; // 2d array and 3d array 

String[][] rectangle= new String[2][3]; // 2 elements wich all of them refer to and array of 3 elements
rectangle[0][1]="a"; 
int[][]ds = new int[][]{{1,2},{5},{2,3,5,2}}; // 3 elements with different array sizes

int[][] args = new int[4][];  //declaring a asymmetric array
args[0]= new int[2]; // element 1 declares array of size 2;
args[1]= new int[3]; // element 2 declares array of size 3;

for(int i=0;i<ds.length;i++){
 for(int j=0;j<ds[i].length;j++)
	System.out.print(ds[i][j]+" ");
System.out.println();
}


for(int[] outer: ds){
 for(int inner: outer)
   System.out.print(inner +" ");
System.out.println();
}

}
}