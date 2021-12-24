package com.te.templatedp;

public class XMLRenderer extends DataRenderer {

	@Override
	public String read() {
		return "reading the XML data";
	}

	@Override
	public void process(String data) {
		System.out.println(data + ". Now processing..");

	}

}
