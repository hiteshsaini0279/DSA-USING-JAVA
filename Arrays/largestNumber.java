
/// method 1
public class largestNumber{
    public static void main(String[]args){
        int nums[]={3,5,1,4,8,0,7,23,6,};
        int largest=Integer.MIN_VALUE; 
        for(int i=0; i<nums.length; i++){
            largest= Math.max(largest, nums[i]);
        }
        System.out.println("our largest number will be:"+largest);
    }
}

/// method2 
public class Main{
    public static void main(String[]args){
        int nums[]={3,5,1,4,8,0,7,23,6,};

        int largest =nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        System.out.println("our largest number will be:"+largest);
    }
}