//fine big element of an array
public class Main
{
	public static void main(String[] args) {
		System.out.println("hossSysten");
		//create an new Array
	   int [] array = {23,2,3,10,7,5,55,7,11,8};
	   int max = maxElement(array);
	   System.out.println("Max element is: "+max);
	   
	}
	public static int maxElement(int[] array){
	    int max = array[0];
	    for(int i: array){
	        if(max < i){
	            max = i; 
	        }
	    }
	    return max;
	}
}
