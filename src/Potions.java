public class Potions extends Location {
	String next;
	Reader reader;

	Potions(Reader reader) {
		super("Potions Classroom");
		this.reader = reader;
	}

	public synchronized String look() {
		System.out.println(
				"Potions is one of the core subjects that first year students are required to study. Professor Snape is here.");

		next = reader.nextLine();
		next = next.toLowerCase();
		if (next.contains("mischief managed"))
			return next;
		while (!useList(commands, next)) {
			System.out.println("That is not a valid command!");

			next = reader.nextLine();
			next = next.toLowerCase();
		}
		return next;
	}

}
