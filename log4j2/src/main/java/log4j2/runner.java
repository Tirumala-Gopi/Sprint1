package log4j2;

public class runner {
	public static void main(String[] args) {
		
		System.out.println("logger name "+ example.logger.getName());
		example.logger.debug("started");
		
		String salaryString="1";
		example obj=new example();
		obj.returnTaxableRate(salaryString);
		example.logger.debug("ended");
		
		
	}

}
