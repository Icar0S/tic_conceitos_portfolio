public class Escopo {
    static int valor=0;
    int value=0;
     public Escopo(){
         valor++;// 1
         value++;// 1
     }

    public static void main(String[] args) {
        new Escopo();
        new Escopo();
        new Escopo();
        new Escopo();

        Escopo s = new Escopo();
        System.out.println(s.valor); // Pertence ao escopo classe, por isso incrementa.
        System.out.println(s.value); // Pertence ao escopo objeto, incrementa uma vez.

        for(int i=0;i<4;i++){
            s.value++;
        }
        System.out.println(s.value);
    }
}
