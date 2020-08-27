package дз2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private int number1;


    public int getSize_i() {
        return number1;
    }


    public MyArraySizeException(int number1) {
        this.number1 = number1;
    }
}

