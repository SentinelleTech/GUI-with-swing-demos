class John extends JohnSuper{
	
	public String sayHello(){

		return "Good morning Dennis";
	}

	public static void main(String[] args) {
		John j = new John();
		System.out.println(j.sayHello());
	}

}