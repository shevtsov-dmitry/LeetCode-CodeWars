//  Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
    var map: [Int: Int] = Dictionary()
    for (idx, val) in nums.enumerated() {
        if map[target - val] != nil {
            return [map[target-val] ?? 0,idx] 
        }
        map[val] = idx
    }

    return [0,0]
}

let nums = [2,7,11,15]

if twoSum(nums, 9) != [0,1] {
    print("CASE 1")
}