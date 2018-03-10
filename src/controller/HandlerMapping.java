package controller;


public class HandlerMapping {
	private static HandlerMapping hm = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return hm;
	}
	
	public Controller createController(String command) {
		Controller controller = null;
		if(command.equals("reserve")){
		//	controller = new ReserveController();
		} else if (command.equals("dashboard")) {
		//	controller = new DashboardController();
		}
		
		System.out.println("inside handler "+controller+"controller created");
		return controller;
	}


	
}