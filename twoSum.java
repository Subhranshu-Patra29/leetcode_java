import java.util.*;
public class twoSum 
{
    public int[] two_sum(int[] nums, int target) 
    {
        int sum[]=new int[2];

        int copy[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            copy[i]=nums[i];

        Arrays.sort(copy);

        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(copy[i]+copy[j]==target)
                {
                    System.out.println(copy[i]+" "+copy[j]+" "+(copy[i]+copy[j]));
                    sum[0]=lSearch(nums,0,nums.length-1,copy[i]);
                    sum[1]=lSearch(nums,0,nums.length-1,copy[j]);
                }
                if(sum[0]==sum[1])
                {
                    sum[1]=lSearch(nums,sum[0]+1,nums.length-1,copy[j]);
                }
            }
        }
        return sum;
    }
    public int lSearch(int arr[],int start,int end,int key)
    {
        int index=0;
        for(int i=start;i<=end;i++)
        {    
            if(arr[i]==key)
            {
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) 
    {
        twoSum ob = new twoSum();
        int nums[]={2,5,5,11};
        int sum[]=ob.two_sum(nums,10);
        for(int i=0;i<2;i++)
            System.out.println(sum[i]);
    }
}