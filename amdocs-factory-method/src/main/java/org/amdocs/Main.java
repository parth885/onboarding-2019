package org.amdocs;

public class Main {
	public static void main(String[] args) {
		IMobile mobile=MobileFactory.getMobile("onePlus55");
		mobile.call();
	}

}
