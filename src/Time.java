public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick() {
        seconds++;
        if(seconds == 60) {
            minutes++;
            seconds = 0;
        }
        if(minutes == 60) {
            hours++;
            minutes = 0;
        }
        if(hours == 24) {
            hours = 0;
        }
    }

    public void add(Time toAdd) {
        seconds += toAdd.seconds;
        if(seconds > 60) {
            minutes += (seconds / 60);
            seconds %= 60;
        }
        minutes += toAdd.minutes;
        if(minutes > 60) {
            hours += (minutes / 60);
            minutes %= 60;
        }
        hours += toAdd.hours;
        if(hours > 24) {
            hours %= 24;
        }
    }
    public String info() {
        String time = "";
        if(hours >= 10) {
            time += hours + ":";
        } else {
            time += "0" + hours + ":";
        }

        if(minutes >= 10) {
            time += minutes + ":";
        } else {
            time += "0" + minutes + ":";
        }

        if(seconds >= 10) {
            time += seconds;
        } else {
            time += "0" + seconds;
        }

        return time;
    }
}
