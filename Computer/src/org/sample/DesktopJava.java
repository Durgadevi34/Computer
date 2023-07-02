package org.sample;

public   class DesktopJava implements Hardware,Software {
	public void desktopModel() {
		System.out.println("Model:Dell");
	}

	@Override
	public void softwareResources() {
		System.out.println("Apps");
		
	}

	@Override
	public void hardwareSources() {
		System.out.println("OS");
		
	}
	public static void main(String[] args) {
		DesktopJava m=new DesktopJava();
		m.desktopModel();
		m.softwareResources();
		m.hardwareSources();
			
	}

}
