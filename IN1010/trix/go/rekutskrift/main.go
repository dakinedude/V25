package main

import "fmt"

func main() {
	utskrift(1)
}

func utskrift(i int) {
	fmt.Println(i)
	if i == 10 {
		return
	}

	utskrift(i + 1)

	return
}
