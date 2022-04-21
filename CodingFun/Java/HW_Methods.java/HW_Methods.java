            
/**
* HW_Methods Assignment
*
* Martin Lillo
* 
*/
public class HW_Methods
{
    
        /**
        * Constructor for objects of class HW_Methods
        */
        public static void main(String[] args)
        {
            runProgramA();
            runProgramB();
        }

        public static void segment1()
        {      
      
            int ground, sum = 0;
            for (ground = 0; ground <= 6; ground++)
            {
                sum = sum + ground;
                System.out.println("||");
            }
        }
    
        public static void segment2()
        {
            int blocks, sum = 0;
            for (blocks = 0; blocks <= 2; blocks++)
            {
                sum = sum + blocks;
                System.out.println("||          |?|");
            }
        }
    
        public static void segment3()
        {
            int flag, sum = 0;
            for (flag = 0; flag <= 0; flag++)
            {
                sum = sum + flag;
                System.out.println("||              ^\n|----------------");
            }
        }
        
        public static void segment4()
        {
            int Mario = 1;
            System.out.println(">-<0");  
        }
        
        public static void segment5()
        {
            int coin, sum = 0;
            for (coin = 0; coin <= 2; coin++)
            {
                sum = sum + coin;
                System.out.println("@");
            }
        }
        
        public static void MarioBoard1()
        {
            segment1();
            segment1();
            segment1();
            segment1();
            segment3();
        }
                
        public static void MarioBoard2()
        {
            segment1();
            segment2();
            segment2();
            segment1();
            segment3();
        }
        
        public static void runProgramA()
        {
            MarioBoard1();
            MarioBoard2();
        }   
        
        public static void MarioBoard3()
        {
            segment4();
            segment5();
            segment5();
            segment2();
            segment3();
        }
    
        public static void runProgramB()
        {
            MarioBoard3();
        }
}
