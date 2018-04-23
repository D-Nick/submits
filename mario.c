#include <stdio.h>
#include <cs50.h>

int main (void)
{
    //Declare variables
    int height, rows, spaces, hashes;
    
    
    do 
    {
    printf ("How many hashes would you like the half pyramid to be??\n ");
    height = get_int();
    //prompt user for input
    break;
    } 
    while (height <= 23 || height>=0);
    while (height<0 || height>23)
    {
    printf ("Height must be less than 23 or greater than 0\n");
    height=get_int();
    } 
    
    
for (rows=0;rows<=height-1;rows++)
{
    
    for (spaces = rows+2; spaces<=height ; spaces++)
    {
        printf (" ");
    }
    for (hashes = rows+height; hashes >=height-1; hashes--)
    {
        printf ("#");
    }
    
    printf ("\n");
}

    
 
}