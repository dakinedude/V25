#include <stdio.h>
#include <string.h>

int main(void) {
  char *s = "hei";
  printf("%s\n", s);
  printf("%d\n", strlen(s));
  printf("%d\n", sizeof(s) - 1);
  return 0;
}
