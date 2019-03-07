#include<stdio.h>
#include<math.h>
main(){
	int r,c;
	scanf("%d",&r);
	scanf("%d",&c);
	printf("%.6f",100*((3.141593*(r-c)*(r-c))/(3.141593*r*r)));
}