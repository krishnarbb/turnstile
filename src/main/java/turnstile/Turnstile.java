package turnstile;

import fsm.FSM;

public class Turnstile {
	private FSM brain;
	
	private String input;
	
	public Turnstile() {
		brain = new FSM();
		brain.setState(this::locked);
	}
	
	public void locked() {
		if (input.equalsIgnoreCase("coin")) {
			//entry action
			System.out.println("coin inserted");
			System.out.println("turnstile Unlocked, the customer can push through.");
			
			//transition
			brain.setState(this::unLocked);
			
			//exit action
		}
		
		if (input.equalsIgnoreCase("push")) {
			//entry action
			System.out.println("Put a coin to push through.");
			
			//transition
			brain.setState(this::locked);
			
			//exit action
		}
	}
	
	public void unLocked() {
		if (input.equalsIgnoreCase("coin")) {
			System.out.println("Its already open, no need for additional coins, please go through");

			brain.setState(this::unLocked);
		}
		
		if (input.equalsIgnoreCase("push")) {
			System.out.println("the customer has pushed through, lock the turnstile.");

			brain.setState(this::locked);
		}
	}
	
	public void command(String cmd) {
		input = cmd;
		brain.update();
	}
}
