package main

import "fmt"

type Album struct {
	artist string
	tittel string
	utgitt string
}

func (a *Album) String() string {
	return fmt.Sprintf("Artist: %s | Tittel: %s | Utgitt: %s\n", a.artist,a.tittel,a.utgitt)
}

func (a *Album) HentArtist() string {
	return a.artist
}

func (a1 *Album) SammenliknMed(a2 Album) bool {
	return a1.tittel < a2.tittel
}
