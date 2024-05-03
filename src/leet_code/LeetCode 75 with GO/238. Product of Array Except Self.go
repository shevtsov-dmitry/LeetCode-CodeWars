package main

func main() {
	// Input: nums = [1,2,3,4]
	// Output: [24,12,8,6]
	array := []int{1, 2, 3, 4}
	productExceptSelf(array)
}

func productExceptSelf(nums []int) []int {

	prefix := make([]int, len(nums))
	postfix := make([]int, len(nums))

	// fill prefix
	for i := 0; i < len(nums); i++ {
		if i == 0 {
			prefix[i] = 1
			continue
		}
		prefix[i] = prefix[i-1] * nums[i-1]
	}

	// fill postfix
	for i := len(nums) - 1; i >= 0; i-- {
		if i == len(nums)-1 {
			postfix[len(postfix)-1] = 1
			continue
		}
		postfix[i] = postfix[i+1] * nums[i+1]
	}

	for i := 0; i < len(nums); i++ {
		nums[i] = prefix[i] * postfix[i]
	}
	return nums
}
