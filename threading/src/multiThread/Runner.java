package multiThread;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		AverageCalculator averageCalculator = new AverageCalculator();
//		String fileName="C:\\temp\\TestRecord.txt";
//		FileReaderThread fileReaderThread=new FileReaderThread(averageCalculator,fileName);
//
//		fileReaderThread.start();
//		fileReaderThread.join();
//		
//		
//		System.out.println(averageCalculator.getTotal());
//		System.out.println(averageCalculator.getCount());
//		System.out.println(averageCalculator.calculateAverage());

		String fileName1 = "C:\\temp\\records1.txt";
		String fileName2 = "C:\\temp\\records2.txt";

		FileReaderThread fileReaderThread1 = new FileReaderThread(averageCalculator, fileName1);
		FileReaderThread fileReaderThread2 = new FileReaderThread(averageCalculator, fileName2);

		fileReaderThread1.start();
		fileReaderThread2.start();
		fileReaderThread1.join();
		fileReaderThread2.join();

//		System.out.println(averageCalculator.getTotal());
//		System.out.println(averageCalculator.getCount());
//		System.out.println(averageCalculator.calculateAverage());

		Thread currentTotalThread=new Thread(()->{;
		
		while(true) {
			System.out.println(averageCalculator.getTotal()+" and "+averageCalculator.getCount()+" and "+averageCalculator.calculateAverage());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				break;
			}
			
		}
		
		
	});
		currentTotalThread.start();
		currentTotalThread.interrupt();

}}
