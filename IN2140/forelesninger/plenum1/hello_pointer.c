#include <stdio.h>

char l0 = 'H';
char l1 = 'e';
char l2 = 'i';
char l3 = 'I';
char l4 = 'F';
char l5 = 'I';
char l6 = '!';

int main(void) {
  char a;
  char *pointer = &l0;

  int i ;
  for (i = 0; i <= 6; i++) {
    a = *pointer; // dereference
    fprintf(stderr, "%c", a);
    pointer++;
  }
  
  return 0;
}
