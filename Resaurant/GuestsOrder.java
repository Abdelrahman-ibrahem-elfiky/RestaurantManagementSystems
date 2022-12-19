package Resaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestsOrder {
    public int IdTable;
    ArrayList<Food> EatList=new ArrayList<Food>();
    public float TotalPayment;

    public int getIdTable()
    {
       return IdTable;
    }
    public void setEatList(Food food)
    {
        EatList.add(food);

    }
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number table");
        IdTable=in.nextInt();

    }
    public void setTotalPayment(float totalPayment)
    {
        this.TotalPayment=totalPayment;
    }

    public void print()
    {
        System.out.println("-----------------------------");
        System.out.println("IdTable:"+this.IdTable+"\n"+"TotalPayment:"+this.TotalPayment);
        for (Food f:EatList)
        {
            System.out.println("select food is "+f.name);
        }
        System.out.println();
    }
}
