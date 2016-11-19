package interfaceObject;

// 主题 这是一个接口 实现了同一个接口，那么其实现对象就可以
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
