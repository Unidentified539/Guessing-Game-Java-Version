public class figureItOut {

    public static String figureItOutComputer(int theNumberTheUserChose, int randomNumberChosenByTheComputer, int count) {



        if (theNumberTheUserChose <=0 || theNumberTheUserChose >100) {
            return "Your guess is invalid";
        }

        else if (theNumberTheUserChose == randomNumberChosenByTheComputer ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (theNumberTheUserChose > randomNumberChosenByTheComputer) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (theNumberTheUserChose < randomNumberChosenByTheComputer) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }


    }
}
