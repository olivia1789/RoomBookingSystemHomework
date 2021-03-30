
package roombookingsystemhomework;


public class refreshmentObjects {
    private String refreshments;
    private String refreshmentTimings;
    private String refreshmentRoom;

    public refreshmentObjects(String refreshments, String refreshmentTimings, String refreshmentRoom) {
        this.refreshments = refreshments;
        this.refreshmentTimings = refreshmentTimings;
        this.refreshmentRoom = refreshmentRoom;
    }

    @Override
    public String toString() {
        return  "refreshments = " + refreshments + ", refreshmentTimings = " + refreshmentTimings + ", refreshmentRoom = " + refreshmentRoom + '}';
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
    
    
}
