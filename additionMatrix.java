//miltidiman tional array
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("hossSystem");
		Scanner input = new Scanner(System.in);
		int[][] a ={{1,2,3},{1,2,3}};
	    int[][] b ={{1,2,3},{1,2,3}};
	    int[][] c = new int[2][3];
	    // first row and then colum
	    for(int i=0;i<2 ;i++){
	        for(int j=0; j<3; j++){
	            c[i][j] = a[i][j]+b[i][j];
	        }
	    }
	    
	    for(int i=0;i<2;i++){
	        for(int j=0; j<3; j++){
	            System.out.print(c[i][j]+" ");
	        }
	        System.out.println("");
	    }
	    
	    //adition of a all elsment 
	    int sum =0;
	      for(int i=0;i<2;i++){
	        for(int j=0; j<3; j++){
	            sum+=a[i][j];
	        }
	        
	    }
	    System.out.println("total sum of a : "+sum);
	}
}
