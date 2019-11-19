#include<stdio.h>
#include<string.h>
int main()
{
    char a[100];
    scanf("%[^\n]s", a);
    char ch;
    int k;
    for(int i = 0; a[i] != '\0'; i++)
    {
        k = 0;
        for(int j = 0; a[j] != '\0'; j++)
        {
            if(a[i] == a[j] && i != j)
            {
                k = 1;
                break;
            }
        }
        if(k == 0)
        {
            ch = a[i];
            break;
        }
    }
    if(k == 0)
    {
        printf("%c", ch);
    }
    else
    {
        printf("All the characters are repetitive");
    }
}