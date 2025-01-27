
#include <stdio.h>


int main(){

    int a;
    a = 1;
    {
        int b;
        b = 2;
        {
            b=1;
            a=b;
        }
    }

    // Pitfall!!
    if(b == 1)
        return -1;

    return 0;
}
