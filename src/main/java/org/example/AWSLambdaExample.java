package org.example;

public class AWSLambdaExample {
    public String Demo(String payload){
        System.out.println("Demo Lambda function Java");
        return "Sudhamsh Hello, World"+payload;
    }
}
