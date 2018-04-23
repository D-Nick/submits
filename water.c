#include <stdio.h>
#include <cs50.h>

int main (void)

{
    int bottles, ounces, minutes;
    {
        printf ("How many minutes did you spend in the shower?\n");
        minutes =  get_int();
        ounces = minutes * 192;
        bottles = ounces / 16;
        printf("You used %i bottles of water today\n", bottles);
    }
}
