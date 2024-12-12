package main

import "fmt"

func main() {
	l := Lenkeliste{}
	for i := 0; i < 10; i ++ {
		l.LeggTil(i)
	}

	fmt.Printf("Lengden foer sletting: %d\n", l.Lengde())
	fmt.Printf("Henter det siste element: %d\n", l.Hent(l.Lengde() - 1))
	fmt.Printf("Sletter elementet 5: %d\n", l.Slett(5))
	fmt.Printf("Lengde etter sletting: %d\n",l.Lengde())
	fmt.Printf("Henter element 0: %d\n", l.Hent(0))
	fmt.Printf("Henter det element index 4: %d\n", l.Hent(4))
	fmt.Printf("Sletter det siste elementet: %d\n", l.Slett(l.Lengde() - 1))
	fmt.Printf("Lengde etter sletting: %d\n",l.Lengde())
	fmt.Printf("Sletter elementet 0: %d\n", l.Slett(0))
	fmt.Printf("Lengde etter sletting: %d\n",l.Lengde())

	for i := 0; i < l.Lengde(); i++ {
		fmt.Println(l.Hent(i))
	}
}
