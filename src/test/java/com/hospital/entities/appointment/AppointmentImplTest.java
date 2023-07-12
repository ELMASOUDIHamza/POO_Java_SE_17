package com.hospital.entities.appointment;

import com.hospital.entities.persons.Employee;
import com.hospital.entities.persons.IPerson;
import com.hospital.entities.rooms.IRoom;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.imageio.IIOParam;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class AppointmentImplTest {
    private static IPerson person ;
    private LocalDateTime localDateTime ;
    private static IRoom room;
    @BeforeAll
    public static void beforeEachTest(){
        person = Mockito.mock(IPerson.class);
        room = Mockito.mock(IRoom.class);
    }
    @Test
    @DisplayName("Release appointment test")
    void releaseAppointmentTest() {
        IAppointment appointmentTest = new AppointmentImpl();
        ((AppointmentImpl)appointmentTest).setDateTime(LocalDateTime.now().plusMinutes(1));
        assertTrue(appointmentTest.releaseAppointment());
    }

    @Test
    void updateAppointment() {
    }

    @Test
    void testUpdateAppointment() {
    }
}
