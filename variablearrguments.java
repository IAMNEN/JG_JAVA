public class variablearrguments {
    static void fun(int... a){
        System.out.println("Number Of Arrrguments Is -> "+a.length);
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        variablearrguments.fun(100);
        variablearrguments.fun(1,2,3);
        variablearrguments.fun();
    }
}
