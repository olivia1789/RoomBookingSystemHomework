
package roombookingsystemhomework;


public class refreshmentObjects {
    private String refreshments;
    private String refreshmentTimings;
    private String refreshmentRoom;
    private String refreshmentDate;

    public refreshmentObjects(String refreshments, String refreshmentTimings, String refreshmentRoom, String refreshmentDate) {
        this.refreshments = refreshments;
        this.refreshmentTimings = refreshmentTimings;
        this.refreshmentRoom = refreshmentRoom;
        this.refreshmentDate = refreshmentDate;
    }

    @Override
    public String toString() {
        return "" + "Refreshments =" + refreshments + ", Date of refreshments arrivsl = " + refreshmentDate+ ", Time refreshment wanted = " + refreshmentTimings + ", Room = " + refreshmentRoom  + '}';
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

    public String getRefreshmentRoom() {
        return refreshmentRoom;
    }

    public void setRefreshmentRoom(String refreshmentRoom) {
        this.refreshmentRoom = refreshmentRoom;
    }

    public String getRefreshmentDate() {
        return refreshmentDate;
    }

    public void setRefreshmentDate(String refreshmentDate) {
        this.refreshmentDate = refreshmentDate;
    }
    
    
    
}
