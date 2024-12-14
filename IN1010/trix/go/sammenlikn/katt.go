package main

type Katt struct {
	alder int
	navn string
}

func (k *Katt) Sammenlikn(k2 *Katt) int {
	if k.alder > k2.alder {
		return 1
	} else if k.alder < k2.alder {
		return -1
	} else {
		return 0
	}
}

func (k *Katt) HentAlder() int {
	return k.alder
}
