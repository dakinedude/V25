package main

import "fmt"

type Butikk struct {
	forste *Person
}

func (b *Butikk) EntreButikk(p *Person) {
	if b.forste == nil {
		b.forste = p
	} else {
		temp := b.forste
		for {
			if temp.HentNeste() == nil {
				temp.EndreNeste(p)
				break
			} else {
				temp = temp.HentNeste()
			}
		}
	}
}

func (b *Butikk) Kassa() {
	if b.forste != nil {
		fmt.Printf("%s kjoper %s\n", b.forste.HentNavn(), b.forste.HentGjenstand())
		b.forste = b.forste.HentNeste()
	} else {
		fmt.Println("Koen er tom!")
	}
}
