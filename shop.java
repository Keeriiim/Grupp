import java.util.Scanner;

public class shop {
    Scanner scan = new Scanner(System.in);
    private int choice;
    private boolean shopMenu;


    public shop(){}



    public void shopMenu(){
        this.shopMenu = true;
        while(shopMenu){
        System.out.println("! Welcome to the secret shop !");
        System.out.println("1.Shop\n2.exit\n");
        System.out.print("Your choice: ");
        this.choice = scan.nextInt();

        switch(choice){
            case 1:

            break;


            case 2:
            System.out.println("See you next time!");
            this.shopMenu = false;
            break;
        }




    }
}




}
