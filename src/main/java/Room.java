public class Room {
    int roomNumber = 0;

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

    int roomFloor =0;
    String roomType = "Regular";


    int cost = 47;
    String roomSize= "Small";
    boolean roomIsClean = true;

    public Room(int roomNumber, int roomFloor, String roomType, int cost, String roomSize, boolean roomIsClean, boolean roomIsTaken) {
        this.roomNumber = roomNumber;
        this.roomFloor = roomFloor;
        this.roomType = roomType;
        this.cost = cost;
        this.roomSize = roomSize;
        this.roomIsClean = roomIsClean;
        this.roomIsTaken = roomIsTaken;
    }

    public void setRoomIsTaken(boolean roomIsTaken) {
        this.roomIsTaken = roomIsTaken;
    }

    boolean roomIsTaken = false;

}
