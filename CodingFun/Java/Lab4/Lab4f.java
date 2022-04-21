/**
 * Martin Lillo
 */
public class Lab4f 
{
  public static void main(String[] args) 
  {
    String quack = "------/XMMMM::-------------------------------------:---/XnMM!MMMMM:------------------------------------:/X:MMnnM:MMMMMMn-----------------------------------:!!nn:X!MMMMMMMMM-----------------------------------:-------!!!!MMMMMX----------------------------------:-----------!nMMMM:---------------------------------:------------!MMMMX---------------------------------:-------------nMMMMX:-------------------------------:--------------MMMMMMX:::---------------------------:--------------MMMMMMMMMMMMMX:X::-------------------:--------------MMMMMMMMMMMMMMMMMMM:::---------------:--------------MMMMMMnMMMMMMMMMMMMMMMX:::-------::n-:--------------MMMMMMXMMMMMMMMMMMMMnMMMMMMMnMMMMnM--:--------------nMMMMMMnMMMMMMMMMMMMMMM:nnnXnnnXXn!--:--------------!nMMMMMMMnMMMMnXMMnMX:MMMn!XnnMn!----:---------------!nMMMMMMXMXXMMXnnMXXnnnnXMMn!!------:-----------------!MMMMMMMMXMXnnnMMMMMMMMMM!--------:------------------!!MMMMMMMMMMMMMMMMMMMMM!---------:---------------------!nMMMMMMMMMMMMMMMM!!----------:-----------------------!!nMMMMMMMMMMM!!------------:--------------------------!nMMMMMM!!!--------------:-----------------------------:---------------------:-----------------------------n---------------------:----------------------------nn---------------------:-----------------------/::X:M!---------------------:----------------------/XXMMn!----------------------:------------------------!!!------------------------:";
    
    for (int row = 0; row < 27; row++)  
    {
        for (int character = 0; character < 52; character++)
        {
            int offset = row * 52; 
            System.out.print(quack.charAt(character + offset)); 
        }
        System.out.println();
    }
  }
}
