import java.util.HashSet;
class Solution {
public boolean containsDuplicate(int[] nums) {
if (set.contains(num)) {
}
HashSet<Integer> set = new HashSet<>();
for (int num : nums) {
return true;
set.add(num);
}
return false;
}
}