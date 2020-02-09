package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.ReservationException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/
	// - - - - - - - - C O N S T R U C T O R S - - - - - - - - - -  
	// - - - - - - - -  O V E R L O A D I N G  - - - - - - - - - -   
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public Reservation() {
		
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws ReservationException {
		if(checkIn.after(checkOut)) {
			throw new ReservationException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/ 
	// - - - - - -  G E T T E R S / S E T T E R S  - - - - - - - - 
	// - - - - - - -  E N C A P S U L A T I O N  - - - - - - - - -  
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	// - - - - - -  O R D I N A R Y   M E T H O D S  - - - - - - - 
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date checkIn, Date checkOut) throws ReservationException {
		
		Date now = new Date();
		if(checkIn.after(checkOut)) {
			throw new ReservationException("Check-out date must be after check-in date");
		}
		if (now.after(checkIn) || now.after(checkOut) ) {
			throw new ReservationException("Reservation dates for update must be future dates");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public String toString() {
		
		return  "Room " 
				+ roomNumber
				+ ", "
				+ "check-in: "
				+ sdf.format(checkIn)
				+ ", "
				+ "check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " night(s)";
	}
}