package Laioffer;

public class Car {
	public final String brand;
	public final String model;
	public static int year;
	public static int mileage;
	public static int plate_number;
	public static String color;
	public static String owner;
	private static final String GREETINGS = "Welcome to Drive me!";
	
	public Car(String brand, String model){
		this.brand = brand;
		this.model = model;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year = year; //why there is a yellow break line?
	}
	
	public void setMileage(int mileage){
		this.mileage = mileage;
	}
	
	public void plate_number(int num){
		plate_number = num;
	}
	
	public void color(String color){
		this.color = color;
	}
	
	public void owner(String owner){
		this.owner = owner;
	}
	
	public void welcome(){ // cannot add "static" here, because the function ask a final variable "brand".
		System.out.println(GREETINGS + "My brand is " + brand + ".");
	}
	
	public static void main(String[] args){
		Car benz = new Car("BENZ","S350");
		benz.setYear(3);
		benz.setMileage(10000);
		benz.color("Black");
		benz.owner("Mr.Zhao");
		
		benz.welcome();
		System.out.println(benz.year);
		System.out.println(benz.mileage);
		System.out.println(benz.color);
		System.out.println(benz.owner);
	}
	
	
}
