
#include <stdio.h>

int main(){

    // 1: output file descriptor
    // stdout: "buffered" file descriptor
    // stderr: "unbuffered" file descriptor
    fprintf(stderr, "Hello, IFI!\n");

    return 0;
}

