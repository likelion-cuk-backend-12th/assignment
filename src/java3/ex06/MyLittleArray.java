package java3.ex06;

public class MyLittleArray<T> {

    Object[] arr = null;
    int capacity = 0;
    int size = 0; // 현재까지 담긴 양

    // 생성자
    public MyLittleArray(int capacity) { // 배열 크기 주어질 때
        this.capacity = capacity;
        arr = new Object[capacity];
        size = 0;
    }

    public MyLittleArray() { // 배열 크기 주어지지 X
        capacity = 1;
        arr = new Object[capacity];
        size = 0;
    }

    public void sizeUpArray() {
        capacity += 10;
        Object[] tempArr = new Object[capacity];
        copyArr(tempArr, arr);
        arr = new Object[capacity];
        copyArr(arr, tempArr);
    }

    public void copyArr(Object[] array, Object[] newArray) {
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("index 값이 옳은 범위가 아닙니다.");
            throw new IndexOutOfBoundsException();
        }

        return (T) arr[index];
    }

    public void add(T element) {
        if (size == capacity) { // 용량이 꽉 찬 상태
            sizeUpArray();
        }
        arr[size++] = element;
    }

    public void add(int index, T element) {
        if (index < 0 || index >= size) {
            System.out.println("index 값이 옳은 범위가 아닙니다.");
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity) { // 용량이 꽉 찬 상태
            sizeUpArray();
        }

        // index를 비우고 뒤로 한 칸씩 미루기
        for (int i = size; i >= index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = element;
        size++;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            System.out.println("index 값이 옳은 범위가 아닙니다.");
            throw new IndexOutOfBoundsException();
        }

        arr[index] = element;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("index 값이 옳은 범위가 아닙니다.");
            throw new IndexOutOfBoundsException();
        }

        T item = (T) arr[index];

        // 빈자리 채우기
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        return item;
    }



    public Boolean contains(Object object){
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(object)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object object){
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(object)){
                return i;
            }
        }
        return -1;
    }

    public int size(){
        return size;
    }
}
