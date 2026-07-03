import java.util.*;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking,
                 int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}

public class Solution {

    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month) {

        int total = 0;

        for (Hotel h : hotels) {
            String[] date = h.getDateOfBooking().split("-");

            if (date[1].equalsIgnoreCase(month)) {
                total += h.getNoOfRoomsBooked();
            }
        }

        return total;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] hotels, String wifi) {

        Hotel first = null;
        Hotel second = null;

        for (Hotel h : hotels) {

            if (h.getWifiFacility().equalsIgnoreCase(wifi)) {

                if (first == null || h.getTotalBill() > first.getTotalBill()) {
                    second = first;
                    first = h;
                } 
                else if (second == null || h.getTotalBill() > second.getTotalBill()) {
                    second = h;
                }
            }
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel[] hotels = new Hotel[4];

        for (int i = 0; i < 4; i++) {

            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String date = sc.nextLine();
            int rooms = Integer.parseInt(sc.nextLine());
            String wifi = sc.nextLine();
            double bill = Double.parseDouble(sc.nextLine());

            hotels[i] = new Hotel(id, name, date, rooms, wifi, bill);
        }

        String month = sc.nextLine();
        String wifi = sc.nextLine();

        int roomsBooked = noOfRoomsBookedInGivenMonth(hotels, month);

        if (roomsBooked > 0)
            System.out.println(roomsBooked);
        else
            System.out.println("No rooms booked in the given month");

        Hotel result = searchHotelByWifiOption(hotels, wifi);

        if (result != null)
            System.out.println(result.getHotelId());
        else
            System.out.println("No such option available");
    }
}
