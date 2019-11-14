#include<stdio.h>
#include<string.h>
#define d 256
//autor: Mouxes13
void buscar(char pat[], char sec[])
{

    int n=1;
    int M = strlen(pat);
    int N = strlen(sec);
    int i, j;
    char p = 0; // hash que evalua el patron
    char t = 0; // hash que evalua la secuencia
     char hash = 1;


    for (i = 0; i < M-1; i++)
        hash = (hash*d)%n; // calculo el hash

    for (i = 0; i < M; i++)
    {
        //calcula los hash de patron y secuencia
        p = (d*p + pat[i])%n;
        t = (d*t + sec[i])%n;
    }


    for (i = 0; i <= N - M; i++)
    {

        if ( p == t )//comprueba si los dos hash son iguales si es así continuara revisando cada uno de los caracteres
        {
            for (j = 0; j < M; j++)
            {
                if (sec[i+j] != pat[j]) //al encontrar una coincidencia revisa los demas y si es diferente se sale
                    break;
            }
            if (j == M) //si la ubicacion en j es igual al tamaño del patron entonces imprime la ubicacion en i
                printf("Se encontro una coincidencia en: %d \n", i);
        }
        if ( i < N-M )
        {
            t = (d*(t - sec[i]*hash) + sec[i+M])%n;
            if (t < 0)
            t = (t + n);
        }
    }
}


int main()
    {
    char sec[80],pat[80];
    int o=1;
    while(o==1){

    printf("Escribe una secuencia\n"); //pedimos la secuencia
    scanf("%s",sec);
    printf("Escribe el patron a buscar \n"); //pedimos el patron
    scanf("%s",&pat);

    buscar(pat, sec);//llamamos la funcion buscar

    printf("Si quieres salir pon un '0' \n");
    scanf("%s",&pat);
    if(o==1){
        system("cls");
    }

    }
    return 0;
}
