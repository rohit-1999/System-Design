package LLD.ObserverPattern.Observable;

import LLD.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockStatusAmazonObservable {
    //add method, register observer
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
