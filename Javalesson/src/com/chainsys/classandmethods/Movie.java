package com.chainsys.classandmethods;



	
	/**
	 *
	 * @author mahe3115
	 *
	 */
	public class Movie {

	    public final String movieName;
	    private int ticketPrice;
	    private int seatNo;
	    private String language;
	    private String Location;

	    public Movie(String moviename) {
	    this.movieName=moviename;
	    }
	public int getTicketPrice() {
	return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
	this.ticketPrice = ticketPrice;
	}
	public int getSeatNo() {
	return seatNo;
	}
	public void setSeatNo(int seatNo) {
	this.seatNo = seatNo;
	}
	public String getLanguage() {
	return language;
	}
	public void setLanguage(String language) {
	this.language = language;
	}
	public String getLocation() {
	return Location;
	}
	public void setLocation(String location) {
	Location = location;
	}
	   
	}
	
	

