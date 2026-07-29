for (int i = 0; i <= 500; i++) {
containsDuplicate(new int[]{0, 1, 0});
}
}
public static boolean containsDuplicate(int[] nums) {
HashSet<Integer> set = new HashSet<>();
for (int i = 0; i < nums.length; i++) {
if (!set.add(nums[i])) {
return true;
}
}
static {
class Solution {
import java.util.HashSet;