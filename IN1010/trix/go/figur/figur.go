package main

import "fmt"

type geometri interface {
	areal() float64
	omkrets() float64
}

func maal(g geometri) {
	fmt.Println(g)
	fmt.Println(g.areal())
	fmt.Println(g.omkrets())
}

type rektangel struct {
	hoyde float64
	bredde float64
}

func nyRektangel(hoyde float64, bredde float64) *rektangel {
	r := rektangel{
		hoyde : hoyde,
		bredde : bredde,
	}
	return &r
}

func (r *rektangel) areal() float64 {
	return r.hoyde * r.bredde
}

func (r *rektangel) omkrets() float64 {
	return r.hoyde * 2 + r.bredde * 2
}

type sirkel struct {
	radius float64
}

func nySirkel(radius float64) *sirkel {
	s := sirkel{radius : radius}
	return &s
}

func (s *sirkel) areal() float64 {
	return s.radius * 3.14 * 3.14
}

func (s *sirkel) omkrets() float64 {
	return 2 * s.radius * 3.14
}
