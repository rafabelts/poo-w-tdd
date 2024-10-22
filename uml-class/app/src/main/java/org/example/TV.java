package org.example;

class TV {

    int channel;
    int volumeLevel;
    boolean on;

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOn() {
        if (this.on == true) {
            System.out.println("TV already on");
            return;
        }
        this.on = true;
    }

    public void turnOff() {
        if (this.on == false) {
            System.out.println("TV already off");
            return;
        }
        this.on = false;
    }

    public void setChannel(int newChannel) {
        if (this.on != true) {
            System.out.println("TV is not on");
            return;
        }

        if (this.channel == newChannel) {
            System.out.println("Already on the channel");
            return;
        }

        if (newChannel < 1 || newChannel > 120) {
            System.out.println("Invalid channel");
            return;
        }

        this.channel = newChannel;

        System.out.printf("Channel: %d\n", this.channel);
    }

    public void setVolume(int newVolume) {
        if (this.on != true) {
            System.out.println("TV is not on");
            return;
        }

        if (this.volumeLevel == newVolume) {
            System.out.println("Already on the volume");
            return;
        }

        if (newVolume < 1 || newVolume > 7) {
            System.out.println("Invalid volume level");
            return;
        }

        this.volumeLevel = newVolume;

        System.out.printf("Volume level: %d\n", this.volumeLevel);
    }

    public void channelUp() {
        if (this.on != true) {
            System.out.println("TV is not on");
            return;
        }

        if (this.channel == 120) {
            System.out.println("Already on the last channel available");
            return;
        }

        ++this.channel;

        System.out.printf("Channel: %d\n", this.channel);
    }

    public void channelDown() {
        if (this.on != true) {
            System.out.println("TV is not on");
            return;
        }

        if (this.channel == 1) {
            System.out.println("Already on the first channel");
            return;
        }

        --this.channel;

        System.out.printf("Channel: %d\n", this.channel);
    }

    public void volumeUp() {
        if (this.on != true) {
            System.out.println("TV is not on");
            return;
        }

        if (this.volumeLevel == 7) {
            System.out.println("Already on the last volume level available");
            return;
        }

        ++this.volumeLevel;

        System.out.printf("Volume level: %d\n", this.volumeLevel);
    }

    public void volumeDown() {
        if (this.on != true) {
            System.out.println("TV is not on");
            return;
        }

        if (this.volumeLevel == 1) {
            System.out.println("Already on the lower volume level available");
            return;
        }

        --this.volumeLevel;

        System.out.printf("Volume level: %d\n", this.volumeLevel);
    }
}
