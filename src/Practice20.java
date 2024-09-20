public class Practice20 {
    public static void main(String[] args){
        /* ラベルの使用 */
        loop1:
        for (int i = 1 ; i < 5 ; i++) {
            while (i % 3 == 0) {
                System.out.println("ネストされたwhile文を実行しています");
                break loop1;    // while文から抜けると同時に、外側のfor文（loop1）からも抜ける
            }
            System.out.println("外側のfor文を実行しています");
        }
        System.out.println("繰り返し文から抜けました");
    }
}
