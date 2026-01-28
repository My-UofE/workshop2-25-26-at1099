public class MyBirthday {
    public static void main(String[] args) {
        int currentDay = Integer.parseInt(args[0]);
        int currentDate = Integer.parseInt(args[1]);
        int myBirthdayDate = Integer.parseInt(args[2]);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // value below is a constant
        final int DAYS_A_WEEK = 7; 
        
        if (0 <= currentDay && currentDay <= 6 
    && 0 < currentDate && currentDate < 32 
    && 0 < myBirthdayDate && myBirthdayDate < 32){
            int distanceToBirthday = myBirthdayDate - currentDate;
            int daysToBirthday = distanceToBirthday % DAYS_A_WEEK;

            if (daysToBirthday < 0) {
                            daysToBirthday += DAYS_A_WEEK;
                        }

            int birthdayDay = (currentDay + daysToBirthday) % DAYS_A_WEEK;
            System.out.println("Your birthday is: " + days[birthdayDay]);
        }
        // Tasks

        // 1. calc number of days from current date
        //    to birthday 


        // 2. use this along with the current weekday 
        //    to find when the birthday falls


        // 3. Display the result
    

    }
}