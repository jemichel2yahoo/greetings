import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class GreetingImpl implements Greeting {
	public static void main(String a[]) {
		System.out.println(new GreetingImpl().getGreeting());
		System.out.println(new GreetingImpl().setGreeting("Hi!").getGreeting());
		SortedMap<String, Greeting> m = new TreeMap<String, Greeting>();
		m.put("en-US", new GreetingImpl().setGreeting("Hello"));
		m.put("tr-TR", new GreetingImpl().setGreeting("Merhaba"));
		for (Map.Entry<String, Greeting> e : m.entrySet()) System.out.println( e.getKey() + "\t" + e.getValue().getGreeting() );
		for (Greeting g : m.values()) System.out.println(g.getGreeting());
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
