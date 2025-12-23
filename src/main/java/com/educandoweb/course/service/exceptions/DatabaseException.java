package com.educandoweb.course.service.exceptions;

import javax.xml.crypto.Data;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg) {
        super(msg);
    }
}
