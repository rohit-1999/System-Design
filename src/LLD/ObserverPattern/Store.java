package LLD.ObserverPattern;

import LLD.ObserverPattern.Observable.IphoneStockObservableImpl;
import LLD.ObserverPattern.Observable.StockStatusAmazonObservable;
import LLD.ObserverPattern.Observer.EmailAlertObserverImpl;
import LLD.ObserverPattern.Observer.MobileAlertObserverImpl;
import LLD.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StockStatusAmazonObservable iphoneStockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("rohit1612511@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("Rohit", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("shoury321@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.getStockCount();
        iphoneStockObservable.setStockCount(20);
        iphoneStockObservable.getStockCount();
        iphoneStockObservable.setStockCount(-20);




    }
}