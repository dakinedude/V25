package main

type SortedSlice struct {
	slice []*int
	len int
}

func (s *SortedSlice) Insert(i *int) {
	s.len += 1
	if s.len == len(s.slice) {
		for 
	}

}

func (s *SortedSlice) GetFirst() *int {
	ret := s.slice[0]
	s.slice = append(s.slice[:0], s.slice[0:]...)
	return ret
}
