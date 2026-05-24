


/// reverse array
public class reverseArray{
    public static void reverse(int nums[]){
        int start=0; 
        int end=nums.length-1;

        while(start<end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[]={3,5,1,4,8,0,7,23,6};
        reverse(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}