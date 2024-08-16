package problema2;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observer = new ArrayList<>();
	
	public void follow(Observer obs) {
		observer.add(obs);
	}
	
	public void unfollow(Observer obs) {
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