import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie{
	
	int sceneSelection;
	
	public DVD(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
	}

	public int getSceneSelection() {
		return sceneSelection;
	}

	public void setSceneSelection(int sceneSelection) {
		this.sceneSelection = sceneSelection;
	}

	Scanner scnr = new Scanner(System.in);

	@Override
	public void play() {
		System.out.println("Which of the following scenes would you like to view?");
		for (int i = 0; i < getScenes().size(); i++) {
			System.out.println("Selection: " + i + ". " + getScenes().get(i));
		}
		
		System.out.println("Scene selection: ");
		sceneSelection = scnr.nextInt();
		System.out.println ("You selected scene " + sceneSelection + ": " + getScenes().get(sceneSelection));
	}
	
	

}
