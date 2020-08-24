package дз2;

public class Main {
    public static void main(String[] args) {
        String[][] str = {
                {"1", "1", "1", "2"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},

        };
        int n = str.length;
        massiv1 (n);
        massiv2(str);
        data(str);
    }

    static void massiv1(int n) throws MyArraySizeException {
        if (n != 4) {
            throw new MyArraySizeException(n);
        }
    }

    static void massiv2(String[][] str) throws MyArraySizeException{
        int x;
        for (int i = 0; i < 4; i++) {
            x = str[i].length;
            if (x != 4) {
                throw new MyArraySizeException(x);
            }
        }
    }

    static void data(String[][] str) throws MyArrayDataException{
        int y;
        int sum=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try
                {
                    y = Integer.parseInt(str[i][j]);
                    sum+=y;
                }
                catch (NumberFormatException e)
                {
                    throw new MyArrayDataException(" Scr[" + i + "][" + j + "]" ,i, j);
                }
            }
        }
        System.out.println(sum);









    }

}
