class Solution {
    public int maxArea(int[] height) {
        
        int l=0,r=height.length-1,max=Integer.MIN_VALUE;

        while(l<r)
        {
            int h=Math.min(height[l],height[r]);
              int w=Math.abs(r-l);

               max=Math.max(max,h*w);

               if(height[l]<height[r])
               l++;
               else
               r--; 
        }

        return max;
    }
}