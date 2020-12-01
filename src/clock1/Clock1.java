/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock1;

/**
 *
 * @author Kofi Osel
 */
public class Clock1 {
    
    private int hour;
    private int minute;
    private int second;

    public Clock1() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Clock1(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Clock1(Clock1 clock1) {
        this.hour = clock1.hour;
        this.minute = clock1.minute;
        this.second = clock1.second;
    }

    public boolean equals(Clock1 clock1) {
        return this.hour == clock1.hour &&
                this.minute == clock1.minute &&
                this.second == clock1.second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour, minute, second); 
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }   
}
