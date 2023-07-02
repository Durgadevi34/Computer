package org.sample;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("Desktop Size:52");
	}
	public static void main(String[] args) {
		Desktop f=new Desktop();
		f.desktopSize();
		f.computerModel();
	}

}
