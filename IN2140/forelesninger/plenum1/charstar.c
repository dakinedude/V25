#include <stdio.h>

void timestwo(int *n) {
  *n *= 2;
}

int main(void) {
  char a[] = {'h', 'e', 'i', ',', ' ', 'd', 'u', '!', '\n'};
  char *p = &a[0];

  for (int i = 0; i < sizeof(a) / sizeof(a[0]); i++) {
    fprintf(stderr, "%c", *p);
    p++;
  }

  int m = 4;
  timestwo(&m);
  fprintf(stderr, "%d\n", m);

  return 0;
}
