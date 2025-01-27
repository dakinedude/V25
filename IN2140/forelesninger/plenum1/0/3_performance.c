

int data[30000][30000];

int main(){

    int i, j;

    for(j = 0; j < 30000; j++){
        for(i=0; i < 30000; i++){

            data[i][j] = i*j;
        }
    }

    return 0;
}
