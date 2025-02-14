#include <stdlib.h>
#include <string.h>
#include <stdio.h>

int main(int argc, char* argv[]) {
  int i;
  int* array;
  int sum = 0;

  if (argc != 2) {
    fprintf(stderr, "Usage: %s <number in ascii>\n", argv[0]);
  }

  array = malloc(strlen(argv[1]) * sizeof(int));

  for (i = 0; i < strlen(argv[1]); i++) {
    array[i] = ((int)argv[1][i]-48);
  }

  for (i = 0; i < strlen(argv[1]); i++) {
    sum+=array[i];
  }

  fprintf(stderr, "sum : %d\n", sum);

  free(array);

  return 0;
}
