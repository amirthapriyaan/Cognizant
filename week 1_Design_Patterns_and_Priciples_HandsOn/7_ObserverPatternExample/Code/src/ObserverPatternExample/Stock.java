package ObserverPatternExample;

public interface Stock {
	void register(Observer ob);
	void deregister(Observer ob);
	void notification();	
	
}
