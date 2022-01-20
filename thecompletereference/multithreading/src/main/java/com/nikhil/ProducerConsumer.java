package com.nikhil;


class Factory {
    private int count;
    boolean isFilled = false;

    synchronized int getCount(){
        while (!isFilled) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed :- " + count);
        isFilled = false;
        notifyAll();
        return count;
    }
    synchronized void setCount(int count) {
        while (isFilled) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
		this.count = count;
		isFilled = true;
		System.out.println("Produced " + count);
		notifyAll();
    }
}

class Producer implements  Runnable{
    private Factory sharedFactory;
    Thread t;

    public Producer(Factory sharedFactory) {
        this.sharedFactory = sharedFactory;
        t = new Thread(this, "Producer");
	}
    @Override
    public void run() {
        int i  = 0;
		int j = 0;
        while (j != 10){
            sharedFactory.setCount(i++);
			j++;
        }
    }


	void startThread(){
		t.start();
	}
}
class Consumer implements  Runnable {
    private Factory sharedFactory;
    Thread t;

    public Consumer(Factory sharedFactory) {
        this.sharedFactory = sharedFactory;
        t = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
		int j = 0;
        while (j!=10) {
            sharedFactory.getCount();
			j++;
        }
    }

    void startThread() {
        t.start();
    }

}

/**
 * @author Nikhil
 * @date 22 Feb2020
 */

public  class  ProducerConsumer{
    public static void main(String[] args) {
        Factory factory = new Factory();
        Producer p = new Producer(factory);
        Consumer c = new Consumer(factory);

        p.startThread();
        c.startThread();
    }
}
