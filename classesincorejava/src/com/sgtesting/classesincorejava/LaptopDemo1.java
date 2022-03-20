package com.sgtesting.classesincorejava;

class Desktop
{
	String companyname;
	String color;
	int modelnumber;
	int price;
}

class laptop
{
	String companyname;
	String color;
	int modelnumber;
	int price;
}

class mobiledevice
{
	String companyname;
	String color;
	int modelnumber;
	int price;
}

public class LaptopDemo1
{

	public static void main(String[] args) 
	{
		Desktop pc=new Desktop();
		pc.companyname="Dell Optiplex";
		pc.color="Black";
		pc.modelnumber=3020;
		pc.price=25000;
		System.out.println("Company Name: "+pc.companyname);
		System.out.println("Color: "+pc.color);
		System.out.println("Model Number: "+pc.modelnumber);
		System.out.println("Price: "+pc.price);
		System.out.println("+++++++++++");
		laptop mc=new laptop();
		mc.companyname="Acer Aspire";
		mc.color="silver";
		mc.modelnumber=1115;
		mc.price=30000;
		System.out.println("Company Name: "+mc.companyname);
		System.out.println("Color:"+mc.color);
		System.out.println("Model Number:"+mc.modelnumber);
		System.out.println("Price:"+mc.price);
		System.out.println("++++++++++++");
		mobiledevice sp=new mobiledevice();
		sp.companyname="Realme";
		sp.color="Red";
		sp.modelnumber=50  ;
		sp.price=20000;
		System.out.println("company name:"+sp.companyname);
		System.out.println("color:"+sp.color);
		System.out.println("Model Number:"+sp.modelnumber);
		System.out.println("Price:"+sp.price);
		System.out.println("+++++++++++");
	}

}
