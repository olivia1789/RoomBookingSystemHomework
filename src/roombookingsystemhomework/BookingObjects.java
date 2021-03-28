
package roombookingsystemhomework;



public class BookingObjects {
    private String room;
    private String date;
    private String time;

    public BookingObjects(String room, String date, String time) {
        this.room = room;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "BookingObjects{" + "room=" + room + ", date=" + date + ", time=" + time + '}';
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
    
}
