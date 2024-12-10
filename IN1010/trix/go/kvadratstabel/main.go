package main

import "fmt"

func main() {
	ks := KvadratStabel{}
	k := [...]Kvadrat{
		{1},
		{2},
		{3},
		{4},
		{5},
		{6},
	}
	sum := 0

	for _, kv := range k {
		ks.LeggPaa(&kv)
	}

	for {
		if ks.ErTom() {
			break
		}
		tmp := ks.TaAv()
		sum += tmp.Areal()
	}

	fmt.Println(sum)
}
