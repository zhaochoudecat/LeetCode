package sort.search;

/**
 * Created by ZJGSU-IS on 2018/9/22
 */
public class Sort02 {
    public int firstBadVersion(int n) {
        int l=1,h=n;
        while(l < h){
            int mid = l + (h-l)/2;
            if(isBadVersion(mid)){
                h = mid;
            }else{
                l = mid + 1;
            }
        }
        return h;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
