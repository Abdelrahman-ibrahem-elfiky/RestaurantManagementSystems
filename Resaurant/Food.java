package Resaurant;

import java.util.Scanner;

public class Food {
    public String name;
    public float price;
    public Food()
    {

    }
    public Food(String name,float price)
    {
        this.name=name;
        this.price=price;
    }
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Name Food");
        name=in.nextLine();
        System.out.println("Enter Price Food");
        price=in.nextFloat();
    }

    public void SetName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void SetPrice(float price)
    {
        this.price=price;
    }
    public void payment()
    {
        System.out.println("price:"+price);
    }
    public String details()
    {
        return name+"  "+price;
    }
    public void setPrice(float price)
    {
            this.price=price;
    }
public float getPrice()
{
    return price;
}






}
