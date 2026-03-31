package ar.edu.info.unlp.refactoring.ejercicio1;

import java.time.LocalDate;

public class HotelStay extends Product {
    private double quote;
    private Hotel hotel;

    public HotelStay(double quote, TimePeriod timePeriod, Hotel hotel) {
    	super(timePeriod);
        this.quote = quote;
        this.hotel = hotel;
    }
    
    public double quote() {
    	return this.quote;
    }


    public double priceFactor() {
        return this.quote / this.price();
    }

    public double price() {
        return this.timePeriod.duration() * this.hotel.priceToPay();
    }
}
