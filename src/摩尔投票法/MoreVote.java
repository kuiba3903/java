package 摩尔投票发;

class MoreVote {
    public int MooreVote(int[] nums) {
        int candidate = -1, vote = 0;
        for (int num : nums) {
            if (vote == 0) {
                candidate = num;
            }
            if (candidate == num) {
                vote++;
            } else {
                vote--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        MoreVote s = new MoreVote();
        int[] a = {1, 2, 3, 4, 2, 4, 2, 2, 3};
        int[] b = {3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5};
        System.out.println(s.MooreVote(a));
        System.out.println(s.MooreVote(b));
    }
}