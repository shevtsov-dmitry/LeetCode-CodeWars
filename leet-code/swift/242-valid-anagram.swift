// Input: s = "anagram", t = "nagaram"
// Output: true
// Input: s = "rat", t = "car"
// Output: false

func isAnagram(_ s: String, _ t: String) -> Bool {
    if s.count != t.count {
        return false
    }
    let map1: [Character: Int] = initMap(s)
    let map2: [Character: Int] = initMap(t)
    return map1 == map2
}

func initMap(_ string: String) -> [Character: Int] {
    var map: [Character: Int] = Dictionary()
    for char: Character in string {
        map[char] = (map[char] ?? 0) + 1
    }
    return map
}

var s = "anagram", t = "nagaram"
assert(isAnagram(s, t) == true, "CASE 1");

s = "rat"; t = "car"
assert(isAnagram(s, t) == false, "CASE 2");

s = "aacc"; t = "ccac"
assert(isAnagram(s, t), "CASE 3")