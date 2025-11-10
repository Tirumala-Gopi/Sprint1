package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class example {
	static Logger logger=LogManager.getLogger();
	
	public double returnTaxableRate(String salaryString)
	{
		double input=Double.parseDouble(salaryString);
		if(salaryString==null)
		{
			logger.fatal("salary if undefined");
		}
		else if(input<0)
		{
			logger.error("salary is negative");
			
		}
		else if(input==0)
		{
			logger.warn("0");
		}
		else if(input>1&&input<500000)
		{
			logger.info("1-500000");
		}
		else if (input>=1000000)
		{
			logger.debug("1000000 or above");
			
		}
		
		double tax=input+input*0.2;
		return tax;
		
		
		
	}
	
	
	
	
	
	
	
	
}

