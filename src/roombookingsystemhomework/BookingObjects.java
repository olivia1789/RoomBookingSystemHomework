
package roombookingsystemhomework;



public class BookingObjects {
    private String room;
    private String date;
    private String time;
    private String refreshments;
    private String refreshmentTimings;

    public BookingObjects(String room, String date, String time) {
        this.room = room;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Booking is:" + "room = " + room + ", date = " + date + ", time = " + time ;
    }

    public BookingObjects(String refreshments, String refreshmentTimings) {
        this.refreshments = refreshments;
        this.refreshmentTimings = refreshmentTimings;
    }
    

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRefreshments() {
        return refreshments;
    }

    public void setRefreshments(String refreshments) {
        this.refreshments = refreshments;
    }

    public String getRefreshmentTimings() {
        return refreshmentTimings;
    }

    public void setRefreshmentTimings(String refreshmentTimings) {
        this.refreshmentTimings = refreshmentTimings;
    }
    
}
