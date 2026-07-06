public class Arrays {
    public static void main(String[] args){
        int[] meuArray; // Declaração do array
        meuArray = new int[3]; // Criação do array
        meuArray[0] = 5;
        meuArray[1] = 8;
        meuArray[2] = 2;

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        int[] meuArrayDois;
        meuArrayDois = new int[]{4, 8, 3};

        System.out.println(meuArrayDois[0]);
        System.out.println(meuArrayDois[1]);
        System.out.println(meuArrayDois[2]);

        // percorrendo arrays
        for(int i = 0; i < meuArray.length; i++){
            System.out.println(meuArray[i]);
        }

        for(int mad : meuArrayDois){
            System.out.println(mad);
        }
    }
}