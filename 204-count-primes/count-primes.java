class Solution {
    public int countPrimes(int n) {
        int c=0;
        if(n==0 || n==1 || n==2)
        return 0; 
        int arr[]=new int[n];

        Arrays.fill(arr,1);

        arr[0]=0;
        arr[1]=0;

        for(int i=2;i<n;i++)
        {
            if(arr[i]==1)
            {
                c++;

                for(int j=2*i;j<n;j=j+i)
                {
                     arr[j]=0;
                }
            }
        }

        return c;
    }
}