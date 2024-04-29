package main

import (
	"fmt"
)

func main() {
	fmt.Printf("%s\n", reverseVowels("hello"))
	fmt.Printf("%s\n", reverseVowels("leetcode"))
	fmt.Println(reverseVowels("a."))
	fmt.Println(reverseVowels("ai"))
	fmt.Println(reverseVowels("!!!"))
	println(reverseVowels("race a car"))
}

func reverseVowels(s string) string {
	if len(s) == 1 {
		return s
	}
	vowels := initVowelsSet()
	chars := []rune(s)
	l, r := 0, len(s)-1
	for l <= r {
		if vowels[rune(s[l])] != 0 && vowels[rune(s[r])] != 0 {
			rememberLeftRune := chars[l]
			chars[l] = chars[r]
			chars[r] = rememberLeftRune
			r--
			l++
		} else if vowels[rune(s[l])] != 0 {
			r--
		} else if vowels[rune(s[r])] != 0 {
			l++
		} else {
			l++
			r--
		}

	}
	return string(chars)
}

func initVowelsSet() map[rune]rune {
	vowels := make(map[rune]rune)

	vowels['a'] = 'a'
	vowels['e'] = 'e'
	vowels['i'] = 'i'
	vowels['o'] = 'o'
	vowels['u'] = 'u'

	vowels['A'] = 'A'
	vowels['E'] = 'E'
	vowels['I'] = 'I'
	vowels['O'] = 'O'
	vowels['U'] = 'U'

	return vowels
}
