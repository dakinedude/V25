package main

import "fmt"

func main() {
	liste := [...]Katt{
		{1, "koko"},
		{2, "kiki"},
		{7, "maka"},
		{2, "cookie"},
		{23, "loulouh"},
		{1, "sjoko"},
		{4, "mimi"},
		{3, "keke"},
	}

	max := -1
	var eldst Katt
	
	for i, n := range liste {
		for _, m := range liste[i:] {
			switch n.Sammenlikn(&m) {
			case 1:
				if n.HentAlder() > max {
					max = n.HentAlder()
					eldst = n
				}
			case -1:
				if m.HentAlder() > max {
					max = m.HentAlder()
					eldst = m
				}
			default:
				continue
			}
		}
	}

	fmt.Println(eldst)
}
