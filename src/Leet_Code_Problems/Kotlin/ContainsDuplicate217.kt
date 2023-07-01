package Leet_Code_Problems.Kotlin

fun main(args: Array<String>){
    print(containsDuplicate(intArrayOf(1,2,3,4)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    return nums.size != nums.toSet().size
}