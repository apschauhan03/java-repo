public class Tut3 {

    // Generating a random Number
    static int givingRandomNum() {
        int response = (int) (Math.random() * 7) + 1;
        return response;
    }

    public static void main(String[] args) {
        // Variable Declaration
        String[] hobbies = { "badminton", "swimming" };
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        // For Loop
        for (int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i]);
        }

        // While Loop
        int hobbyNumber = 0;
        while (hobbyNumber < hobbies.length) {
            System.out.println(hobbies[hobbyNumber]);
            hobbyNumber++;
        }

        // For Each Loop
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        // If-Else condition
        int numOfHobbies = 3;
        if (hobbies.length >= numOfHobbies)
            System.out.println("interesting person");
        else
            System.out.println("hardworking person");

        // Switch condition
        int day = givingRandomNum();
        switch (day) {
            case 1 -> System.out.println("great day! " + days[day]);

            case 2 -> System.out.println("great day! " + days[day]);

            case 3 -> System.out.println("great day! " + days[day]);

            case 4 -> System.out.println("great day! " + days[day]);

            case 5 -> System.out.println("great day! " + days[day]);

            case 6 -> System.out.println("great day! " + days[day]);

            case 7 -> System.out.println("great day! " + days[day]);

            default -> System.out.println("getting an invalid number");
        }
    }
}
