import java.awt.*;
import java.util.ArrayList;

public class Hotel {
    String name = "Europa City Vilnius";
    String address;
    int floors;
    int starRating;
    ArrayList<Staff> staffList = new ArrayList<>();
    ArrayList<Resident> residentsList = new ArrayList<>();
    ArrayList<Room> roomsList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFoorNumber() {
        return floors;
    }

    public void setFloorNumber(int floors) {
        this.floors = floors;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }

    public ArrayList<Resident> getResidentsList() {
        return residentsList;
    }

    public void setResidentsList(ArrayList<Resident> residentsList) {
        this.residentsList = residentsList;
    }

    public ArrayList<Room> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(ArrayList<Room> roomsList) {
        this.roomsList = roomsList;
    }

    public void printStaffList(){
        for (Staff staff: staffList
             ) {
            System.out.println(staffList.toString());
        }
    }
    public void addStaff(){

    }
    public void printHotelRoomList(){

    }
    public void addRooms(){

    }

    public void printResidentList(){

    }
    public void printMostExpensiveRoom(){

    }
    public void printCheapestRoom(){

    }
    public void printTakenRooms(){

    }
    public void printFreeRooms(){

    }
    public void addResident(){

    }
}
