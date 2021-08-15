package com.bridgelabz;

import com.bridgelabz.Hotel;
import com.bridgelabz.HotelReservationService;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HotelReservationServiceTest {
    private HotelReservationService hotelReservationService;
    private Hotel lakewood;

    @Before
    public void setup() throws Exception {
        hotelReservationService = new HotelReservationService();
        lakewood = new Hotel("Lakewood", 4);
    }

    @Test
    public void givenHotel_whenInvokedAddHotel_shouldBeAbleToAdd() {
        Assertions.assertTrue(this.hotelReservationService.addHotel(lakewood));
    }

}