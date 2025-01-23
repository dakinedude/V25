#include <stdio.h>

void __attribute__((noinlinie)) otc(char a ) {
  fputc((int)a, stdout);
}

char l0 = 'H';
char l1 = 'e';
char l2 = 'i';
char l3 = 'I';
char l4 = 'F';
char l5 = 'I';
char l6 = '!';

int main(void) {
  char a; // accumulator

  a = l0; // lda
  otc(a);
  a = l1; // lda
  otc(a);
  a = l2; // lda
  otc(a);
  a = l3; // lda
  otc(a);
  a = l4; // lda
  otc(a);
  a = l5; // lda
  otc(a);
  a = l6; // lda
  otc(a);
  
  return 0;
}
