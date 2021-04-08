public class Main {
    static int sum = 0;
    static String[][] arr1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
    static String[][] arr2 = {{"1,2,3,4"}, {"1,2,3,4"}, {"1,2,3,4"}, {"1,2,3,4"}, {"1,2,3,4"}};
    static String[][] arr3 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "c", "4"}, {"1", "2", "3", "4"}};

    public static void main(String[] args) {
        try {
            try {
                chek1(arr1);
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

        /*try {
            try {
                chek1(arr2);
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }*/

        /*try {
            try {
                chek1(arr3);
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }*/

    public static void chek1(String[][] arr1) throws MyArraySizeException, MyArrayDataException {
        if (arr1.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr1[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверное значение в ячейке: " + i + "x" + j);
                }
            }
        }
        System.out.println(" Сумма равна: " + sum);
    }
   /* public static void chek1(String[][] arr2) throws MyArraySizeException, MyArrayDataException {
        if (arr2.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr2[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверное значение в ячейке: " + i + "x" + j);
                }
            }
        }
        if(arr1.length == 4){
            System.out.println(" Сумма равна: " + sum);
        }
    }*/

/*    public static void chek1(String[][] arr3) throws MyArraySizeException, MyArrayDataException {
        if (arr3.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr3[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверное значение в ячейке: " + i + "x" + j);
                }
            }
        }
        if(arr1.length == 4){
            System.out.println(" Сумма равна: " + sum);
        }
    }*/

}



