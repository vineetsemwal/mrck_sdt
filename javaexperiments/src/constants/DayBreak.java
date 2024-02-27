package constants;



public enum DayBreak {

    MorningTeaBreak("11.00am","11:15am"),
    EveningTeaBreak("4:00pm","4:15pm"),
    LunchBreak("1:00pm","2:00pm");

    private String startTime;
    private String endTime;
    DayBreak(String startTime, String endTime){
        this.startTime=startTime;
        this.endTime=endTime;
    }
    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }


}
