package org.example;

public class App {

    public static void main(String[] args) {
        TV tv = new TV(1, 1, true);

        tv.channelUp();
        tv.setChannel(1);
    }
}
