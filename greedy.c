#include <stdio.h>
#include <cs50.h>
#include <math.h>

int main (void)
{
    int quarter, dime, nickel, penny, count, change;
    float igetsfloats;
    count = 0;
do
    {printf ("How much change ya got?\n");
        igetsfloats = get_float();
        break;
    }
    while (igetsfloats<0);
igetsfloats *= 100.0;
change = (int) round(igetsfloats);
quarter =25;
while (quarter<=change)
{
 change=change - quarter;
 count=count + 1;
}


dime = 10;
while (dime<=change)
{
 change=change - dime;
 count=count + 1;}


nickel = 5;
while (nickel<=change)
{
 change=change - nickel;
 count=count + 1;}


penny = 1;
while (penny<=change)
{
 change=change - penny;
 count=count + 1;}


printf ("Here's your %i coins\n", count);
}