package com.satyam.sandbox.generics;

class GenericInteger<T extends Number>{
    T data;

    GenericInteger(T data){
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public static void main(String[] args) {
        GenericInteger<Float> gi = new GenericInteger<>(40.0f);
        System.out.println(gi.toString());
    }
}
