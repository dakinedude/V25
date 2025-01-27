
#include <stdio.h>

void __attribute__((noinline)) otc(char a){
    fputc((int)a, stdout);
}

char l0 = 'H';
char l1 = 'e';
char l2 = 'i';
char l3 = ' ';
char l4 = 'i';
char l5 = 'f';
char l6 = 'i';

int main(){

    int i;
    char a;
    char *pointer = &l0;

    for(i=0; i <= 7; i++){

        a = *pointer;

        fprintf(stdout, "%c", a);
        
        pointer = pointer + 1;
    }

    return 0;
}
