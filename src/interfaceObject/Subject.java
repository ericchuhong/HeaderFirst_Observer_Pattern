package interfaceObject;

// ���� ����һ���ӿ� ʵ����ͬһ���ӿڣ���ô��ʵ�ֶ���Ϳ���
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
