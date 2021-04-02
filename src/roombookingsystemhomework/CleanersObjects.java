
package roombookingsystemhomework;


public class CleanersObjects {
    String timeRoomClear;
    String dirtyRoom;

    public CleanersObjects(String timeRoomClear, String dirtyRoom) {
        this.timeRoomClear = timeRoomClear;
        this.dirtyRoom = dirtyRoom;
    }

    @Override
    public String toString() {
        return "" + "room will be clear at " + timeRoomClear + ", dirty room=" + dirtyRoom + '}';
    }

    public String getTimeRoomClear() {
        return timeRoomClear;
    }

    public void setTimeRoomClear(String timeRoomClear) {
        this.timeRoomClear = timeRoomClear;
    }

    public String getDirtyRoom() {
        return dirtyRoom;
    }

    public void setDirtyRoom(String dirtyRoom) {
        this.dirtyRoom = dirtyRoom;
    }
    
}
