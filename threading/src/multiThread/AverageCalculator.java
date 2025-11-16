package multiThread;

public class AverageCalculator {
	
	private long total;
	private long count;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public AverageCalculator(long total, long count) {
		super();
		this.total = total;
		this.count = count;
	}
	@Override
	public String toString() {
		return "AverageCalculator [total=" + total + ", count=" + count + "]";
	}
	
	
	public synchronized void  addToTotal(int number) {
		total=total+number;
		count++;
	}
	
	public double calculateAverage() {
		return (double)this.total/this.count;
	}
	public AverageCalculator() {
		super();
	}
	
	

}
