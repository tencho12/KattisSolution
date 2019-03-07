#include<stdio.h>
main()
{
	int h,m;
	scanf("%d %d",&h,&m);
	if(0<=h<=24&& 0<=m<=60)
	{
		int n=m-45;
		if(n<0)
		{
			if(h==0)
			{
				int z=23;
				h=z;
				n=n*(-1);
				m=60-n;
				printf("%d %d",h,m);
			}
			else
			{
			h=h-1;
			n=n*(-1);
			m=60-n;
			printf("%d %d",h,m);
			}
		}
		else
		{
			printf("%d %d",h,m);
		}
	}
}