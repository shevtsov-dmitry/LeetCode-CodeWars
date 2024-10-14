func containsDuplicate(_ nums: [Int]) -> Bool {
    return Set(nums).count != nums.count
}

let f = containsDuplicate([1,2,3,4])
print("\(f) expected false")

let a = containsDuplicate([1,2,3,1])

print("\(a) expected true")


