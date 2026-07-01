public class Loops{
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            System.out.println("for => "+i);
        }
        int j = 5;
        while (j < 10){
            System.out.println("while => "+j);
            j++;
        }

        do {
            System.out.println("do while => "+j);
            j++;
        } while (j < 22);

        for(int i = 0; i <= 5; i++ ){
            if(i == 5){
                // break encerra o loop
                break;
            }

            System.out.println("break => "+i);
        }

        for(int i = 0; i <= 5; i++ ){
            if(i % 2 == 0){
                // continue pula a iteração
                continue;
            }

            System.out.println("continue => "+i);
        }
    }
}