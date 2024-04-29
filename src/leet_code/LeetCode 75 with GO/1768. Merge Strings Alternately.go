package main

import (
	"fmt"
)

func main() {
	mergeAlternately("ab", "pqrs")
}

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
func mergeAlternately(word1 string, word2 string) string {
	n := max(len(word1), len(word2))
	concated := ""
	for i := 0; i < n; i++ {
		if i < len(word1) {
			concated += string(word1[i])
		}
		if i < len(word2) {
			concated += string(word2[i])
		}
	}
	fmt.Println(concated)
	return concated
}
