package main

import (
	"fmt"
	"math"
)

func main() {
	mergeAlternately("ab", "pqrs")
}

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
func mergeAlternately(word1 string, word2 string) string {
	n := int(math.Max(float64(len(word1)), float64(len(word2))))
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
