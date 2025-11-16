package multiThread;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderThread extends Thread {
	
	private AverageCalculator averageCalculator;
	private String fileName;
	public AverageCalculator getAverageCalculator() {
		return averageCalculator;
	}
	public void setAverageCalculator(AverageCalculator averageCalculator) {
		this.averageCalculator = averageCalculator;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "FileReaderThread [averageCalculator=" + averageCalculator + ", fileName=" + fileName + "]";
	}
	public FileReaderThread(AverageCalculator averageCalculator, String fileName) {
		super();
		this.averageCalculator = averageCalculator;
		this.fileName = fileName;
	}
	@Override
	public void run() {
	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

	        String line;
	        while ((line = br.readLine()) != null) {

	            // (a) Split each line by comma ","
	            String[] parts = line.split(",");

	            // (b) Convert each part into an int and add to calculator
	            for (String p : parts) {
	                int number = Integer.parseInt(p.trim());
	                averageCalculator.addToTotal(number);
	            }
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	//"C:\temp\TestRecord.txt"
	
	

}
