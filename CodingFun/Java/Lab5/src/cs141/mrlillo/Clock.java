/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class Clock {
	
	private int hours = 0;
	private int minutes = 0;
	private int seconds = 0;
	
	public Clock() {
		
		setHours(12);
		setMinutes(0);
		setSeconds(0);
	}
	
	public Clock(int hours, int minutes, int seconds) {
		
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Clock(int seconds) {
		
		setClock(seconds);
	}
	
	public void setClock(int seconds) {
		
		this.seconds = seconds;
		this.minutes = seconds / 60;
		this.hours = seconds / 3600;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public void tick() {
		this.seconds++;
	}
	
	public void tickDown() {
		this.seconds--;
	}
	
	// I am not sure how I need to add/subtract the times of the two clock objects
	public void addClock(Clock clockName) {
		int sum = this.seconds += this.seconds;
		System.out.println("Clock sum: " + sum);
	}
	
	public void subtractClock(Clock clockName) {
		int difference = this.seconds -= this.seconds;
		System.out.println("Clock difference: " + difference);
	}
	
	public String toPrint() {
		
		String time;
		time = "(" + String.format("%02d",this.hours) + ":" + String.format("%02d",this.minutes) + ":" + String.format("%02d",this.seconds) + ")";
		return time;
	}

}
