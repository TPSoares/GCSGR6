package com.company;

public class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String erro) {
        super(erro);
    }

}
