package com.developer.pnrstatus.JSONclasses;

import java.util.List;

public class Train {

	public String number;

	public String name;

	public Train(String number, String name) {
		this.number = number;
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
}