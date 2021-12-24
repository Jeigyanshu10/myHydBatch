package com.te.templatedp;

public abstract class DataRenderer {

	public void render() {

		String myData = read();
		process(myData);

	}

	public abstract String read();

	public abstract void process(String data);

}
