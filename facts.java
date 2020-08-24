import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class facts {

	public static void facts(int x) {
		// method to represent the facts with the parameter to print each quote on a
		// specific date
		String[] facts = new String[31];
		// Facts is set to a string with array

		facts[0] = "The Eiffel Tower can be 15 cm taller during the summer";
		// Facts for Day 1
		facts[1] = "Babies have around 100 more bones than adults";
		// Facts for Day 2
		facts[2] = "20% of Earth’s oxygen is produced by the Amazon rainforest";
		// Facts for Day 3
		facts[3] = "Some metals are so reactive that they explode on contact with water";
		// Facts for Day 4
		facts[4] = "A teaspoonful of neutron star would weigh 6 billion tons";
		// Facts for Day 5
		facts[5] = "Hawaii moves 7.5cm closer to Alaska every year";
		// Facts for Day 6
		facts[6] = "Chalk is made from trillions of microscopic plankton fossils";
		// Facts for Day 7
		facts[7] = "In 2.3 billion years it will be too hot for life to exist on Earth";
		// Facts for Day 8
		facts[8] = "Polar bears are nearly undetectable by infrared cameras";
		// Facts for Day 9
		facts[9] = "It takes 8 minutes, 19 seconds for light to travel from the Sun to the Earth";
		// Facts for Day 10
		facts[10] = "If you took out all the empty space in our atoms, the human race could fit in the volume of a sugar cube";
		// Facts for Day 11
		facts[11] = "Stomach acid is strong enough to dissolve stainless steel";
		// Facts for Day 12
		facts[12] = "The Earth is a giant magnet";
		// Facts for Day 13
		facts[13] = "Venus is the only planet to spin clockwise";
		// Facts for Day 14
		facts[14] = "A flea can accelerate faster than the Space Shuttle";
		// Facts for Day 15
		facts[15] = "Water can boil and freeze at the same time";
		// Facts for Day 16
		facts[16] = "Lasers can get trapped in a waterfall";
		// Facts for Day 17
		facts[17] = "You can prove Pythagoras' theorem with fluid";
		// Facts for Day 18
		facts[18] = "There is enough DNA in the average person’s body to stretch from the sun to Pluto and back — 17 times";
		// Facts for Day 19
		facts[19] = "The average human body carries ten times more bacterial cells than human cells";
		// Facts for Day 20
		facts[20] = "At over 2,000 kilometers long, The Great Barrier Reef is the largest living structure on Earth";
		// Facts for Day 21
		facts[21] = "In an entire lifetime, the average person walks the equivalent of five times around the world";
		// Facts for Day 22
		facts[22] = "You can’t taste food without saliva";
		// Facts for Day 23
		facts[23] = "Octopuses have three hearts, nine brains, and blue blood";
		// Facts for Day 24
		facts[24] = "Scientists estimate that 50-80% of the oxygen production on Earth comes from the ocean.";
		// Facts for Day 25
		facts[25] = "A cloud can weigh over a million pounds";
		// Facts for Day 26
		facts[26] = "Only two letters don’t appear in the periodic table: J and Q";
		// Facts for Day 27
		facts[27] = "Hot water freezes faster than cold water";
		// Facts for Day 28
		facts[28] = "Water can exist in three states at once";
		// Facts for Day 29
		facts[29] = "It’s impossible to burp in space";
		// Facts for Day 30
		facts[30] = "Uranus is the only planet in our solar system that rolls on its side like a barrel";
		// Facts for Day 31

		System.out.println(facts[x]);
		// prints out the facts
	}

	static int k = 0;
	// initializes the variable once

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Timer timer = new Timer();
		// sets a new timer
		TimerTask t = new TimerTask() {
			// sets a new timer task
			public void run() {
				// runs the code every 24 hours
				String fact;
				// initializes the variable
				System.out.println("Do you want know a fun fact?");
				fact = in.next();
				// prompt the user if they want to know about a fun fact
				if (k <= 30) {
					if (fact.equals("yes") || fact.equals("Yes")) {
						// checks if the user said yes
						facts(k);
						// prints the facts
						k++;
						// Increments the variable
					} else {
						System.out.println("No, fun fact for today.");
						k++;
					}
				} else {
					// runs the code if the user said anything except yes
					timer.cancel();
					// timer is cancelled
					timer.purge();
					// timer is removed
				}
			}
		};
		timer.schedule(t, 0l, 1000 * 3600);
		// the timer is set to 24 hours so every 24 hours a new quote is printed
		// change the 3600 seconds to 10 second to execute the code in a second
	}
}
