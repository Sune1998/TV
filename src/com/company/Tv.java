package com.company;
import java.util.Scanner;

public class Tv {
int channel;
boolean on;
int volvl;

Tv() {

}
void turnOn() {
on = true;
}
void turnOff() {
on = true;
}

void setChannel(int newChannel) {
channel = newChannel;
}

void setVolvl(int newvolvl){
volvl = newvolvl;
}
void channelUp() {
channel++;
}

void channelDown() {
channel--;
}

void volumeUp() {
volvl++;
}

void volumeDown() {
volvl--;
}

}
