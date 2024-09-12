import java.util.*

fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }
    val treeSet = TreeSet<Int>()
    treeSet.addAll(nums.toList())

    var max = 0
    var curCount = 0
    for (num in treeSet) {
        if (treeSet.contains(num + 1)) {
            curCount++;
            max = maxOf(curCount, max);
        } else {
            curCount = 0;
        }
    }

    return max + 1

}