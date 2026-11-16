package com.oops.food;

public abstract class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	
	public Order(int orderId,String customerName,int quantity) {
		this.orderId=orderId;
		this.customerName=customerName;
		this.quantity=quantity;
	}
	
	public void setOrderId(int orderId) {
		this.orderId=orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	
	public void setCustomername(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getQuantity() {
		return quantity;
	}

public abstract void placeOrder();
public abstract double calculateBill();
public abstract void displayDetails();

}

class PizzaOrder extends Order implements FoodOrder{

	public PizzaOrder(int orderId, String customerName, int quantity) {
		super(orderId, customerName, quantity);

	}

	@Override
	public void placeOrder() {
		System.out.println("Pizza order placed successfully");

	}

	@Override
	public double calculateBill() {
		return getQuantity()*120;
	}

	@Override
	public void displayDetails() {
		System.out.println("Order Id:" +getOrderId());
		System.out.println("Customer Name:" +getCustomerName());
		System.out.println("Quantity:" +getQuantity());
		System.out.println("Order Item:Pizza");
		System.out.println("Total Amount:" +calculateBill());
	}
}

class BurgerOrder extends Order implements FoodOrder{

	public BurgerOrder(int orderId, String customerName, int quantity) {
		super(orderId, customerName, quantity);
	}

	@Override
	public void placeOrder() {
		System.out.println("Burger order placed successfully");
	}

	@Override
	public double calculateBill() {
		return getQuantity()*150;
	}

	@Override
	public void displayDetails() {
		System.out.println("Order Id:" +getOrderId());
		System.out.println("Customer Name:" +getCustomerName());
		System.out.println("Quantity:" +getQuantity());
		System.out.println("Order Item:Burger");
		System.out.println("Total Amount:" +calculateBill());
	}
}

class BiryaniOrder extends Order implements FoodOrder{

	public BiryaniOrder(int orderId, String customerName, int quantity) {
		super(orderId, customerName, quantity);
	}

	@Override
	public void placeOrder() {
		System.out.println("Biryani order placed successfully");
	}

	@Override
	public double calculateBill() {
		return getQuantity()*180;
	}

	@Override
	public void displayDetails() {
		System.out.println("Order Id:" +getOrderId());
		System.out.println("Customer Name:" +getCustomerName());
		System.out.println("Quantity:" +getQuantity());
		System.out.println("Order Item:Biryani");
		System.out.println("Total Amount:" +calculateBill());
	}
}
