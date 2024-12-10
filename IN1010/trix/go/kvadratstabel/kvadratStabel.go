package main

type KvadratStabel struct {
	hode *node
}

type node struct {
	data *Kvadrat
	neste *node
}

func (ks *KvadratStabel) LeggPaa(k *Kvadrat) {
	ny := &node{
		data: k,
		neste: ks.hode,
	}
	ks.hode = ny
}

func (ks *KvadratStabel) ErTom() bool {
	return ks.hode == nil
}

func (ks *KvadratStabel) TaAv() *Kvadrat {
	if ks.ErTom() {
		return nil
	}
	ret := ks.hode
	ks.hode = ks.hode.neste
	return ret.data
}
