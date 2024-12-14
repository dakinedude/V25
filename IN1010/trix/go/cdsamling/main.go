package main

import (
	"bufio"
	"log"
	"os"
	"strings"
)

func main() {
	filnavn := os.Args[1]
	fil, err := os.Open(filnavn)
	if err != nil {
		panic(err)
	}
	defer fil.Close()

	scanner := bufio.NewScanner(fil)
	var linjer []Album

	for scanner.Scan() {
		linje := strings.Split(scanner.Text(), ",") 
		linjer = append(linjer, Album{artist: linje[0], tittel: linje[1], utgitt: linje[2]})
	}

	if err := scanner.Err(); err != nil {
		log.Fatal(err)
	}

	var temp Album
	lengde := len(linjer)

	for i := 0; i < lengde; i++ {
		for j := 0 + i; j < lengde; j++ {
			if !linjer[i].SammenliknMed(linjer[j]) {
				temp = linjer[i]
				linjer[i] = linjer[j]
				linjer[j] = temp
				swapped = true
			}
		}
	}

	wf, err := os.Create("sortert.txt")
	defer wf.Close()
	if err != nil {
		panic(err)
	}

	for _,l := range linjer {
		_, err := wf.WriteString(l.String())
		if err != nil {
			panic(err)
		}
	}
}
