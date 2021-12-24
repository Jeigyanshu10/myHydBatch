package com.te.templatedp;

public class CSVRenderer extends DataRenderer {

	@Override
	public String read() {
		return "reading the CSV data";
	}

	@Override
	public void process(String data) {
		System.out.println(data + ". Now processing..");

	}

}
