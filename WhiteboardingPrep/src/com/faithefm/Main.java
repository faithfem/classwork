package com.faithefm;

public class Main {

    public static void main(String[] args) {
        HashMap theFunc = new HashMap(30);
        String[] elementsToAdd = {"1","5","17","21","26"};
        theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
        theFunc.displayTheStack();
    }
}
