package main

func main() {
	println(gcdOfStrings("ABABABAB", "ABAB"))
	println(gcdOfStrings("ABCABC", "ABC"))
	println(gcdOfStrings("ABCDEF", "ABC"))
	println(gcdOfStrings("ABABAB", "ABAB"))
	println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXX"))
	println(gcdOfStrings("AAAAAAAAA", "AAACCC"))
}

// TODO solve with GCD math algorithmb
func gcdOfStrings(longStr string, shortStr string) string {
	if len(longStr) < len(shortStr) {
		rememberStr2 := shortStr
		shortStr = longStr
		longStr = rememberStr2
	}

	result := checkForFirstStr(longStr, shortStr)

	if len(result) == 0 {
		return result
	} else {
		for step := 0; step < len(shortStr); step += len(result) {
			if result != shortStr[step:step+len(result)] {
				return ""
			}
		}

		return result
	}
}

func checkForFirstStr(longStr string, shortStr string) string {
	for i := len(shortStr); i >= 1; i-- {
		substring := shortStr[:i]
		if !(len(longStr)%len(substring) == 0 && len(shortStr)%len(substring) == 0) {
			continue
		}
		if longStr[:len(substring)] == substring {
			for step := 0; step < len(longStr); step += len(substring) {
				if longStr[step:step+len(substring)] != substring {
					break
				}
				if step+len(substring) == len(longStr) {
					return substring
				}
			}
		}
	}
	return ""
}
