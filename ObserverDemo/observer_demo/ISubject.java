package observer_demo;

interface ISubject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers();
}
