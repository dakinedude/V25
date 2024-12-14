package main

import "fmt"

type Person struct {
    name   string
    born   int
    mother *Person
    father *Person
}

type check interface {
    isOlderThan(Person) bool
    String() string
}

func (p Person) String() string {
    var father, mother string

    if p.father == nil {
        father = "none"
    } else {
        father = p.father.name
    }

    if p.mother == nil {
        mother = "none"
    } else {
        mother = p.mother.name
    }

    return fmt.Sprintf("Name: %s, born: %d. Father: %s, Mother: %s",
        p.name,
        p.born,
        father,
        mother,
    )
}

func (p Person) isOlderThan(other Person) bool {
    return p.born > other.born
}

func IsOlderThan(c check, other *Person) bool {
    return c.isOlderThan(*other)
}

func String(c check) string {
    return c.String()
}
