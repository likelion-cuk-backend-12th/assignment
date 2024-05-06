package java3.ex00;

public class MyLittleHotel {

    private static MyLittleHotel myLittleHotel;
    private MyLittleHotel() {}

    public static MyLittleHotel getMyLittleHotel() {
        if (myLittleHotel == null) {
            myLittleHotel = new MyLittleHotel();
        }
        return myLittleHotel;
    }

    class Hotel {
        int numder;
        boolean check;

        private Hotel(int numder){
            this.numder = numder;
            this.check = false;
        }
    }

    public Hotel[] hotels = {new Hotel(101), new Hotel(102), new Hotel(103), new Hotel(104),
            new Hotel(201), new Hotel(202), new Hotel(203), new Hotel(204)};

    public void checkIn(){
        if (is_full()){
            System.out.println("빈 방이 없습니다.");
            return;
        }

        for (Hotel hotel : hotels) {
            if (hotel.check == false){
                hotel.check = true;
                System.out.println(hotel.numder+"호 로 배정 되었습니다.");
                return;
            }
        }
    }

    public void checkOut(int num){
        if (is_empty()){
            System.out.println("모든 객실이 빈 상태 입니다.");
            return;
        }

        for (Hotel hotel : hotels) {
            if (hotel.numder == num){
                if (hotel.check == false){
                    System.out.println("이미 체크아웃된 객실 입니다.");
                    return;
                } else {
                    hotel.check = false;
                    System.out.println(hotel.numder+"호 체크아웃 완료 되었습니다.");
                    return;
                }
            }
        }
        System.out.println("존재하지 않는 객실입니다.");
    }

    private boolean is_full() {
        for (Hotel hotel : hotels) {
            if (hotel.check == false){
                return false;
            }
        }
        return true;
    }

    private boolean is_empty() {
        for (Hotel hotel : hotels) {
            if (hotel.check == true){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MyLittleHotel hotel = getMyLittleHotel();

        hotel.checkIn();
        hotel.checkIn();
        hotel.checkIn();
        hotel.checkOut(101);
        hotel.checkOut(102);
        hotel.checkOut(104);
    }
}
