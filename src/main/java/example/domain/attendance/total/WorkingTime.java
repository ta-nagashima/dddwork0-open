package example.domain.attendance.total;

import example.domain.hours.Minutes;

public class WorkingTime {

    private Minutes minutes;

    public WorkingTime(){
        this.minutes = new Minutes();
    }

    public Minutes workingTimeCalc(WorkingTime workingTime){
        return this.minutes;
    }
}
