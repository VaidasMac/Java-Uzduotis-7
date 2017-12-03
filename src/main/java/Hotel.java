import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        for(int i =0;i<staffList.size();i++){
            System.out.println(staffList.get(i).getName()+" "+staffList.get(i).getLastName());
        }
    }
    public void addStaff(Staff staff){
        staffList.add(staff);
    }
    public void printHotelRoomList(){
        for(int i = 0; i<roomsList.size();i++){
            System.out.println(roomsList.get(i).toString());
        }
    }
    public void addRooms(Room room){
        roomsList.add(room);
    }

    public void printResidentList(){
        for(int i =0;i<residentsList.size();i++) {

            System.out.println(residentsList.get(i).getName()+" "+residentsList.get(i).getLastName()+" Room number: "+ residentsList.get(i).number+ " Floor number: " + residentsList.get(i).floor);
        }
    }
    public void printMostExpensiveRoom(){

        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i =0;i<roomsList.size();i++){
           arrayList.add(roomsList.get(i).getCost());
        }
        System.out.println(Collections.max(arrayList));
    }

    public void printCheapestRoom(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i =0;i<roomsList.size();i++){
            arrayList.add(roomsList.get(i).getCost());
        }
        System.out.println(Collections.min(arrayList));
    }
    public void printTakenRooms(){

        for(int i =0;i<roomsList.size();i++){
            if(roomsList.get(i).roomIsTaken == true){
                System.out.println(roomsList.get(i).toString());
            }

        }

    }
    public void printFreeRooms(){
        for(int i =0;i<roomsList.size();i++){
            if(roomsList.get(i).roomIsTaken != true){
                System.out.println("Room number "+roomsList.get(i).getRoomNumber()+" on the "+roomsList.get(i).getRoomFloor()+" floor is free");
            }

        }
    }
    public void addResident(Resident resident,int roomNumber,int floorNumber,String staylengh){
        residentsList.add(resident);
        for (int i =0;i<roomsList.size();i++){
            if( roomNumber == roomsList.get(i).getRoomNumber() && floorNumber == roomsList.get(i).getRoomFloor()){
                roomsList.get(i).setRoomIsTaken(true);
                resident.setRooms(roomsList.get(i).getRoomNumber(),roomsList.get(i).getRoomFloor());
                resident.setStayLenght(staylengh);
            }
        }

    }

    @Override
    public String toString() {
        return "Hotel " +
                "\nname='" + name + '\'' +
                ",\n address='" + address + '\'' +
                ",\n floors=" + floors +
                ",\n starRating=" + starRating +
                ",\n roomsList=" + roomsList +
                '}';
    }
}
