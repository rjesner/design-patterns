package observer_demo;

import java.util.ArrayList;
import java.util.List;

class Subject implements ISubject {
    List<Observer> observerList = new ArrayList<Observer>();
    private int mFlag;

    public int getFlag() {
        return mFlag;
    }
    
    public void setFlag(int flag) {
        this.mFlag = flag;
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }
    
    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0 ; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }
}
