package fsm;


public class FSM {
	private Runnable activeState;
	
	/**
	 * This method will transition the FSM to a new state by pointing the 
	 * activeState property to a new state function.
	 * 
	 */
	public void setState(Runnable state){
        activeState = state;
    }
	
	/**
	 * The update() method of the FSM class must be invoked every game frame, 
	 * so that it can call the function pointed by the activeState property. 
	 * 
	 * That call will update the actions of the currently active state.
	 */
	public void update() {
        if (activeState != null) {
        	//new Thread(activeState).start();
        	activeState.run();
        }
    }
}
