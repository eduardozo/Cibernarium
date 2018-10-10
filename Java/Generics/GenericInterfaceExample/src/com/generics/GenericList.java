package com.generics;

public class GenericList<T> implements GenericInterface<T> {

    public T myList;

    @Override
    public void add(T t) {
        myList = t;
    }
}
