package sort.search;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组
 */
public class Sort01_2 {
    public void merge(int nums1[],int m,int nums2[],int n){
        int count = m + n - 1;
        --m;
        --n;//先减1 判断下标用

        //从最后一位开始插入 将两个数组较大的值插入
        while(m>=0 && n>=0) nums1[count--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        while(n >= 0)nums1[count--] = nums2[n--];
    }
}
