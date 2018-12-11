package com.patterns.creational.singleton;

class Singleton {
	private volatile static Singleton _instance;// if we don't make _instance
												// volatile, as another thread
												// can * see a half initialized
												// instance of Singleton. This
												// is only necessary if you have
												// a mutable singleton field in
												// a multi-threaded system.

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (_instance == null) { // Single Checked
			synchronized (Singleton.class) { // This line will be reached only
												// once for first time instance
												// creation. So cost of
												// synchronization only once
				if (_instance == null) { // Double Checked
					_instance = new Singleton();
				}
			}
		}
		return _instance;
	}
}
