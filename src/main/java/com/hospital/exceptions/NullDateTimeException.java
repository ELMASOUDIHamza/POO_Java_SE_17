package com.hospital.exceptions;

import java.time.LocalDateTime;

public class NullDateTimeException extends NullPointerException{
    public NullDateTimeException(LocalDateTime localDateTime, String message) {
        super(message);
        if(localDateTime == null) throw new NullPointerException(message);

    }
}
