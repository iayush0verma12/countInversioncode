import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class knapsack {
    public static void fractionalKnapSack(int [] weight, int [] value, int W)
    {
        double[][] ratio =new double[value.length][2];
        for(int i=0;i<value.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]= value[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        //it will sort the array in ascending order . less value will be pushed to lower index
        int cap=W;
        int val=0;
        for(int i=ratio.length-1;i>=0;i--)
        {
            int idx=(int)ratio[i][0];
            if(cap>=weight[idx])
            {
                cap=cap-weight[idx];
                val=val+value[idx];
            }
            else
            {
                val=val+(int)(ratio[i][1]*cap);
                cap=0;
                break;
            }

        }
        System.out.println(val);


    }
    public static void main(String[] args) {
        int[] weight ={10,20,30};
        int[] value ={60,100,120};
        int W=50;
        fractionalKnapSack(weight,value,W);

    }
}
