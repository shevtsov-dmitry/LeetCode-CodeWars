package main

import (
	"fmt"
)

func main() {
	//Input: s = "leetcode"
	//Output: "leotcede"
	reversedVowels := reverseVowels("leetcode")
	fmt.Println(reversedVowels)
}

func reverseVowels(s string) string {
	chars := []byte(s)
	for l, r := 0, len(s)-1; l <= r; {
		if isVowel(chars[l]) && isVowel(chars[r]) {
			chars[l] = s[r]
			chars[r] = s[l]
			r--
			l++
		} else if isVowel(chars[l]) {
			r--
		} else if isVowel(chars[r]) {
			l++
		} else {
			r--
			l++
		}
	}
	return string(chars)
}

func isVowel(charCode uint8) bool {
	char := rune(charCode)
	return char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' || char == 'A' || char == 'E' || char == 'I' || char == 'O'
}
