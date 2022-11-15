public class Code {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Inputs: ");
        String numberOfInputsString = bufferedReader.readLine();
        int n = Integer.parseInt(numberOfInputsString);
        List<Integer> inputs = new ArrayList<>(n);
        while (n-- > 0) {
            System.out.println("Enter Number: ");
            String inputString = bufferedReader.readLine();
            inputs.add(Integer.parseInt(inputString));
        }

        inputs.forEach(input -> System.out.println(input + "-->" + convertToString(logic(input))));
        bufferedReader.close();
    }


    private static String convertToString(List<Integer> integers) {
        StringBuilder stringBuilder = new StringBuilder();
        integers.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }


    private static List<Integer> logic(int number) {
        Random random = new Random();

        List<Integer> numbers = random.ints(10, 0, 1)
                .boxed()
                .collect(Collectors.toList());

        // the max value you can represent with left hand is 90
        // with right hand is 9
        if (number <= 9) {
            return processRight(number, numbers);
        }

        return processLeft(number, numbers);
    }


    private static List<Integer> processLeft(int number, List<Integer> numbers) {
        int units = number % 10;
        int tenths = number - units;
        List<Integer> result = processRight(units, numbers);
        int q = tenths / 50;
        int rem = tenths % 50;
        if (q == 1) {
            result.set(4, 1);
        }
        int temp = rem;
        int index = 0;
        while (temp > 0) {
            result.set(index, 1);
            temp -= 10;
            index++;
        }
        return result;
    }

    private static List<Integer> processRight(int number, List<Integer> numbers) {
        int q = number / 5;
        int rem = number % 5;
        if (q == 1) {
            numbers.set(numbers.size() - 5, 1);
        }
        int temp = rem;
        int index = numbers.size() - 1;
        while (temp-- > 0) {
            numbers.set(index, 1);
            index--;
        }
        return numbers;
    }


}
