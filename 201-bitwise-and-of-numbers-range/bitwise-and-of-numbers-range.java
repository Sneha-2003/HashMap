class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int sum=0;
        while(left!=right)
        {
            left=left>>1;
            right=right>>1;
            sum+=1;
        }
        return left<<sum;
    }
}