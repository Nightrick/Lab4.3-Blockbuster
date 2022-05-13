import java.util.ArrayList;
import java.util.Arrays;

public class Blockbuster {

	public static void main(String[] args) {
		
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
		
		
	

	}

}
