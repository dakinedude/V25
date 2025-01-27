
#include <stdio.h>
#include <signal.h>

volatile int keep_running = 1;

void my_sighandler(int a){
    fprintf(stderr, "In my sighandler!\n");
    keep_running = 0;
}

int main(){

    if( SIG_ERR == signal(SIGINT, my_sighandler) ){
        fprintf(stderr, "Could not register signal handler.\n");
        return -1;
    }

    fprintf(stdout, "Running forever?\n");

    while(keep_running){
        // Run forever?
    }

    fprintf(stdout, "Done!\n");

    return 0;
}
