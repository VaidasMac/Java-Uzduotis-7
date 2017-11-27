import java.util.ArrayList;

public class Resident {
    String name;
    String lastName;
    ArrayList<Room> rooms = new ArrayList<>();
    String stayLenght;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public String getStayLenght() {
        return stayLenght;
    }

    public void setStayLenght(String stayLenght) {
        this.stayLenght = stayLenght;
    }
    public void orderRoom(){

    }

    public void setRooms() {
    }
}
