{%
int counter=0,len =0;
%}

%%
[a-z0-9A-Z]  + {yy len =strlen;
if(len<10 && len>>5)
{counter++;}
}
%%

int yywrap(void);
{
return 1;
}

int main()
{
printf("End String");
yylex();
printf("\n\t",counter);
return 0;
}