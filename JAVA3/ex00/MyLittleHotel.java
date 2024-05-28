package JAVA3.ex00;

public class MyLittleHotel {
    private boolean[] rooms;
    private int occupiedRooms;

    public MyLittleHotel() {
        rooms = new boolean[8];
        occupiedRooms = 0;
    }

    public boolean getRoomStatus(int roomNumber) {
        if (roomNumber < 1 || roomNumber > 8) {
            System.out.println("유효하지 않은 객실 번호입니다.");
            return false;
        }
        return rooms[roomNumber - 1];
    }

    public int getOccupiedRooms() {
        return occupiedRooms;
    }

    private void setRoomStatus(int roomNumber, boolean status) {
        if (roomNumber < 1 || roomNumber > 8) {
            System.out.println("유효하지 않은 객실 번호입니다.");
            return;
        }
        rooms[roomNumber - 1] = status;
    }

    public void checkIn(int roomNumber) {
        if (roomNumber < 1 || roomNumber > 8) {
            System.out.println("유효하지 않은 객실 번호입니다.");
            return;
        }
        if (rooms[roomNumber - 1]) {
            System.out.println("이미 배정된 객실입니다.");
            return;
        }
        if (occupiedRooms >= 8) {
            System.out.println("호텔이 가득 찼습니다. 체크인할 수 없습니다.");
            return;
        }
        setRoomStatus(roomNumber, true);
        occupiedRooms++;
        System.out.println(roomNumber + "번 객실 체크인 완료.");
    }

    public void checkOut(int roomNumber) {
        if (roomNumber < 1 || roomNumber > 8) {
            System.out.println("유효하지 않은 객실 번호입니다.");
            return;
        }
        if (!rooms[roomNumber - 1]) {
            System.out.println("배정되지 않은 객실입니다.");
            return;
        }
        setRoomStatus(roomNumber, false);
        occupiedRooms--;
        System.out.println(roomNumber + "번 객실 체크아웃 완료.");
    }

    public void displayStatus() {
        for (int i = 0; i < 8; ++i) {
            System.out.println("객실 " + (i + 1) + ": " + (rooms[i] ? "배정됨" : "비어있음"));
        }
        System.out.println("현재 배정된 객실 수: " + occupiedRooms + "/8");
    }

    public static void main(String[] args) {
        MyLittleHotel hotel = new MyLittleHotel();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice, roomNumber;

        while (true) {
            System.out.println("1. 체크인\n2. 체크아웃\n3. 상태 확인\n4. 종료\n선택: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("체크인할 객실 번호: ");
                    roomNumber = scanner.nextInt();
                    hotel.checkIn(roomNumber);
                    break;
                case 2:
                    System.out.print("체크아웃할 객실 번호: ");
                    roomNumber = scanner.nextInt();
                    hotel.checkOut(roomNumber);
                    break;
                case 3:
                    hotel.displayStatus();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("유효하지 않은 선택입니다.");
            }
        }
    }
}