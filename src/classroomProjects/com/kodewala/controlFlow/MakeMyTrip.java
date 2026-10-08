package classroomProjects.com.kodewala.controlFlow;

/**
 * This class is for discounts given my MMT
 */
public class MakeMyTrip
{
    public double discountOffer(double fair)
    {
        double updatedFair = 0;
        if(fair<=0)
        {
            System.out.println("Invalid Fair");
        }

        else if(fair <= 5000)
        {
            updatedFair = fair;
            System.out.println("No discount Applied");
        }
        else if(fair > 5000 && fair <= 10000)
        {
            updatedFair = fair * 0.90;

            System.out.println("Congratulations! You got a discount of 10%");
            System.out.println("Your updated fare is " + updatedFair);
        }
        else
        {
            double discount = fair * 0.15;
        //Max discount is 1250
            if(discount <= 1250)
            {
                updatedFair = fair * 0.85;

                System.out.println("Congratulations! You got a discount of 15%");
                System.out.println("Your updated fare is " + updatedFair);
            }
            else
            {
                updatedFair = fair - 1250;

                System.out.println("Congratulations! You got a Max discount of Rs 1250");
                System.out.println("Your updated fare is " + updatedFair);
            }
        }

        return updatedFair;
    }
}
