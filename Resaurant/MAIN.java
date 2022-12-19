package Resaurant;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args)
    {
        ManageFood manageFood=new ManageFood();
        Scanner in=new Scanner(System.in);
        int select;
        //menu main
        do {
            MenuMain();
            select= in.nextInt();
            switch (select)
            {
                case 1:
                {
                    do {
                        MenuManageFood();
                        select=in.nextInt();
                        switch (select)
                        {
                            case 1:
                                manageFood.AddFood();
                                break;
                            case 2:
                                manageFood.EditFood();
                                break;
                            case 3:
                                manageFood.DeleteFood();
                                break;
                            case 4:
                                manageFood.print();
                                break;
                        }
                    }while (select!=0);
                }
                break;
                case 2:
                {
                    do {
                        MenuManageOrder();
                        select=in.nextInt();
                        switch (select)
                        {
                            case 1:
                                manageFood.OrderPrice();
                                break;
                        }

                    }while (select!=0);
                }
                break;

            }
        }while (select!=3);

    }
     static void MenuMain()
    {
        System.out.println("---------MenuMain---------");
        System.out.println("1-ManageFood");
        System.out.println("2-ManageOrder");
        System.out.println("3-Exit");
        System.out.println("-----------------------------\n"+"\n" +"what is your choice");
    }
     static void MenuManageFood()
    {
        System.out.println("---------MenuManageFood---------");
        System.out.println("0-Back to menu main");
        System.out.println("1-AddFood");
        System.out.println("2-EditFood");
        System.out.println("3-DeleteFood");
        System.out.println("4-Print");
        System.out.println("-----------------------------\n"+"\n" +"what is your choice");
    }
     static void MenuManageOrder()
     {
         System.out.println("---------MenuManageOrder---------");
         System.out.println("0-Back to menu main");
         System.out.println("1-print menu food and order");
         System.out.println("-----------------------------\n"+"\n" +"what is your choice");
     }
}
