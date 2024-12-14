package main

import "fmt"

func main() {
	p1 := Person{"Inga", 1672, nil, nil}
    p2 := Person{"Karsten", 1690, &p1, nil}
    p3 := Person{"Petra", 1694, nil, nil}
    p4 := Person{"Ole", 1715, &p3, &p2}
    p5 := Person{"Ingeborg", 1718, nil, nil}
    p6 := Person{"Knut", 1738, &p5, &p4}
    p7 := Person{"Kai", 1715, nil, nil}
    p8 := Person{"Kari", 1740, nil, &p7}
    p9 := Person{"Sigrid", 1761, &p8, &p6}

	fmt.Println(String(FindOldest(&p9)))
	fmt.Println(String(FindOldest(&p8)))
	fmt.Println(String(FindOldest(&p1)))
}

func FindOldest(p *Person) *Person {
	if p.father == nil && p.mother == nil {
		return p
	}

	var f, m *Person
	if p.father != nil {
		f = FindOldest(p.father)
	} else {
		f = nil
	}
	if p.mother != nil {
		m = FindOldest(p.mother)
	} else {
		m = nil
	}

	if m != nil && f != nil {
		if !IsOlderThan(m, f) {
			return m
		} else {
			return f
		}
	} else {
		if m != nil {
			return m
		} else {
			return f
		}
	}

	return nil
}
