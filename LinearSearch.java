//hossMurad(2231081044)
class Main {
    public static void main(String[] args) {
        System.out.println("hossSystem");
        int[] array = {2,3,4,6,7,8,5};
        int target = 7;
        int index = LenearSearch(array,target);
        if(index==-1){
            System.out.println( target+" Element is not  found  ");
        }else{
            System.out.println( target+" Element is  found Index number "+index);
        }
        
    }
    //start function to linear search 
    public static int LenearSearch(int[] array, int target){
        for(int i=0 ; i<array.length;i++){
            if(target == array[i]){
                return i;
            }
            return -1;
        }
    }

    //end LenearSearch function
}




