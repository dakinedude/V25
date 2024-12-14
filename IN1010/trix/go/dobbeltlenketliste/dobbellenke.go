package main

type Dobbellenke struct {
	start *node
}

type node struct {
	forrige *node
	neste *node
	data *any
}

func (d *Dobbellenke) SettInn(T *any) {
	if d.start == nil {
		d.start = &node{
			forrige: nil,
			neste: nil,
			data: T,
		}
	} else {
		n := d.start
		for n.neste != nil {
			n = n.neste
		}
		n.neste = &node{
			forrige: n,
			neste: nil,
			data: T,
		}
	}
}

func (d *Dobbellenke) Lengde() int {
	cnt := 0
	n := d.start
	for n != nil {
		n = n.neste
		cnt++
	}
	return cnt
}

func (d *Dobbellenke) Hent(i int) *any {
	cnt := 0
	n := d.start
	for cnt != i && n != nil {
		n = n.neste
		cnt++
	}
	if n == nil {
		return nil
	}
	return n.data
}

func (d *Dobbellenke) Slett(i int) *any {
	cnt := 0
	n := d.start
	for cnt != i && n != nil {
		n = n.neste
		cnt++
	}
	if n == nil {
		return nil
	}

	prev := n.forrige
	next := n.neste

	if prev != nil {
		prev.neste = next
	} else {
		d.start = next
	}

	if next != nil {
		next.forrige = prev
	}
	
	return n.data
}
