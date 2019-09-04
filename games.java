
import java.util.Scanner;

class first
{
        void act1()
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hello there, you look a little worried.");
                try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {}
        System.out.println("Are you fine? Let me know.(Y/N)");
        String ans = sc.nextLine();
        if (ans.equals("Y"))
        {
                System.out.println("You are? It doesn't seem so. What's your name?");
                String name = sc.nextLine();
                System.out.println("Intersting name,..." +name +"...Why do i feel i've heard it before?");
                try
                {
                 Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {}
                System.out.println("" +name +"... " +name +" ..." +name +" ...");
                try
                {
                 Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {}
                System.out.println("...Oh wait. I remember now.");
                try
                {
                 Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {}
                System.out.println("You killed my mother." );
                try
                {
                 Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {}
                System.out.println("~~You get bloodlet by RAZORKILLER and you die. \nYou died with 0 Diams and 0 Membrones. \nThe end.~~)");

        }
        else
        {
                System.out.println("I can heal you.");
                System.out.println("Do you want me to help?(Y/N)");
                String yn = sc.nextLine();
                if (yn.equals("N"))
                        {
                            System.out.println("Fine, I'll be on my way. Take some gowi with you, and feel better.");
                            try
                {
                 Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {}
                            System.out.println("You got 20 gowi! You can use this to increase health by 20 points.");
                            try
                {
                 Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {}
                            System.out.println("RAZORKILLER leaves");
                            try
                {
                 Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {}
                        
                            System.out.println("Act one finished. Would you like to proceed to Act 2?");
                        } 
                else    {
                            System.out.println("Good. Now everything will be alright");
                            try
                {
                 Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {}
                            System.out.println("~~You died.~~");
                                       try
                {
                 Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {}
                            System.out.println("~~RAZORKILLER accidentally kills you with his razor hands while trying to help you up. "
                                    + "\nYou died with 0 Diams and 0 Membrones. \nThe end.~~");
                        }
                
        }

        }
}

public class Games
{
        public static void main(String[] args) {
                first f = new first();
                f.act1();
        }
}
