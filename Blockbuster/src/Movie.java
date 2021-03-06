import java.util.ArrayList;

public abstract class Movie {
	
	String title;
	int runTime;
	ArrayList<String> scenes;
	
	public Movie(String title, int runTime, ArrayList<String> scenes) {
		super();
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}
	
	public void printInfo() {
		System.out.println("Movie title: " + title + "Runetime: " + runTime);
	}
	
	public void printScenes() {
		for(int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene " + i + ": " + scenes.get(i));		
		}
	}
	
	public abstract void play();
 
}
