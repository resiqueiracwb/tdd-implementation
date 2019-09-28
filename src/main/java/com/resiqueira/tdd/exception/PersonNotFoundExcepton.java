package com.resiqueira.tdd.exception;

public class PersonNotFoundExcepton extends RuntimeException {
    public PersonNotFoundExcepton() {
        super();
    }

    public PersonNotFoundExcepton(final String name) {
        super(name);
    }
}
