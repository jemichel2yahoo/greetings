public class GreetingImpl implements Greeting {
	public static void main(String a[]) {
		switch (new GreetingImpl().getGreeting()) {
			case Greeting.defaultGreeting:
				System.out.println(0b0000_0001L);
				break;
			default:
				System.out.println(0b0000_0000L);
				break;
		}
		System.out.println(new GreetingImpl().getGreeting());
		System.out.println(new GreetingImpl().setGreeting("Hi!").getGreeting());
		java.util.Map<String, Greeting> m = new java.util.TreeMap<>();
		m.put("tr-TR", new GreetingImpl().setGreeting("Merhaba"));
		m.put("en-US", new GreetingImpl().setGreeting("Hello"));
		for (Greeting g : m.values()) System.out.println(g.getGreeting());
		for (java.util.Map.Entry<String, Greeting> e : m.entrySet()) System.out.println( e.getKey() + "\t" + e.getValue().getGreeting() );
	}

	public String getGreeting() {
		return greeting;
	}

	public Greeting setGreeting(String greeting) {
		this.greeting = greeting;
		return this;
	}

	private String greeting = defaultGreeting;
}
