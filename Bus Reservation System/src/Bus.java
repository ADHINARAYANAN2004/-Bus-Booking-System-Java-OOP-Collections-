public class Bus {

    private int busNo;
    private boolean ac;
    private int capacity;

    // ✅ Proper constructor
    public Bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    // Getter for busNo
    public int getBusNo() {
        return busNo;
    }

    // Getter for capacity
    public int getCapacity() {
        return capacity;
    }

    // Setter for capacity
    public void setCapacity(int cap) {
        capacity = cap;
    }

    // Display bus info
    public void displayBusInfo() {
        System.out.println("Bus No: " + busNo + " | AC: " + (ac ? "Yes" : "No") + " | Capacity: " + capacity);
    }
}
