package workspace;

public class FibonocciSeries {

    public static void main(String[] args) {

        int n = 6;
        int temp = 0;

        int fnum = 0;
        int snum = 1;

        for( int i = 2; i < n; i++){

            temp = fnum + snum;

            fnum = snum;
            snum = temp;
        }
        System.out.println(temp);
    }
}
