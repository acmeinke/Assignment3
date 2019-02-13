package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        new Main().Ninety_Nine_Bottles_of_Beer();

        }
    public void Ninety_Nine_Bottles_of_Beer(){
                for (int beerCount=99; beerCount>-1;)
        {
            System.out.print(beerCount + " bottles of beer on the wall, ");
            System.out.println(beerCount + " bottles of beer, ");
            if (beerCount==0)
            {
                System.out.print("Go to the store, buy some more, ");
                System.out.println("99 bottles of beer on the wall.\n");
                System.exit(0);
            }
            else
                System.out.print("Take one down, pass it around, ");
            String s;
            s = (--beerCount == 1)?"":"s";
            System.out.println(beerCount + " bottles of beer on the wall.\n");
        }
    }
}
