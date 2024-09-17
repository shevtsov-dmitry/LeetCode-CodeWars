package main

import (
	"bytes"
	"fmt"
)

func main() {
	stringAnswer := mergeAlternately("for", "so")
	fmt.Println(stringAnswer)
}

func mergeAlternately(word1 string, word2 string) string {
	var byteArrayBuffer bytes.Buffer
	for i := 0; i < max(len(word1), len(word2)); i++ {
		if i >= len(word1) {
			byteArrayBuffer.WriteByte(word2[i])
		} else if i >= len(word2) {
			byteArrayBuffer.WriteByte(word1[i])
		} else {
			byteArrayBuffer.WriteByte(word1[i])
			byteArrayBuffer.WriteByte(word2[i])
		}
	}
	return byteArrayBuffer.String()
}
