#include<stdio.h>
main()
{
	int r,c;
	scanf("%d  %d",&r,  &c);
	if(1<=c<=r&&r<=100)
	{
	float d=((3.14159265358979323846*(r-c))/(3.14159265358979323846*r*r))*100;
	printf("%0.9f",d);
	}
}