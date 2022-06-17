package inheritece;
class Android {
	
	public void runOs() {
		System.out.println("Android basic feature installed!");
	}
	public void performenceTest() {
		System.out.println("Good usability and performence");
	}
	public void batteryPercentage() {
		System.out.println("4.5 mva");
	}

}
class MiOs extends Android{
	
	public void batteryPercentage() {
		System.out.println("6.5 mva");
	}
}
class RealMe extends Android{
	public void performenceTest() {
		System.out.println("amazing performence then normal android ");
	}
}

class OxygenOs extends Android {
	public void runOs() {
		System.out.println("Advance22 feature installed!");
	}
	public void performenceTest() {
		System.out.println("Super  usability and performence");
	}
	
}
class TestAndroidFeature{
	public static void main(String[] args) {
		OxygenOs oo=new OxygenOs();
		oo.batteryPercentage();
		oo.performenceTest();
		oo.runOs();
		RealMe rr = new RealMe();
		rr.batteryPercentage();
		rr.performenceTest();
		rr.runOs();
		MiOs mm=new MiOs();
		mm.batteryPercentage();
		mm.performenceTest();
		mm.runOs();
		
		
		
		
		
	}
	
}