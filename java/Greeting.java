/**
 * This interface allows read write access to a greeting String and a defaultGreeting constant.
 */
public interface Greeting {
	public String getGreeting();

	public Greeting setGreeting(String greeting);

	static final String defaultGreeting = "hello, world";  // See K&R 1978 page 6.
}
