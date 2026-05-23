
/// Linear Search
public class linearSearch{
    public static int linearsearch(int nums[], int key){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int nums[]={3,5,1,4,8,0,7,23,6,};
        int key=0;
        System.out.println("our kke index :"+linearsearch(nums,key));
    }
}