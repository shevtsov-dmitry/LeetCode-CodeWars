package main

import (
	"bytes"
	"fmt"
	"strings"
)

func main() {
	//Input: s = "   the     sky is blue    "
	//Output: "blue is sky the"
	words := reverseWords("   the     sky is blue    ")
	fmt.Println(words)
}

func reverseWords(s string) string {
	if len(s) == 1 && s == " " {
		return ""
	}
	if len(s) == 1 && s != " " {
		return s
	}
	s = strings.TrimSpace(s)
	var buf bytes.Buffer
	var answer bytes.Buffer
	for i := len(s) - 1; i >= 0; i-- {
		if s[i] == ' ' || i == 0 {
			if i == 0 {
				buf.WriteByte(s[i])
			}
			reversesBytes := buf.Bytes()
			for j := len(reversesBytes) - 1; j >= 0; j-- {
				answer.WriteByte(reversesBytes[j])
			}
			if buf.Len() != 0 {
				answer.WriteByte(' ')
			}
			buf.Reset()
		} else {
			buf.WriteByte(s[i])
		}
	}
	return answer.String()
}
