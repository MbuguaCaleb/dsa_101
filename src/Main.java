public class Main {

    public static void printItems(int n){
        //O(n*n) -->Loop within a Loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        //O(n) -->Proportional
        for (int k = 0; k <n ; k++) {
            System.out.println(k);
        }
    }

    //0(1) constant time -->constant
    //as n grows the number of operations stay constant
    //It is the most efficient bigO
    public static int addItems(int n){
        return n + n +n ;
    }

    //O(log n) -->Divide and Conquer
    //Data has to be sorted.
    //finding a specific number in an array
    //splitting the array in half and continue
    //It is the next most efficient algorithimn after o(1)

    public static void main(String[] args) {
     // printItems(10);

    }
}
