package com.deerhunter.topic;

/**
 * Oops, forgot to write comments. Good luck, bro.
 *
 * @author django
 * @since 2026/5/2 17:48
 */
public class TopicRotatedDigits {
    public static class Solution1 {
        private static final int[] rotated=new int[]{0,1,5,-1,-1,2,9,-1,8,6};
        public int rotatedDigits(int n) {
            int cnt=0;
            for(int i=1;i<=n;i++){
                if(canRotate(i)){
                    cnt++;
                }
            }
            return cnt;
        }

        private boolean canRotate(int n){
            int result=0;
            int curr=n;
            while(curr>0){
                result*=10;
                int digit=rotated[curr%10];
                if(digit==-1){
                    return false;
                }
                result+=digit;
                curr/=10;
            }
            return result!=n;
        }
    }
}
