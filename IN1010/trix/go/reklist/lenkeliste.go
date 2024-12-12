package main

type Lenkeliste struct {
	start *node
}

type node struct {
	data any
	neste *node
}

func (l *Lenkeliste) LeggTil(ny any) {
	node := &node{data: ny, neste: nil}
	if l.start == nil {
		l.start = node
	} else {
		l.start.leggTil(node)
	}
}

func (n *node) leggTil(ny *node) {
	if n.neste != nil {
		n.neste.leggTil(ny)
	} else {
		n.neste = ny
	}

	return
}

func (l *Lenkeliste) Slett(m int) any {
	if l.start == nil {
		panic("No nodes")
	}

	if m == 0 {
		ret := l.start.data
		l.start = l.start.neste
		return ret
	} else {
		return l.start.slett(0, m).data
	}

}

func (n *node) slett(i int, m int) *node {
	var ret *node

	if i == m - 1 {
		ret = n.neste
		n.neste = nil
	} else {
		ret = n.neste.slett(i + 1, m)
	}
	return ret
}
