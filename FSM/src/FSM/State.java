package FSM;

public class State {
	//Constructor thingy-mah-bobbah
	
		//Constructor.
		String inputState;
		String inputString;
		String outputString;
		String outputState;
		
		public State(String inputState, String inputString, String outputString, String outputState){
			this.inputState = inputState;
			this.inputString = inputString;
			this.outputState = outputState;
			this.outputString = outputString;
			
		}
		
		//Getters and setters.
		public String getInputState() {
			return inputState;
		}
		public void setInputState(String inputState) {
			this.inputState = inputState;
		}
		public String getInputString() {
			return inputString;
		}
		public void setInputString(String inputString) {
			this.inputString = inputString;
		}
		public String getOutputString() {
			return outputString;
		}
		public void setOutputString(String outputString) {
			this.outputString = outputString;
		}
		public String getOutputState() {
			return outputState;
		}
		public void setOutputState(String outputState) {
			this.outputState = outputState;
		}
		
		//possibly a deep copy
		
		
}
