import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            Random random = new Random();

            for (int i = 0; i < 20; i++) {
                int num1 = 10 + random.nextInt(90); // Двузначное число от 10 до 99
                int num2 = 10 + random.nextInt(90); // Двузначное число от 10 до 99
                boolean isAddition = random.nextBoolean(); // Случайно выбираем операцию (+ или -)

                if (isAddition) {
                    System.out.println(num1 + " + " + num2 + " = ?");
                } else {
                    // Гарантируем, что не будет отрицательных чисел при вычитании
                    if (num1 < num2) {
                        System.out.println(num2 + " - " + num1 + " = ?");
                    } else {
                        System.out.println(num1 + " - " + num2 + " = ?");
                    }
                }
            }
        }
    }
