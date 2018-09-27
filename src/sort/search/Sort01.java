package sort.search;

/**
 * https://www.cnblogs.com/ariel-dreamland/p/9159410.html
 * 混合插入有序数组，由于两个数组都是有序的，所有只要按顺序比较大小即可。
 * 最先想到的方法是建立一个m+n大小的新数组，然后逐个从A和B数组中取出元素比较，把较小的加入新数组，
 * 然后在考虑A数组有剩余和B数组有剩余的两种情况，最后在把新数组的元素重新赋值到A数组中即可。
 */
public class Sort01 {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        if(m <= 0 && n <= 0)return;
        int nums[] = new int[m+n];
        int a=0,b=0;
        for(int i = 0; i < m+n; i++){
            if(a < m && b < n){
              if(nums1[a]<nums2[b]){
                  nums[i] = nums1[a];
                  a++;
              }else{
                  nums[i] = nums2[b];
                  b++;
              }
            }else if(a < m && b >= n){
                nums[i] = nums1[a];
                a++;
            }else if(a >= m && b < n){
                nums[i] = nums2[b];
                b++;
            }else return;
        }
        for(int i = 0; i < m+n; i++) nums1[i] = nums[i];
    }
}
