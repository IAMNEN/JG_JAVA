public class objectex{
        void add(int a, int b){
            int sum = a + b;
            System.out.println("Ans -> "+sum);
        }
        void add(int a , int b , int c){
            int sum = a + b + c;
            System.out.println("Ans -> "+sum);
        }
        void add(int a , int b , int c , int d){
            int sum = a + b + c + d;
            System.out.println("Ans -> "+sum);
        }
    public static void main(String[] args) {
        objectex O1 = new objectex();
        O1.add(1, 2);
        O1.add(2, 3, 4);
        O1.add(1, 2, 3, 4);


    }
}

