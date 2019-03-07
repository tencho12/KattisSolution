#include<stdio.h>
main(){
	int testcase,upper,i,s=0,c=0;
	scanf("%d %d",&testcase,&upper);
	int inps[testcase];
	for(i=0;i<testcase;i++){
		scanf("%d",&inps[i]);
		s=s+inps[i];
		if(s<=upper)
			c++;
	}
	printf("%d",c);
}