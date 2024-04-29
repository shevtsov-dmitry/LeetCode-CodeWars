package main

import "fmt"

func main() {
	arr := []int{2, 3, 5, 1, 3}

	fmt.Println(kidsWithCandies(arr, 3))
}

func kidsWithCandies(candies []int, extraCandies int) []bool {
	result := make([]bool, len(candies))
	rememberMax := 0
	for i, j := 0, len(candies)-1; i < len(candies)/2+1; i, j = i+1, j-1 {
		rememberMax = max(rememberMax, max(candies[i], candies[j]))
	}
	for i, candy := range candies {
		if candy+extraCandies < rememberMax {
			result[i] = false
		} else {
			result[i] = true
		}
	}
	return result

}
