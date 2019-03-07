#include<stdio.h>
#include <math.h>
main()
{
		
		float area,sarea,tarea;
	
		float r=1;
		float m=1,c=1;

		while(r!=0&&m!=0&&c!=0)
		{
			scanf("%f %d %d",&r,&m,&c);
			if(r!=0&&m!=0&&c!=0)
			{
			
				tarea=M_PI*r*r;
				sarea=2*r*2*r;
				float cm= c/m;
				area=cm*sarea;
				

				printf("%0.6f ",tarea);
				printf("%0.6g",area);
				printf("\n");
			}
		}
		
	}