package abcFactory;

public class Order {

	int orderId = 1;
	int orderAmount;
	double total;
	double totalPaid;
	double vat = 0.05;

	Order(int orderAmount) {

		this.orderAmount = orderAmount;
		this.bill();
		
	}

	public void bill() {

		if (orderAmount > 5000) {
			System.out.println("Order is Confirmed");
			
			this.orderNumId();

			total = (orderAmount * 200);
			totalPaid = total + (vat * total);
			System.out.print("Your total bill is: " + totalPaid);
			

		}
		
		else {
			System.out.println("Order is denied");
		}

	}
	
	public void orderNumId() {
		
		System.out.println("Your Order Id is: " + orderId);
		orderId++;
	}
}
