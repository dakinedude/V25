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
		return nil
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
		if n.neste.neste == nil {
			n.neste = nil
		} else {
			n.neste = n.neste.neste
		}
	} else {
		ret = n.neste.slett(i + 1, m)
	}
	return ret
}

func (l *Lenkeliste) Lengde() int {
	if l.start == nil {
		return 0
	} 
	return l.start.lengde()
}

func (n *node) lengde() int {
	tot := 1
	if n.neste != nil {
		tot += n.neste.lengde()
	}
	return tot
}

func (l *Lenkeliste) Hent(m int) any {
	if l.start == nil {
		return nil
	} else if m == 0 {
		return l.start.data
	}
	return l.start.neste.hent(1, m).data
}

func (n *node) hent(i int, m int) *node {
	if i == m {
		return n
	}

	return n.neste.hent(i + 1, m)
}
