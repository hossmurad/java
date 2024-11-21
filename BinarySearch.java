
class Main {
    public static void main(String[] args) {
        System.out.println("hossSystem");
        int [] array = {2,3,4,5,6,7};
        int target = 2;
        int search = BinarySearch(array,target);
        if(search==-1){
             System.out.println(target+" is not found");
        }else{
             System.out.println(target+" is found .Index number "+search);
        }
        
    }
    public static int BinarySearch(int[] array, int target){
        int start = 0;
        int end = array.length -1;
        while(start<=end){
            int mid = start+(end-start) / 2;
            if(array[mid] == target ){
                return mid;
            }else if( array[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
        }

    }
