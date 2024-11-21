
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("hossSystem");
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0 ; i< array.length; i++){
		    System.out.print("Enter index number "+i+" : ");
		    array[i] = input.nextInt();
		}
		
		for(int i: array){
		    System.out.print(i +" ");
		}
		
	}
}
