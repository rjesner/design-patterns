package observer_demo;

interface ISubject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
