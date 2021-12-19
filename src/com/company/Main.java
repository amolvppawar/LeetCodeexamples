package com.company;

import java.util.*;

public class Main  {
    public static boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        int i;

        for(i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('|| ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch==')'){
                if(st.size()==0){
                    return false;

                }else if( st.peek() !='('){
                    return false;
                }else{
                    st.pop();
                }
            }else if(ch=='}'){
                if(st.size()==0){
                    return false;

                }else if(st.peek() !='{'){
                    return false;
                }else{
                    st.pop();
                }
            }else if(ch==']'){
                if(st.size()==0){
                    return false;

                }else if(st.peek() !='['){
                    return false;
                }else{
                    st.pop();
                }
            }

        }

        if(st.size()==0){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
	// write your code here

        if(isValid("()(")){
            System.out.println("Valid");

        }else{
            System.out.println("Invalid");
        }
    }


}
