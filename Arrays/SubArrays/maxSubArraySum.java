
/// prefixSum method 

public class maxSubArraySum {
    public static void main(String[] args) {
        int nums[]={1,-2,6-1,3};
         int n=nums.length;
         int max=Integer.MIN_VALUE;
         int prefix[]= new int[n];
         prefix[0]=nums[0];
         for(int i=1; i<n; i++){
              prefix[i]=prefix[i-1]+nums[i];
         }
         for(int i=0; i<n; i++){
            int start=i;
            for(int j=i; j<n; j++){ /// index bounding reason 
                int end=j; 
                int curr=0;
                 curr=  start==0?prefix[end]:prefix[end]-prefix[start-1];
                max=Math.max(max, curr);  
            }
         }
         System.out.println(" max Subarraysum:"+max);
    }
}
