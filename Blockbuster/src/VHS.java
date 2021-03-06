import java.util.ArrayList;

public class VHS extends Movie{
	
	int currentTime;
	
	public VHS(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	@Override
	public void play() {
		
		if(currentTime > (getScenes().size() - 1)) {
			rewind();
		}
		
		System.out.println("Current time " + currentTime + ", Scene: " + getScenes().get(currentTime));
		currentTime++;	
	}
	
	public void rewind() {
		currentTime = 0;
	}
	
	@Override
	public String toString() {
		return "Title; " + title + " Runetime: " + runTime;
	}
}
