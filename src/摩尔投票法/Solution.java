package 摩尔投票发;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candaite1 = -1, candiate2 = -1, vote1 = 0, vote2 = 0;
        for (int num : nums) {
            if (vote1 > 0 && candaite1 == num) {//如果该元素为第一个元素，则计数加1
                vote1++;
            } else if (vote2 > 0 && candiate2 == num) {//如果该元素为第二个元素，则计数加1
                vote2++;
            } else if (vote1 == 0) {// 选择第一个元素
                candaite1 = num;
                vote1++;
            } else if (vote2 == 0) {// 选择第二个元素
                candiate2 = num;
                vote2++;
            } else { //如果三个元素均不相同，则相互抵消1次
                vote1--;
                vote2--;
            }

        }

        // 检测元素出现的次数是否满足要求
        int cnt1 = 0, cnt2 = 0;
        for (int num : nums) {
            if (vote1 > 0 && num == candaite1) {
                cnt1++;
            }
            if (vote2 > 0 && num == candiate2) {
                cnt2++;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        if (cnt1 > nums.length / 3) res.add(candaite1);
        if (cnt2 > nums.length / 3) res.add(candiate2);
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1, 2, 3, 4, 2, 4, 2, 2, 3};
        int[] b = {3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5};
        System.out.println(s.majorityElement(a));
        System.out.println(s.majorityElement(b));
    }
}