

/* 
pairs in java for array -[2,4,6,8,10]
 (2,4),(2,6),(2,8)(2,10)
 (4,6)(4,8),(4,10)
 (6,8)(6,10)
(8,10) 
*/

public class pairs {
   public static void main(String[] args) {
    int nums[]={2,4,6,8,10};
    int n=nums.length;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            System.out.print("("+nums[i]+","+nums[j]+")");
        }
        System.out.println();
    }
   } 
}
