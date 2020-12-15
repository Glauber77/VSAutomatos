#include<stdio.h>
#include<string.h>
#include <locale.h>
int main()
{
	
	setlocale(LC_ALL, "Portuguese");

			/*  Exemplos de cadeias aceitas pelo autômato são:{100011,10000011,11111000,0101010101,...},
		 	    Exemplos de cadeias que não são aceitas {00001, 1100, 0101, 011 ...} */
		 	    
		int i = 0;
		int tam = 0;      
		int cont0 = 0;
		int cont1 = 0;
		char cadeia[50];
		
	    printf("\n Digite a Cadeia: "); 
	    scanf("%s", &cadeia);
	    tam = strlen(cadeia)-1;
		
		while(i <= tam){
		    if(cadeia[i] == '0' || cadeia[i] == '1'){
		        if(cadeia[i] == '0') cont0++;
		        if(cadeia[i] == '1') cont1++;
		    }
		    i++;
		}

		if((cont0 % 2 != 0) && (cont1 % 2 != 0)){
			printf("\n Cadeia Pertence!");
		} 
		else{
			printf("\n Cadeia não Pertence! \n");
		}
	
}
