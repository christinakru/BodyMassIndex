public class Main {
    public static void main(String[] args) {
        double weight = 52.5;
        double height = 162.7;

        BmiService service = new BmiService();
        double index = service.calculate(weight, height);
        System.out.printf("Body mass index: %.2f", index);
    }
}