

public class subarray {
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
  int ts=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<=nums.length; j++){
                 for(int k=i; k<j; k++){
                    System.out.print(nums[k]+" ");
                 }
                 ts++;
                 System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray: "+ts);
    }
}



/*
sub Arrays of array={2,4,6,8,10}
2
2,4
2,4,6
2,4,6,8
2,4,6,8,10

4
4,6
4,6,8
4,6,8,10
 
6
6,8
6,8,10

8
8,10

10
 */