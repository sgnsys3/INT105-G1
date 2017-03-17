public class Stopwatch{
	private long startTime;
	private long endTime;
	
	public void setStartTime(long startTime){
		this.startTime = startTime;
	}
	public void setEndTime(long endTime){
		this.endTime = endTime;
	}
	public long getStartTime(){
		return startTime;
	}
	public long getEndTime(){
		return endTime;
	}
	public Stopwatch(){
		startTime = System.currentTimeMillis();
	}
	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	public long getElapsedTime(){
		return endTime - startTime;
	}
	
}