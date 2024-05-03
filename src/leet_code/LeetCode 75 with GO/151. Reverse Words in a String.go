package main

import (
	"strings"
)

func main() {
	var sentence string = "the sky is   blue     "
	charsOfSentence := make([]rune, len(sentence))
	for i, char := range sentence {
		charsOfSentence[i] = char
	}
}

func reverseWords(sentence string) string {
	sentence = strings.TrimSpace(sentence)
	var result = ""
	words := strings.Split(sentence, " ")
	for i := len(words) - 1; i >= 0; i-- {
		if words[i] != "" && i == 0 {
			result += words[i]
			break
		}
		if words[i] != "" {
			result += words[i] + " "
		}
	}
	return result
}
