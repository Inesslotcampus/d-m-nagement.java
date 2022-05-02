public class Main {
    public static void main(String[] args) {
        int total = 34;
        while (total > 0) {
            for (int i = 0; i < total; i++) {
                if (i == 9) {
                    total = total - i;
                    System.out.println("Un voyage de 9 cartons");
                    System.out.println(total);

                    if (total <9){
                        System.out.println("Un voyage de "+total+" cartons");
                        i = total;
                        total =total -i;


                        System.out.println(total);

                    }


                }
            }


        }

    }
}
