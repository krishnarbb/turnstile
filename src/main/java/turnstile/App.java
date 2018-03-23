package turnstile;

public class App {

	public static void main(String ...args) {
		Turnstile turnstile = new Turnstile();
		
		turnstile.command("coin");
		turnstile.command("push");
		turnstile.command("push");
		
		
	}
}
