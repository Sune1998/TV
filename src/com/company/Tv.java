package com.company;
import java.util.Scanner;

// laver en class med navnet tv, og instancere 3 var.
public class Tv {
int channel;
boolean on;
int volvl;

// adds a new object named Tv.
Tv() {

}
// adds several methods that controles the Tv.
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
