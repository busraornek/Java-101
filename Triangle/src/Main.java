public class Main {
    public static void main(String[] args) {
        drawRectangle1(10);
//		drawRectangle2(10);
//		drawRectangle3(10);
        drawRectangle4(10);
        char[] array = drawRectangleByArray(10);
        for(char ch : array)
            System.out.print(ch);
    }

    public static void drawRectangle1(int height) {
        for(int row = 0; row < height; row++) {
            for(int k = 0; k < (height - (row + 1))/2; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < row + 1; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < (height - (row + 1))/2; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void drawRectangle2(int height) {
        for(int row = 0; row < height; row++) {
            for(int k = 0; k < (height - row); k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < row + 1; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < (height - row); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void drawRectangle3(int height) {
        for(int row = 0; row < height; row++) {
            for(int k = 0; k < (height - row); k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*row + 1; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < (height - row); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void drawRectangle4(int height) {
        for(int row = 0; row < height; row++) {
            for(int k = 0; k <= 2 * height - 1; k++) {
                int numberOfChars = 2*height -1;
                int countOfStars = 2*row + 1;
                int m = (numberOfChars - countOfStars)/2;
                if((k <= m) | (k > m + countOfStars))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }

            System.out.println();
        }
    }

    public static char[] drawRectangleByArray(int height) {
        int length = 2 * height * height;
        char[] array = new char[length];
        for(int row = 0; row < height; row++) {
            for(int k = 0; k <= 2 * height - 1; k++) {
                int numberOfChars = 2*height -1;
                int countOfStars = 2*row + 1;
                int m = (numberOfChars - countOfStars)/2;
                int index = row * 2 * height + k;
                if((k <= m) | (k > m + countOfStars))
                    array[index] = ' ';
                else
                    array[index]= '*';
            }

            array[2 * height * (row + 1) - 1] = '\n';
        }
        return array;
    }
}