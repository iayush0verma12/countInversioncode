public class insertionSort{
    public static void insertionSort(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            int curr=i;
            int prev=i-1;
            while(prev>=0&&numbers[prev]>numbers[curr])
            {
                numbers[prev+1]=numbers[prev];
                prev--;
            }
            numbers[prev+1]=numbers[curr];
        }
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,7};
        insertionSort(numbers);
    }

}