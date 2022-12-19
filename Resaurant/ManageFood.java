package Resaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood {

    ArrayList<Food> FoodList=new ArrayList<Food>();
    ArrayList<GuestsOrder> guestsOrders=new ArrayList<GuestsOrder>();
    int SelectFood;
    Scanner in=new Scanner(System.in);
    public void  AddFood()
    {
        System.out.println("Enter Number Food");
        int n= in.nextInt();
        for (int i=0;i<n;i++)
        {
            Food food=new Food();
            food.input();
            FoodList.add(food);
        }
    }
    public void print()
    {
        for (int i=0;i<FoodList.size();i++)
        {
            System.out.println(i+1+" "+FoodList.get(i).details());
        }
    }
    public void OrderPrice()
    {
        float PriceFood=0;
        float TotalPayment=0;
        int number;
        GuestsOrder guest=new GuestsOrder();
        guest.input();
        guestsOrders.add(guest);
        print();
        for (int i=0;i<5;i++)
        {
            System.out.println("--->choice Order "+(i+1));
            SelectFood=in.nextInt();
            if(SelectFood==0)
            {
                guest.setTotalPayment(TotalPayment);
                System.out.println("TotalPayment: "+TotalPayment+"\n Thank you, see you again");
                break;
            }
            else
            {
                System.out.println("Enter number food");
                number=in.nextInt();
                Food food=FoodList.get(SelectFood-1);
                guest.setEatList(food);
                PriceFood= food.price*number;
            }
            TotalPayment+=PriceFood;
            guest.setTotalPayment(TotalPayment);
            System.out.println("Order Finish\n"+"paymen: "+PriceFood+"\n finis order enter 0");

        }
    }
    public void printOrder()
    {
        for (int i=0;i<guestsOrders.size();i++)
        {
            guestsOrders.get(i).print();

        }
    }
    public String EditName()
    {
        Scanner input =new Scanner(System.in);
        String newname;
        System.out.println("Enter new name food");
       newname=input.nextLine();
        return newname;
    }
    public float EditPrice()
    {
        Scanner input =new Scanner(System.in);
        float newprice;
        System.out.println("Enter new price food");
        newprice=input.nextFloat();
        return newprice;
    }
public void EditFood()
{
    int flag=0;
    String setname;
    Scanner input =new Scanner(System.in);
    //editname
    System.out.println("Enter Name Food to fix");
     setname=input.nextLine();
    for (int i=0;i<FoodList.size();i++)
    {
        if (FoodList.get(i).getName().equals(setname))
        {
            FoodList.get(i).SetName(EditName());
            FoodList.get(i).setPrice(EditPrice());
            flag++;
        }
    }
    if (flag==0)
         System.out.println("not food name:"+setname);


}

public void DeleteFood()
{
    int flag=0;
    System.out.println("Enter Name Food to delete");
    String name=in.nextLine();
    for (int i=0;i<FoodList.size();i++)
    {
        if (FoodList.get(i).getName().equals(name))
        {
            FoodList.remove(i);
            System.out.println("delete finish");
            flag++;
        }
    }
    if (flag==0)
        System.out.println("not food name:"+name);

}


}
