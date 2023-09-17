//count the no. of pairs whose sum is less than target element
import java.util.*;
class lessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        //sorting the list
        Collections.sort(nums);

        int count=0;
        for(int i=0;i<nums.size()-1;i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                int elem1=nums.get(i);
                int elem2=nums.get(j);
                if((elem1+elem2)<target)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        List<Integer> nums=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<7;i++)
            nums.add(in.nextInt());

        lessThanTarget ob = new lessThanTarget();
        int ret=ob.countPairs(nums,-2);
        System.out.println(ret);
    }
}