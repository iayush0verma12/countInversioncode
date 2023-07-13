import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class SearchingInRotatedSortedArray {
    public static int search(int arr[],int target,int si,int ei)
    {
        if(si>ei)
        {
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(target==arr[mid])
        {
            return mid;
        }

        if(arr[si]<=arr[mid])
        {
            if(target>=arr[si] && target<=arr[mid])
            {
                return search(arr,target,si,mid-1);
            }
            else
            {
                return search(arr,target,mid+1,ei);
            }

        }
        //check on line right
        else {
            if (arr[mid] <= target && target <= arr[ei])
            {
                return search(arr, target, mid + 1, ei);
            }
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String args[])
    {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int si=0;
        int ei=arr.length-1;
        System.out.println(search(arr,target,si,ei));
    }
}

