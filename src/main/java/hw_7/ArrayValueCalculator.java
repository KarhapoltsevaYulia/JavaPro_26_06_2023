package hw_7;

public class ArrayValueCalculator {
    private  String[][] arrays;
    public int length = 4;
    private  int[][] arrayInt = new int[length][length];
    private  int sum = 0;

    public ArrayValueCalculator(String[]... arrays) {
        this.arrays = arrays;
        equalityTest(arrays);
    }

    private void equalityTest(String[]... arrays) throws ArrayIndexOutOfBoundsException,NullPointerException {
        try {
            if ((arrays == null)|| (arrays.length==0)) {
                throw new NullPointerException("Array = null");
            }
            try {
                for (String[] arr : arrays) {
                    if (arrays.length != this.length || arr.length != this.length) {
                        throw new UncheckedArraySizeException("Matrix != 4x4");
                      ///  throw new ArrayIndexOutOfBoundsException("Matrix != 4x4");
                    }
                }
                doCalc(arrays);
            } catch (UncheckedArraySizeException e){
                throw new RuntimeException(e.message);
               // System.err.print(e.getMessage());
            }
        } catch (NullPointerException e) {
            System.err.print(e.getMessage());
        }
    }

    public void doCalc (String[]... arrays) throws NumberFormatException {

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                try {
                    this.arrayInt[i][j] = Integer.parseInt(arrays[i][j]);
                    this.sum += this.arrayInt[i][j];
                } catch (NumberFormatException e) {
                    System.err.println("Not number string " + (i+1) + " columns " + (j+1) + " !!!");
                }
            }
        }
        printArray(this.arrayInt, this.sum);
    }

    public void printArray(int[][] arrays,int sum){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Sym of all array elements: "+this.sum);
    }
}
