public class Room {
    int roomNumber;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }

    public boolean isRoomIsClean() {
        return roomIsClean;
    }

    public void setRoomIsClean(boolean roomIsClean) {
        this.roomIsClean = roomIsClean;
    }

    int roomFloor;
    String roomType;
    int cost = 47;
    String roomSize;
    boolean roomIsClean = true;

}
