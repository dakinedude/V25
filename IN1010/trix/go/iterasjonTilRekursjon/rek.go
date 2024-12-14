package main

import "fmt"

func main() {
	strenger := [...]string{
		"IN1010",
		"er",
		"verdens",
		"beste",
		"fag",
	}

	SkrivUt(strenger, 0)
}

func SkrivUt(arr [5]string, n int) {
	if n == len(arr) {
		return
	}

	fmt.Println(arr[n])

	SkrivUt(arr, n + 1)

	return
}
