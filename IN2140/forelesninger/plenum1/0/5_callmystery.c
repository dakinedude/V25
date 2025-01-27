
#include <stdio.h>

void printA(){

    fprintf(stdout, "A\n");
}

void printB(){

    fprintf(stdout, "B\n");
}

void printC(){

    unsigned long array[8];
    // Return address, array[9]

    array[7] = (unsigned long) printC;
    array[8] = (unsigned long) printA;
    array[9] = (unsigned long) printB;

    fprintf(stdout, "C\n");
}

int main(){

    // call printC(); pushing the return address
    // to "return 0" on the stack!
    printC();

    return 0;
}

