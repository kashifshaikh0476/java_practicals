class practical2
{
    public static void main(String args[])
    {
        // Example of if-else statement
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a child");
        }
        System.out.println();

        
        //Example of switch statement        
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        
             }
             System.out.println();
             
        
        // Example of for loop
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("no: " + i);
        }
        System.out.println();

        //example of while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("no: " + i);
            i++;
        }
        System.out.println();

        // Example of do-while loop
        int n = 1;
        do {
            System.out.println("no: " + i);
            i++;
        } while (i <= 5);
    }   
}