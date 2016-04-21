package com.ebay.phonePrice;

import java.util.Scanner;

import org.testng.annotations.*;

public class AppTest  {
    
   App items;
   @BeforeMethod
   public void objectCreation()
   {
	  items= new App(); 
   }
   
   @Test
   public void details( )
   
   {
	   String item;
	   int num;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the item name");
	   item=sc.nextLine();
	   System.out.println("Enter the no of info");
	   num=sc.nextInt();
	   items.phonePrice(item, num);
	   
   }
}
