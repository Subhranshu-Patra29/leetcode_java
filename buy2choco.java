import java.util.*;
public class buy2choco 
{
     public int buyChoco(int[] prices, int money) 
    {
        Arrays.sort(prices);

        int rem=0;
        outerloop:
        for(int i=0;i<prices.length-1;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if((prices[i]+prices[j])<=money)
                {
                    rem=money-(prices[i]+prices[j]);
                    break outerloop;
                }
                else
                    rem=money;
            }
        }
        System.out.println(rem);
        return rem;
    }
    public static void main(String[] args) 
    {
        buy2choco ob =new buy2choco();
        int prices[]={1,2,2};
        System.out.println(ob.buyChoco(prices, 3));
    }
}
