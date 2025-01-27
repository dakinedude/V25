
#include <stdio.h>



void adder(int a, int b, int * result){

    *result = a+b;
    //fprintf(stdout, "adder: result=%d\n", result);
}

int main(){

    int a, b, result;

    a = b = 1;
    result = 0;

    // Parameters are passed COPY-BY-VALUE on the stack
    adder(a, b, &result); // ADDRESS OF result

    fprintf(stdout, "result=%d\n", result);

    return 0;
}
