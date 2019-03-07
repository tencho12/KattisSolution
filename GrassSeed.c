#include<stdio.h>

main()
{
	
		float c,w,l;
		scanf("%f",&c);
		int lg;
		scanf("%d",&lg);
		float sum=0.0;
		int i;
		for(i=0; i<lg;i++)
		{
			scanf("%f",&w);
			scanf("%f",&l);
			sum+=l*w;
		}

		printf("%0.7f",(sum*c));
	
}