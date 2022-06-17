package applicationDP;

public class ServiceFactory {

	public ApplicationService getService(String services) {
		if (services.equalsIgnoreCase("service1")) {
			return new ApplicationImplv1();
		} else if (services.equalsIgnoreCase("service2")) {
			return new ApplicationImplv2();
		}
		return null;
	}

}
