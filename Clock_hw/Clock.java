package org.example;

public class Clock implements Readable {
   private int hour;
   private int minute;
   private int second;

   public void setHour (int hour) {
       this.hour = hour;
   }
   public void setMinute (int minute) {
       this.minute = minute;
   }
   public void setSecond (int second) {
       this.second = second;
   }

   public int getHour () {
       return this.hour;
   }
   public int getMinute () {
       return this.minute;
   }
   public int getSecond () {
       return this.second;
   }

   public void tick () {
       this.second = this.second + 1;
       System.out.println("Time updated to " + hour + ":" + minute + ":" + second);
   }

   @Override
    public void readTime () {
       System.out.println("Current time " + hour + ":" + minute + ":" + second);
   }
}
