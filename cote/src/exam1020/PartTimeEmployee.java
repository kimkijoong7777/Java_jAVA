package exam1020;

public class PartTimeEmployee extends Employee {
	private int hourlyRate;
	private int workHours;
	
	protected PartTimeEmployee(String name, String employeeId, int hourlyRate, int workHours) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.workHours = workHours;
	}
	
	@Override
	public int calculatePay() {
		return hourlyRate * workHours;
	}
}
