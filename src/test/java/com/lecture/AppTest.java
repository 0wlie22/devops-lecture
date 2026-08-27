package com.lecture;

class AppTest {

    public static void main(String[] args) {
        String messageText = "Hello, welcome to DevOps lecture!";
        if (!messageText.equals(App.message())) {
            throw new AssertionError("Unexpected message from App.message(), should be " + messageText + ", but is " + App.message());
        }
    }
}
