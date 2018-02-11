package com.faithefm;

import java.util.Arrays;

public class HashMap {

    //Variables
    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

//    public static void main (String[]args){
//        HashMap theFunc = new HashMap(30);
//        String[] elementsToAdd = {"1","5","17","21","26"};
//        theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
//        theFunc.displayTheStack();
//
//    }

    //Insert values into the index that matches their value, so e.g., 1 is going to be placed into index with 1
    //This is the HASH FUNCTION
    public void hashFunction1(String[] stringsForArray, String[] theArray){
        for(int n = 0; n<stringsForArray.length; n++){
            String newElementVal = stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }

    //Constructor
    HashMap(int size){
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }

    public void displayTheStack(){
        int increment = 0;
    }

}
