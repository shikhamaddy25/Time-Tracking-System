package model;

public class TimeLog {
    private int logId;
    private int userId;
    private String date;
    private int hours;
    private String task;

    public TimeLog(int logId, int userId, String date, int hours, String task) {
        this.logId = logId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
        this.task = task;
    }

    public int getUserId() { return userId; }
    public int getHours() { return hours; }
}
