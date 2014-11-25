package org.magnum.mobilecloud.video.repository;

import java.util.List;

public class RequestWrapper {
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public Truck getTruck() {
		return truck;
	}
	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	List<Car> cars;
    Truck truck;
}
