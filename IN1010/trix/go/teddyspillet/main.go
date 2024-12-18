package main

import "fmt"

func main() {
	fmt.Println(teddy(250))
	fmt.Println(teddy(42))
	fmt.Println(teddy(84))
	fmt.Println(teddy(53))
	fmt.Println(teddy(41))
}

func teddy(n int) bool {
	if n == 42 {
		return true
	}

	if n % 2 == 0 {
		if teddy(n/2) {
			return true
		}
	}
	if n % 4 == 0 || n % 3 == 0 {
		if teddy(n - (((n % 100)/10) * (n % 10))) {
			return true
		}
	}
	if n % 5 == 0 {
		if teddy (n - 42) {
			return true
		}
	}
	return false
}
