public class curr {
    public static void main(String[] args) {
        int arr[] = {2,5,7,1,8};
        int n=arr.length;
        int total=n*(n+1)/2;
        int sum=0;
        System.out.println("Total No of subArrays are: "+total);
        //O(n^3 solution) sol
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int start=i;
                int end=j;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];
                }
            }
        }
        System.out.println("Sum of all subArrays is :"+sum);
    }
}