#include<stdio.h>
main(){
	int a,b,c,n=1;
	scanf("%d %d %d",&a,&b,&c);
	while(1){
		if(a+b==c){
			printf("%d+%d=%d",a,b,c);
			break;
		}
		if(b+c==a){
			printf("%d=%d+%d",a,b,c);
			break;
		}
		if(a-b==c){
			printf("%d-%d=%d",a,b,c);
			break;
		}
		if(b-c==a){
			printf("%d=%d-%d",a,b,c);
			break;
		}
		if(a*b==c){
			printf("%d*%d=%d",a,b,c);
			break;
		}
		if(b*c==a){
			printf("%d=%d*%d",a,b,c);
			break;
		}
		if(a/b==c){
			printf("%d/%d=%d",a,b,c);
			break;
		}
		if(b/c==a){
			printf("%d=%d/%d",a,b,c);
			break;
		}
	}
}