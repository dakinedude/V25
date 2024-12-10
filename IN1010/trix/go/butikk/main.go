package main

func main() {
	b := Butikk{}
	p1 := Person{"Ola", "Melk", nil}
	p2 := Person{"Kari", "Brod", nil}
	p3 := Person{"Jon", "Kjeks", nil}
	p4 := Person{"Markus", "Vaskemiddel", nil}
	p5 := Person{"Mathias", "Egg", nil}

	personer := [...]Person{p1,p2,p3,p4,p5}

	for _, p := range personer {
		b.EntreButikk(&p)
	}
	
	for i := 0; i < len(personer) + 1; i++ {
		b.Kassa()
	}
}
