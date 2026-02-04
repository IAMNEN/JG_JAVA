public class array1 {
    int [] createarry(){
        int [] arr = {10,20,30};
        return arr;
    }

    public static void main(String[] args) {
        array1 s1 = new array1();
        int [] a = s1.createarry();

        for(int i = 0 ; i< a.length ; i++){
            System.out.println(a[i]);
        }
    }
}
