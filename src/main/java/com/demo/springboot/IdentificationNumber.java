package com.demo.springboot;

public class IdentificationNumber {


    public boolean isValid(String id) {
        int size = id.length();
        if (size != 11){            //check length
            return false;
        }
        int weigths[] = {1,3,7,9,1,3,7,9,1,3};
        int j = 0, sum = 0, control = 0;
        int controlSum = Integer.valueOf(id.substring(size - 1));

        for(int i = 0; i < size -1;i++){
            char singleNumber = id.charAt(i);
            j = Integer.valueOf(String.valueOf(singleNumber));
            sum += j * weigths[i];
        }

        control = 10 - (sum % 10);
        if (control == 10){
            control = 0;
        }

        return (control == controlSum);
    }
}
