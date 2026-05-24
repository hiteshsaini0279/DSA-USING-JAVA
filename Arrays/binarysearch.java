

/// binary search 
public class Main{
    public static  int binarySearch(int nums[], int key){
        int start=0;
        int end =nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]== key){
                return mid;
            }else if(nums[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
              int nums[]={3,5,1,4,8,0,7,23,6,};
            System.out.println(binarySearch(nums,23));
    }
}