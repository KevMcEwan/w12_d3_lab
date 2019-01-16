package behaviours;

import entities.Customer;
import entities.Vehicle;

public interface ISellable {

	public double sellPrice(Customer customer, Vehicle vehicle);

	public double buyPrice(Customer customer, Vehicle vehicle);

}
