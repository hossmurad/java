//bubble sort
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("hossSystem");
		Scanner input = new Scanner(System.in);
		int[] array = {2,1,5,7,3};
		for(int i = 0; i<array.length; i++){
		  for(int j=i+1;j<array.length;j++){
		     if(array[i]>array[j]){
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		     }
		  }
		}
	   //print shorted array
	   for(int i: array){
	      System.out.print(i+" ");
	   }
	}
}
