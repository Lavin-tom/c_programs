#include<stdio.h>
#include<string.h>

//#define MAX_LEN 40

int main()
{
    char a[40];
    scanf("%s", a);
    int L = strlen(a);
    
    int c, r;
    scanf("%d", &c);
    r = (L / c);
    if((L % c) > 0)
    {
        r = r + 1;
    }
    
    int i, j;
    for(i = 0; i < c; i++)
    {
        for(j = 0; j < r; j++)
        {
            int curr_char_idx = i + (j * c);
            if((j % 2) == 0)
            {
                
            }
            else
            {
                int last = (c - 1) + (j * c);
                curr_char_idx = last - i;
            }
            
            char ch;
            if(curr_char_idx >= L)
            {
                ch = 'X';
            }
            else
            {
                ch = a[curr_char_idx];
            }
            
            printf("%c", ch);
        }
    }
        
    return 0;
}