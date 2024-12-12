package main

import "fmt"

func main() {
	l := Lenkeliste{}
	for i := 0; i < 100000; i ++ {
		l.LeggTil(i)
	}

	n := l.Slett(5214)
	fmt.Println(n)
}
