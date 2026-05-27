
//kadane Algo 

public class kadaneAlgo {
    public static void main(String[] args) {
        int nums[]= {-1,3,7,8,-2,3,-7};
        int max=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0; i<nums.length; i++){
            currSum+=nums[i];
            if(currSum<0){
                currSum=0;
            }
            max=Math.max(currSum,max);
        }
        System.out.println("maximum subarray sum value:"+max);
    }
    
}
