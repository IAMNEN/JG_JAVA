public class elebill {
    public static void main(String[] args) {
        //Consumer Array
        String[] consumer ={
                "ABC","DEF", "GHI", "JKL", "MNO"
        };
        //Category List
        int[] category ={
                1, 1, 2, 3, 4
        };
        //Units
        int[] units ={
                85,255,925,650,137
        };
        //Rate Variable
        double rate = 0,bill;

        //Output Heading
        System.out.println("Consumer\t\tCategory\t\t\tUnits\t\t\tBill Amount");
        //Main Loop
        for(int i=0;i<consumer.length;i++){
            //Rate of Deffrent Category Consumer
            switch (category[i]){
                case 1: rate = 1.00;
                break;
                case 2: rate = 1.75;
                break;
                case 3: rate = 2.50;
                break;
                case 4: rate = 3.00;
                break;
            }
            bill = units[i]*rate;
            System.out.println("-----------------------------------------------------------------");
            System.out.println(
                    "\t"+consumer[i]+"\t\t\t\t"+category[i]+"\t\t\t\t"+units[i]+"\t\t\t\t"+bill
            );
        }
    }
}
