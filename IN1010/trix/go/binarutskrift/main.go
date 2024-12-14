package main

import (
	"fmt"
)

func main() {
	bin(4)
}

func bin(n int) {
	if n == 0 {
		fmt.Println(0)
	} else {
		if n > 1 {
			bin(n / 2)
		}
		fmt.Print(n % 2)
	}
}
