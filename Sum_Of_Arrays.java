public class Sum_Of_Arrays {
    public static void main(String[] args) {
       int [] arr= {11 , 20 , 33 , 15 , 12 , 44 , 34 , 3 , 24 , 46};
       int sum=0;
        for (int j : arr) {
            System.out.print(j + " ,");
        }
        for (int a:arr) {
            sum+=a;
        }

        System.out.println("\n  Sum of   given array :"+sum);

    }
}
