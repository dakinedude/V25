package main

func main() {
	s := SortedSlice{make([]*int, 1)}
	el1 := 3
	el2 := 2
	el3 := 1

	s.Insert(&el1)
	s.Insert(&el2)
	s.Insert(&el3)
}
