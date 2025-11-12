package junit;

public class checkout {
	
	public double calculatePrice(Basket basket) {
		
		if(basket.getBooks().size()==0) {
			return 0.0;
		}
		else
		{
			double price=0.0;
			
			for(Book tempBook:basket.getBooks())
			{
			price=price+tempBook.getPrice();
			}
			if(basket.getBooks().size()==3)
			{
				price=price-(price*0.01);
				price=Math.round(price*100.0)/100.0;
			}
			if(basket.getBooks().size()==7)
			{
				price=price-(price*0.02);
				price=Math.round(price*100.0)/100.0;
			}
			if(basket.getBooks().size()==10)
			{
				price=price-(price*0.13);
				price=Math.round(price*100.0)/100.0;
			}
			return price;
		}
		
	
		
		
	}

}
