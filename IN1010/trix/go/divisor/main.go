package main

import "fmt"

func main() {
	fmt.Println(gcd(20, 30))
	fmt.Println(gcdIt(20, 30))
}

func gcd(a, b int) int {
	var c int
	var temp int

	if a < b {
		temp = a
		a = b
		b = temp
	}

	c = a % b

	if c == 0 {
		return b
	} else {
		return gcd(b, c)
	}
}

func gcdIt(a int, b int) int {
	var c int = 1
	var temp int
	

	for c != 0 {
		if a < b {
			temp = a
			a = b
			b = temp
		}
		c = a % b
		a = b
		if c == 0 {
			break
		}
		b = c
	}

	return b
}
