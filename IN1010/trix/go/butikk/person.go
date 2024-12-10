package main

type Person struct {
	navn string
	gjenstand string
	neste *Person
}

func (p *Person) HentNavn() string {
	return p.navn
}

func (p *Person) HentGjenstand() string {
	return p.gjenstand
}

func (p *Person) EndreNeste(ny *Person) {
	p.neste = ny
}

func (p *Person) HentNeste() *Person {
	return p.neste
}
