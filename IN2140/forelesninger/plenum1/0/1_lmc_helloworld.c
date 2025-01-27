
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

    char a;

    a = l0;
    otc(a);
    a = l1;
    otc(a);
    a = l2;
    otc(a);
    a = l3;
    otc(a);
    a = l4;
    otc(a);
    a = l5;
    otc(a);
    a = l6;
    otc(a);

    return 0;
}
