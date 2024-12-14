package main

import "fmt"

type Enkeltliste struct {
	start *node
}

type node struct {
	data string
	neste *node
}

func (e *Enkeltliste) settInnForan(innhold string) {
	ny := node{data: innhold, neste: e.start}
	e.start = &ny
}

func (e *Enkeltliste) skrivUt() {
	e.skrivUtBaklengs(e.start)
}

func (e *Enkeltliste) skrivUtBaklengs(n *node) {
	if n == nil {
		return
	}

	e.skrivUtBaklengs(n.neste)

	fmt.Println(n.data)
}

func (e *Enkeltliste) lengde(n *node) int {
	tot := 1

	if n == nil {
		return 0
	}

	tot += e.lengde(n.neste)

	return tot


}

func (e *Enkeltliste) Lengde() int {
	return e.lengde(e.start)
}

func (e *Enkeltliste) Slett(i int) string {
	if i < 0 || i >= e.Lengde() {
		return ""
	}
	ret := e.slett(0, i, e.start)
	if ret != nil {
		return ret.data
	}
	return ""
}

func (e *Enkeltliste) slett(cnt int, i int, n *node) *node {
	if cnt == 0 && i == 0 {
		ret := e.start
		e.start = e.start.neste
		return ret
	}

	if cnt == i-1 && n.neste != nil {
		ret := n.neste
		n.neste = n.neste.neste
		return ret
	}

	return e.slett(cnt+1, i, n.neste)
}
