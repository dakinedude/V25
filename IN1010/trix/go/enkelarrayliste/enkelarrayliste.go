package main

type iterator struct {
	array []string
	index int
}

func NewIterator(a []string) *iterator {
	return &iterator{
		array: a,
		index: 0,
	}
}

func (i *iterator) HasNext() bool {
	return i.index < len(i.array)
}

func (i *iterator) Next() string {
	if !i.HasNext() {
		panic("No more elements")
	}

	ret := i.array[i.index]
	i.index++
	return ret
}
