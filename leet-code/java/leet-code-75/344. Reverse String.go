package main

func main() {
	bytes := []byte("lovfely")
	reverseString(bytes)
}

func reverseString(s []byte) {
	if len(s) == 1 {
		return
	}
	for l, r := 0, len(s)-1; l < r; l, r = l+1, r-1 {
		rembLeft := s[l]
		s[l] = s[r]
		s[r] = rembLeft
	}

	fmt.Print(string(s))
}
