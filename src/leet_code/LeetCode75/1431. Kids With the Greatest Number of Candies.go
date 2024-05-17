package main

import "fmt"

func main() {
	arr := kidsWithCandies([]int{2, 3, 5, 1, 3}, 3)
	fmt.Println(arr)
}

func kidsWithCandies(candies []int, extraCandies int) []bool {
	bools := make([]bool, len(candies))
	maxCandies := 0
	for _, candyAmount := range candies {
		maxCandies = max(maxCandies, candyAmount)
	}
	for i, candyAmount := range candies {
		bools[i] = candyAmount+extraCandies >= maxCandies
	}
	return bools
}
