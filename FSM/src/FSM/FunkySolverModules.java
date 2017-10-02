package FSM;

import java.util.ArrayList;
import java.util.Scanner;

public class FunkySolverModules {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numStates = sc.nextInt();
		int numTestString = sc.nextInt();
		
		ArrayList<State> stateList = new ArrayList<State>();
		
		for(int i = 0; i < numStates -1; i++){
			String string = sc.nextLine();
			String stateArray[] = string.split(",");
			
			State tempState = new State(stateArray[0], stateArray[1], stateArray[2], stateArray[3]);
			
			stateList.add(tempState);
		}
		
		ArrayList<String> stringArray = new ArrayList<String>();
		for(int i =0; i < numTestString - 1; i++){
			stringArray.add(sc.nextLine());
		}
		
		
		
		
	}
}
