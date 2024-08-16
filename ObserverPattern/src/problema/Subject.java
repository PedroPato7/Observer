package problema;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observer = new ArrayList<>();
	
	public void followCont(Observer obs) {
		observer.add(obs);
	}
	
	public void unfollowCont(Observer obs) {
		observer.remove(obs);
	}
	public List<Observer> getObservers(){
		return this.observer;
	}
	public void notifyAllMethod(String msg) {
		for (Observer obs : observer) {
			obs.update(msg);			
		}
	}
}