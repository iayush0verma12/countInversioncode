import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {


    public static void main(String[] args) {
        int hp=1;
        int vp=1;
        int h=0;
        int v=0;
        Integer [] vertical ={2,1,3,1,4};
        Integer [] horizontal ={4,1,2};
        int cost=0;
        Arrays.sort(vertical, Collections.reverseOrder());
        Arrays.sort(horizontal, Collections.reverseOrder());
        while(v<vertical.length && h<horizontal.length)
        {
            if(vertical[v]>=horizontal[h]){
                cost+=(vertical[v]*hp);
                vp++;
                v++;
            }else{
                cost+=(horizontal[h]*vp);
                hp++;
                h++;
            }
        }
        while(v<vertical.length){
            cost+=(vertical[v]*hp);
            vp++;
            v++;
        }
        while(h<horizontal.length){
            cost+=(horizontal[h]*vp);
            hp++;
            h++;
        }
        System.out.println(cost);
    }
}
