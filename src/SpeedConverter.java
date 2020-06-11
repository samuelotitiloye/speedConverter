public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;  // got it right up to here
        }
        long milesPerHour = Math.round(kilometersPerHour/1.609);
        return milesPerHour;
        //or return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0 ) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h ");
        }
    }
}


//1. Write a method called toMilesPerHour that has 1 parameter
// of type double with the name kilometersPerHour. This
//method needs to return the rounded value of the calculation of the long.

// if the parameter kilometerPerHour is less than 0, the method toMilesPerHour
//needs to return -1 to indicate an invalid value.

//Otherwise, if it is positive, calculate the value of
//miles per hour, round it and return it. For conversion
//and round, check the notes in the text below.

//2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour
//This method should not return anything(void) and it needs to calculate milesPerHour from the kilometersPerHour parameter
//Then it needs to print a message in the format "XX km/h = YY mi/h".

// XX represents the original value kilometersPerHour
// YY represents the rounded milesPerHour is < 0 then print the text "invalid Value"

// Use method Math.round to round the number of calculated miles per hour(double).The method round returns long.

//HOW TO USE THE METHOD ROUND AND HOW IT WORKS?
//The Math.round() is a built-in math method which returns the closest long to the argument. The result is rounded
//to an integer by adding 1/2, taking the floor of the result after adding 1/2, and typecasting the result to the type long.
//The method returns the value of the argument to the nearest int value.