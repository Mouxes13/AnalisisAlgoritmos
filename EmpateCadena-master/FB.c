
#include <stdio.h>
#include <stdlib.h>


int main(){
int o=1;
int m;
int n;
int coinc=0;
char S[5000];
char P[5000];
int i;
int j;
while(o==1){
printf("Deposita la secuencia \n");
scanf("%s",&S);
m=strlen(S);//dar con el tamaño de la secuencia
printf("Deposita el patron a buscar \n");
scanf("%s",&P);
n=strlen(P); //dar con el tamaño del patron

if (m>n) {
for( i=0;i<m;i++)
{
 if(S[i]==P[i]){

    for( j=0; j<n;j++){

        if(S[j+i]!=P[j]){
            break;
        }
        else{
            if(j==n-1){
                coinc++;
            }
        }



    }


 }

}
}
else{
  printf("\nEl patron es muy largo" );
}
if (coinc==0) {
  printf("\nNo se encuentra coincidencias" );
}
if(coinc>0){
printf("\n el numero de coincidencias es : %i", coinc);
}
printf("\n Si quieres salir pon un '0' si no pon un '1'\n");
scanf("%i",&o);

if(o==1){
    system("cls");
}
}
return 0;
}
