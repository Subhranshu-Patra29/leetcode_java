//checks if an array is a good array or not
import java.util.*;
public class goodArray 
{
    public boolean isGood(int[] nums) 
    {
        Arrays.sort(nums);
        int largest=nums[nums.length-1];

        int baseArray[]=new int[largest+1];
        baseArray[baseArray.length-1]=largest;
        for(int i=0;i<largest;i++)
            baseArray[i]=i+1;

        if(Arrays.equals(nums,baseArray))
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter no. of array elements: ");
        int n=in.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        goodArray ob=new goodArray();
        if(ob.isGood(arr))
            System.out.println("Good Array");
        else
            System.out.println("Not Good Array");
    }
}
