package main

import "fmt"

func main() {
	l := Dobbellenke{}

	fst := any(1)
	l.SettInn(&fst)
	fmt.Println(*l.Slett(0))
	fmt.Println(l.Lengde())

	nums := [...]int{1,2,3,4,5}

	for _,n := range nums {
		temp := any(n)
		l.SettInn(&temp)
	}

	temp := any("hei")
	l.SettInn(&temp)

	fmt.Println("Lengde for sletting: ", l.Lengde())

	// fmt.Println(*l.Hent(0))
	fmt.Println("l[5]: ", *l.Hent(5))
	fmt.Println(*l.Slett(0))
	fmt.Println("Lengde etter sletting: ", l.Lengde())

	for i := 0; i < l.Lengde(); i++ {
		fmt.Println(*l.Hent(i))
	}
}
