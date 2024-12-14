package main

import "fmt"

func main() {
	i := NewIterator([]string{"eple", "banan", "cookie", "berry", "choco"})
	for i.HasNext() {
		fmt.Println(i.Next())
	}
}
