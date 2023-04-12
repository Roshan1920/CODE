// C program to count white spaces, numbers, words in a file

#include <stdio.h>
int main()
{
    char str [81];
    int nletter, ndigit, nspace, nother;
    int i;
    
    printf("Enter a line of text:\n");
    fgets(str, sizeof(str), stdin);

    /* count characters in string str */
    nletter = ndigit = nspace = nother = 0;
    i = 0;
    while (str[i] != '\0')
        {
            char ch= str[i];
            if (ch>= 'A' && ch<= 'Z' || ch>= 'a' && ch<= 'z')
              nletter++;
            else if (ch>= '0' && ch<= '9')
                ndigit++;
            else if (ch == ' ' || ch =='\n' || ch == '\t')
                nspace++;
            else nother++;
                i++;
        }
    
    /* print counts */
    printf("Letters: %d \nWhite spaces : %d\n", nletter, nspace);
    printf("Digits : %d \nOther chars : %d\n", ndigit, nother);
    
    return 0;   
} 