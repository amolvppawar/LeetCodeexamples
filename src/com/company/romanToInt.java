package com.company;

public class romanToInt {

    public  void main(String[] args){
        romanToInt("LDC");
    }
    public int romanToInt(String s) {
        int value1;
        int value2;
        int sum=0;
        for(int i=0;i<s.length();i++){
            value1=value(s.charAt(i));
            if(i<s.length()-1){
                value2=value(s.charAt(i+1));
                if(value1>=value2){
                    sum=sum+value1;
                }else{
                    sum=sum+value2-value1;
                    i++;
                }
            }else
                sum=sum+value1;




        }
        return sum;
    }

    int value(char c){
        if(c=='I')
            return 1;
        else if(c=='V')
            return 5;
        else if(c=='X')
            return 10;
        else if(c=='L')
            return 50;
        else if(c=='C')
            return 100;
        else if(c=='D')
            return 500;
        else if(c=='M')
            return 1000;
        return 0;
    }
}
