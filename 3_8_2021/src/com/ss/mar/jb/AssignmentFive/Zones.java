/**
 * 
 */
package com.ss.mar.jb.AssignmentFive;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * @author marvi
 *
 */
public class Zones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(allZoneIds.size());
		//ZoneIds-multiple ZoneIds per time zone
//		allZoneIds.forEach(x -> System.out.println(x));
		
		
	
		ZoneOffset off =  ZoneOffset.of("+02:00");
		
		LocalDateTime local = LocalDateTime.now();
		
		OffsetDateTime offset = OffsetDateTime.of(local, off);
		System.out.println(local);
		System.out.println(offset);


        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);
 
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("ZonedDateTime: " + zonedDateTime);
        
        
        ZonedDateTime zonetimenow = ZonedDateTime.now();
        
        Instant ins = Instant.ofEpochMilli(zonetimenow.toEpochSecond());
        //Epoch time to and from Instant and ZoneDateTime
        System.out.println(ins);
        
        
        

	}

}
