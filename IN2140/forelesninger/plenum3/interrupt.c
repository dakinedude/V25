#include <signal.h>
#include <stdio.h>

volatile int keep_going = 1;

// -O3 flag in compilation makes this redundant without volatile
void my_handler(int a) {
  fprintf(stderr, "I'm in my first handler!\n");
  keep_going = 0;
}

int main() {
  // C-C to intterupt -- send SIGINT
  signal(SIGINT, my_handler);
  while(keep_going) {
  }

  return 0;
}
