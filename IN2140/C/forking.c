#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main(void) {
  pid_t pid, n;
  int status = 0;

  if ((pid = fork()) == -1) {
    printf("Failure\n");
    exit(1);
  }

  if (pid != 0) {
    printf("parent PID=%d, child PID= %d\n",
           (int) getpid(), (int) pid);

    printf("parent going to sleep (wait)...\n");

    n = wait(&status);

    printf("returned child PID=%d, status= 0x%x\n",
           (int) n, status);
    return 0;

  } else {
    printf("child PID=%d\n", (int) getpid());
    printf("executing /store/bin/whoami\n");
    execve("/usr/bin/whoami", NULL, NULL);
    exit(0);
  }
}
