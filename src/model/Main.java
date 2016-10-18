package model;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main starting");
		System.out.println("running");
		SensorList sensList = new SensorList();
		sensList.print();
		AgentList agList = new AgentList();
		agList.print();
	}

}
