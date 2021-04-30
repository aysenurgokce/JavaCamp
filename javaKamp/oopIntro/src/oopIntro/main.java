package oopIntro;

public class main {

	public static void main(String[] args) {
	
	    Product product1 = new Product(1,"Lenovo V14",15000,"32GB Ram",10); // referans oluþturma,intance
	    
		
	    Product product2 = new Product(); 
	    product2.setId(2);
	    product2.setName("Lenovo V15");
	    product2.setDetail("16 GB Ram");
	    product2.setDiscount(10);
	    product2.setUnitPrice(16000);
	   
	    System.out.println(product2.getUnitunitPriceDiscount());
	    
	    Category category =new Category();
	    category.setId(1);
	    category.setName("Ýçecek");
	    
	    Category category1 =new Category();
	    category1.setId(2);
	    category1.setName("Yiyecek");

	    System.out.println(category.getName());
	    System.out.println(category1.getName());
	    		
	    
	}

}
