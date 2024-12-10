package main

type Kvadrat struct {
	side int 
}

func (k *Kvadrat) Areal() int {
	return k.side * k.side
}
