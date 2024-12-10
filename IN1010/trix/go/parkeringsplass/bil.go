package main

type Kjoretoy struct {
	regNr string
}

func (k *Kjoretoy) hentNr() string {
	return k.regNr
}

type Bil struct {
	*Kjoretoy
	seter int
}

type Motorsykkel struct {
	*Kjoretoy
	str int
}

type Parkeringsplass struct {
	kjoretoy *Kjoretoy
}

type Parkeringshus struct {
	etasje1 [10]*Parkeringsplass
	etasje2 [10]*Parkeringsplass
}

func (p *Parkeringsplass) Parker(k *Kjoretoy) {
	p.kjoretoy = k
}

func (p *Parkeringsplass) Forlat(k *Kjoretoy) {
	p.kjoretoy = nil
}

func (p *Parkeringsplass) hentKjoretoy() string {
	if p.kjoretoy != nil {
		return p.kjoretoy.hentNr()
	} else {
		return "tomt"
	}
}

func (p *Parkeringshus) finnPlass(k *Kjoretoy) bool {
	for i:= 0; i < 10; i++ {
		if p.etasje1[i].kjoretoy == nil {
			p.etasje1[i].Parker(k)
			return true
		}
	}

	for i:= 0; i < 10; i++ {
		if p.etasje2[i].kjoretoy == nil {
			p.etasje2[i].Parker(k)
			return true
		}
	}
	return false
}
