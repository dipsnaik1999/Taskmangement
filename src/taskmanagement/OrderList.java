package taskmanagement;

// Import necessary classes for date handling
import java.time.LocalDate;

	// Define the CustomerOrder class
	   public class OrderList {
		   
	    // Attributes for order ID, customer, and order date  
	    private String orderlist;
	    private String customername;
	    private LocalDate orderDate;

	    // Constructor to initialize the CustomerOrder object
	    public void Order(String orderlist, String customername, LocalDate orderDate) {
	        this.orderlist = orderlist;
	        this.customername = customername;
	        this.orderDate = orderDate;
	    }

	    // Getter for order ID
	    public String getOrderId() {
	        return orderlist;
	    }

	    // Getter for customer
	    public String getCustomer() {
	        return customername;
	    }

	    // Getter for order date
	    public LocalDate getOrderDate() {
	        return orderDate;
	    }

	    // Method to display order details
	    public void displayOrderDetails() {
	        System.out.println("Order ID: " + orderlist);
	        System.out.println("Customer: " + customername);
	        System.out.println("Order Date: " + orderDate);
	    }

		public void add(String string) {
			// TODO Auto-generated method stub
			
		}

		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void remove(int i) {
			// TODO Auto-generated method stub
			
		}

		public String getOrderlist() {
			return orderlist;
		}

		public void setOrderlist(String orderlist) {
			this.orderlist = orderlist;
		}

		public String get(int i) {
			// TODO Auto-generated method stub
			return null;
		}

		public void remove1(int i) {
			// TODO Auto-generated method stub
			
		}
	}


