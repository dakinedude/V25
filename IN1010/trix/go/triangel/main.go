package main

import "fmt"

func main() {
	triangel(3,5)
	fmt.Println()
	triangel(5,7)
	fmt.Println()
	triangel(1,3)
	fmt.Println()
}

func triangel(m int, n int) {
	if m == n + 1 {
		return
	}

	helper(0,m)
	fmt.Println()

	triangel(m+1, n)

	helper(0,m)
	fmt.Println()
}

func helper(i int, m int) {
	if i == m {
		return
	}

	fmt.Print("*")

	helper(i+1,m)
}
