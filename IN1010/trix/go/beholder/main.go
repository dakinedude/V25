package main

import "fmt"

type beholder struct {
	lagrer *Ting
}

type Ting struct {
	verdi int
}

func (t *Ting) sammenlikn(m *Ting) int {
	if t.verdi > m.verdi {
		return 1
	} else if t.verdi < m.verdi {
		return -1
	} else {
		return 0
	}
}

func (b *beholder) Settinn(t Ting) *Ting  {
	if b.lagrer == nil {
		b.lagrer = &t
		return nil
	}
	switch t.sammenlikn(b.lagrer) {
	case 1:
		temp := *b.lagrer
		b.lagrer = &t
		return &temp
	case -1:
		return nil
	default:
		temp := *b.lagrer
		b.lagrer = &t
		return &temp
	}
}

func main() {
	b := beholder{}
	t1 := Ting{1}
	t2 := Ting{2}
	t3 := Ting{3}

	fmt.Println(b.Settinn(t1))
	fmt.Println(b.Settinn(t2))
	fmt.Println(b.Settinn(t3))
}
