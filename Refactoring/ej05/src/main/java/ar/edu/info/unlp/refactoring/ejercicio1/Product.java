package ar.edu.info.unlp.refactoring.ejercicio1;

import java.time.LocalDate;

public abstract class Product {
	
	protected TimePeriod timePeriod;
	
	
	
	public Product(TimePeriod timePeriod) {
		super();
		this.timePeriod = timePeriod;
	}

	protected LocalDate startDate() {
        return this.timePeriod.start();
    }

    protected LocalDate endDate() {
        return this.timePeriod.end();
    }
    
    public abstract double price();


}
