package main

import (
	"fmt"
)

func main() {

	//canPlaceFlowers([]int{1, 0, 0, 0, 1}, 1) // true
	//canPlaceFlowers([]int{1, 0, 0, 0, 1}, 2) // false
	//canPlaceFlowers([]int{1, 0, 0, 0, 0, 1}, 2) // false
	//canPlaceFlowers([]int{1, 0, 1, 0, 1, 0, 1}, 0) // true
	//canPlaceFlowers([]int{0, 0, 1, 0, 1}, 1) // true
	//canPlaceFlowers([]int{1, 0, 0, 0, 1, 0, 0}, 2) // true
	//canPlaceFlowers([]int{1, 0, 0, 0, 0}, 2) // true
}

func canPlaceFlowers(arr []int, n int) bool {
	if len(arr) == 1 {
		return getRidOfStartLogic(arr, n)
	}

	for i := 0; i < len(arr); i++ {

		if n == 0 && i+2 < len(arr) && arr[i+2] != 1 {
			return true
		}

		if len(arr) >= 3 && i == 0 {
			if (arr[i] == 0 && arr[i+2] == 1) || (arr[i] == 1 && arr[i+2] == 0) {
				arr[i+1] = 2
			}
		}

		if arr[i] == 0 && i+2 < len(arr) && arr[i+2] != 1 && arr[i+1] != 1 {
			arr[i+1] = 2
		}

		if arr[i] == 1 && i+2 < len(arr) && arr[i+2] != 1 && arr[i+1] != 1 {
			arr[i+2] = 2
		}

		if arr[i] == 2 {
			n--
		}
	}
	fmt.Println(n)
	return n == 0
}

func getRidOfStartLogic(arr []int, n int) bool {
	status := false
	if arr[0] == 1 && n == 0 {
		status = true
	}
	if arr[0] == 0 && (n == 1 || n == 0) {
		status = true
	}
	return status
}
