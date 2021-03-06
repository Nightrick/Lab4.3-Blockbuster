import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Blockbuster {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int userMovieSelection;
		String userContinue = "y";
		
		ArrayList<String> peachScenes = new ArrayList<>(Arrays.asList("James is poor", "James finds a magic peach", "Holy sh@t the peach is huge", "he has an adventure and comes home"));
		ArrayList<String> starWarsScenes = new ArrayList<>(Arrays.asList("Luke is poor", "Aunt and Uncle get vaporized", "Crazy old man takes him on an adventure", "Saves the princess", "Holy sh@t, nice shot on that death star, bro. Here's a medal"));
		ArrayList<String> annieScenes = new ArrayList<>(Arrays.asList("Annie is poor", "It's a hard-knock life", "She meets this old rich guy", "He adopts her", "Holy sh@t, the suns coming out tomorrow."));
		ArrayList<String> terminatorScenes = new ArrayList<>(Arrays.asList("This random girl is poor", "holy crap, this robot wants to kill her", "guy her son sent back in time saves the day", "holy sh@t, they killed the robot"));
		ArrayList<String> matrixScenes = new ArrayList<>(Arrays.asList("Neo is poor (spiritually)", "This random dude gives him a pill and he trips hard", "Wait, he's  the chosen one???", "Holy sh@t, yup, he is, cause he just stopped bullets with his hand and exploded a guy by jumping through him"));
		ArrayList<String> avengersScenes = new ArrayList<>(Arrays.asList("Tony Stark is not poor", "He gets this crew of misfits together to beat up this blonde dude's brother", "They bash that guy's brother so good it destroys New York", "Holy sh@t, they definitely assembled at some point, so that'll probably play big in a later movie"));
		
		ArrayList<Movie> movies = new ArrayList<>();
		
		movies.add(new VHS("James and the Giant Peach", 119, peachScenes));
		movies.add(new VHS("Star Wars", 122, starWarsScenes));
		movies.add(new VHS("Annie", 154, annieScenes));
		movies.add(new DVD("Terminator", 129, terminatorScenes));
		movies.add(new DVD("The Matrix", 110, matrixScenes));
		movies.add(new DVD("Avengers", 115, avengersScenes));
		
		do {
		printMenu();
		userMovieSelection = scnr.nextInt();
		
		if(userMovieSelection == 1) {
			movies.get(userMovieSelection - 1).play();	
		} else if (userMovieSelection == 2) {
			movies.get(userMovieSelection - 1).play();
		} else if (userMovieSelection == 3) {
			movies.get(userMovieSelection - 1).play();
		} else if (userMovieSelection == 4) {
			movies.get(userMovieSelection - 1).play();
		} else if (userMovieSelection == 5) {
			movies.get(userMovieSelection - 1).play();
		} else if (userMovieSelection == 6) {
			movies.get(userMovieSelection - 1).play();
		}
		
		if(userMovieSelection > 0 && userMovieSelection <= 3) {
			System.out.println("You've selected a VHS. To continue watching the movie, you'll have to select it again from the menu. Outdated technology, right?");
		} else {
			System.out.println("You've also selected a DVD. Wise. It's much more advanced!");
		}
		
		System.out.print("Would you like to chose another movie to play? You can select the same movie again to continue a VHS or choose a new scene to watch on a DVD! (y/n): ");
		userContinue = scnr.next();
		System.out.println();
	
		
		} while (userContinue.equals("y"));
		
	System.out.println("Thank you for choosing Blockbuster! Come again soon!");

	}
	
	public static void printMenu() {
		System.out.println("Hello! Please select a movie below to play!");
		System.out.println("1. James and the Giant Peach");
		System.out.println("2. Star Wars");
		System.out.println("3. Annie");
		System.out.println("4. Terminator");
		System.out.println("5. The Matrix");
		System.out.println("6. Avengers");
		System.out.print("Which movie would you like? (1-6): ");
	}

}
