func groupAnagrams(_ strs: [String]) -> [[String]] {
    var map: [String: [String]] = Dictionary()

    for string in strs  {
        let chars = Array(string)
        let sortedAnagramChars = String(chars.sorted())
        var list = map[sortedAnagramChars] ?? []
        list.append(string)
        map[sortedAnagramChars] = list
    }

    return map.compactMap { (key: String, value: [String]) in
        value
    }
}

var stringArray: [String] = ["eat","tea","tan","ate","nat","bat"]
if "\(groupAnagrams(stringArray))" != "[[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]]" {
    print("ERROR")
    print("actual:   \(groupAnagrams(stringArray))")
    print("expected: [[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]]")
}
