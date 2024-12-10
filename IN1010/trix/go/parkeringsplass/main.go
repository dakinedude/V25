package main

import "fmt"

func main() {
	b1 := Bil{Kjoretoy: &Kjoretoy{regNr: "1"}, seter: 4}
	b2 := Bil{Kjoretoy: &Kjoretoy{regNr: "2"}, seter: 2}
	b3 := Bil{Kjoretoy: &Kjoretoy{regNr: "3"}, seter: 5}

	m1 := Motorsykkel{Kjoretoy: &Kjoretoy{regNr: "1m"}, str: 400}
	m2 := Motorsykkel{Kjoretoy: &Kjoretoy{regNr: "2m"}, str: 200}
	m3 := Motorsykkel{Kjoretoy: &Kjoretoy{regNr: "3m"}, str: 500}

	k := []Kjoretoy{*b1.Kjoretoy,*b2.Kjoretoy,*b3.Kjoretoy, *m1.Kjoretoy, *m2.Kjoretoy, *m3.Kjoretoy}
	var p Parkeringshus

	for i := 0; i < 10; i++ {
		p.etasje1[i] = &Parkeringsplass{}
	}

	for i := 0; i < 10; i++ {
		p.etasje2[i] = &Parkeringsplass{}
	}

	for _, e := range k {
		if p.finnPlass(&e) {
			fmt.Println(e.hentNr(), " fant plass")
		} else {
			fmt.Println(e.hentNr(), " fant ikke plass")
		}
	}

	for _, e := range p.etasje1 {
		fmt.Println(e.hentKjoretoy())
	}

	for _, e := range p.etasje1 {
		if e.kjoretoy != nil && e.hentKjoretoy() == b1.hentNr() {
			e.Forlat(b1.Kjoretoy)
		}
	}

	for _, e := range p.etasje1 {
		fmt.Println(e.hentKjoretoy())
	}
}
