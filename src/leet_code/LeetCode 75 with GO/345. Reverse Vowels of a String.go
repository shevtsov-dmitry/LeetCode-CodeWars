package main

func main() {
	// Input: s = "hello"
	// Output: "holle"
	// if reverseVowels("hello") != "holle" {
	// 	fmt.Println("case1 err: ", reverseVowels("hello"))
	// }

	// Input: s = "leetcode"
	// Output: "leotcede"
	// if reverseVowels("leetcode") != "leotcede" {
	// 	fmt.Println("case1 err: ", reverseVowels("leetcode"))
	// }
	reverseVowels("leetcode")
}

func reverseVowels(s string) string {
	if len(s) == 1 {
		return s
	}

	chars := make([]rune, len(s))
	print(len(chars))

	return recursivelyShrinkRange(0, len(s), chars)
}

vowels := []rune{'a','e','o','i','u'}

func recursivelyShrinkRange(start, end int, chars []rune) string {
	if start == end {
		return string(chars)
	}
	if start == 
	return ""
}
