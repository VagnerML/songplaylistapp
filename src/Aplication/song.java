package Aplication;

public class song {
	String title;
	double duration;
	
	public song(String title, double duration) {
		
		this.title = title;
		this.duration = duration;
	}
	public song() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "song"
				+ " [title=" + title + ", "
						+ "duration=" + duration + "]";
	}
	
	

}
