package main

import "fmt"

func main() {
	eliste := Enkeltliste{}
	eliste.settInnForan("hei")
	eliste.settInnForan("paa")
	eliste.settInnForan("deg")
	eliste.settInnForan("din")
	eliste.settInnForan("gamle")
	eliste.settInnForan("sei")
	eliste.settInnForan("!!!")

	fmt.Println(eliste.Slett(3))
	eliste.skrivUt()
}
