package School_Project;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//importing the necessary libraries

    public class airplanetickets extends helper
    {
    
    //default destinations array. 
    private String name, gender, departure , arrival, path;
    private int age = 0;
    private boolean trip = false;
    private double  default_cost = 2500, cost= 0.0; 
    private final int length = 5; 
    private int counter_global_arr =  0, counter_global_dep = 0;
   
    //declaring necessary variables. 

    airplanetickets() {
        
        registration();
        displayCredentials();

        //A constructor calling methods to register the user. 
        
    } //end of constructor. 

    private void registration() {
        int counter = 0; 
        //to regulate the number of times the user has entered invalid values. 
        Scanner sc = new Scanner(System.in);
        //creating a Scanner object. 
        System.out.println("Please enter your name: ");
        name = sc.nextLine();
        System.out.println("Please enter your age: ");
        age = sc.nextInt();
        System.out.println("Please enter your gender: ");
        gender = sc.next();
        //Prompting the user to enter input and taking it. 
        switch (gender)
        /* we use this to determine whether to add Mr. or Mrs */
        {
            case "m":
            case "M":
            case "male":
            case "Male":

            //using fall through to support multiple input values. 

                if (age >= 18) {
                    name = "Mr. " + name;
                } // end of if
                else {
                    name = "Master. " + name;
                } // end of else. 

                break;

            case "f":
            case "F":
            case "female":
            case "Female":

            //using fall through to support multiple input values. 

                if (age >= 18) 
                {
                    name = "Mrs. " + name;
                } // end of if
                else 
                {
                    name = "Miss. " + name;
                } // end of else. 
                break;
            default:
                if(counter <= 1)
                {
                    System.out.println("Please do not make a mistake, again, otherwise the program will terminate. "); 
                    counter += 1; 
                } // end of else. 

        }// end of switch case

        

        

    }// end of void

    private void displayCredentials() 
    {
        //Void to display the entered credentials. 
        System.out.println();
        System.out.println("This is the information entered by You!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

        

    } // end of void.

    private void chooseDeparture(String depart)
    { 
        //void to verify whether departure destination is valid. 
        
        for(int i = 0; i<length; i++)
        {
            //to verify whether departure destination valid. 
            //if valid assign it to global variable departure. 
            if(depart.equals(destinations[i]))
            {
                
                departure = depart;
                //assign it to global variable 
                
                break; 
            }//end of if 
            else
            {
                continue; 
            }//end of else
        }//end of for
        
        

        if(departure != null)
        {
            System.out.println("Destination successfully chosen!");
            //checking and telling user that the destination chosen successfully. 
           
        }//end of if. 
        else
        {
            //giving user the warning that the program might terminate. 
            if(counter_global_dep <= 1)
            {
                System.out.println("You get one more chance to fill the right details, otherwise the program will terminate. "); 
                counter_global_dep += 1; 
                input_depart();
            } // end of if. 
            else
            {
                System.out.println("Invalid destination entered, terminating the programme as you have entered the wrong destination twice.");
                System.exit(0);
            } // end of else. 

        } // end of else. 
    }//end of void
    private void chooseArrival(String arr)
    {
        //void to verify arrival destination.
        
        for(int i = 0; i<length; i++)
        {
            //verifying the availaible departure destination. 
            if(arr.equals(destinations[i]))
            {
                
                arrival = arr; 
                
                break; 
            }//end of if 
            else
            {
                continue; 
            }//end of else
        }//end of for
        
        

        if(arrival != null)
        {
            if(arrival.equals(departure))
            {
                 
                if(counter_global_arr <= 1)
                {
                    counter_global_arr += 1;
                    System.out.println("Error same arrival and departure destination entered. The program will terminate if mistake is repeated.");
                    input_arrival();

                } // end of if. 
                else
                {
                    System.out.println("Invalid destination entered, terminating the programme as you have entered the wrong destination twice.");
                    System.exit(0); 
                }
            }
           
        }//end of if. 
        else
        {
            if(counter_global_arr <= 1)
            {
                System.out.println("You get one more chance to fill the right details, otherwise the program will terminate. "); 
                counter_global_arr += 1; 
                input_arrival();
            } // end of if. 
            else
            {
                System.out.println("Invalid destination entered, terminating the programme as you have entered the wrong destination twice.");
                System.exit(0);
            } // end of else. 

        } // end of else. 
    }//end of void

    private void input_depart() 
    {
        String dep = "error"; 
        System.out.println();
        System.out.println(); 
        
        System.out.println("These are the availaible destinations: ");
        for(int i = 0; i<length; i++)
        {
            System.out.println(destinations[i]);
        }// end of for. 
        System.out.println("Which destination would you like to depart from?");
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            dep = inp.readLine();
           
        } // end of try
        catch(Exception e)
        {
            System.out.println(e);
        }// end of catch. 
       
        chooseDeparture(dep);
        
        
    }// end of void

    private void input_arrival() 
    {
        holiday hol = new holiday(departure); 
        String arr = "error"; 
        System.out.println();
        System.out.println(); 
        System.out.println("These are the availaible destinations to go to, in ascending order of cost: ");
        for(int i = 0; i<(length-1); i++)
        {
            System.out.println(hol.dest[i]);
        }// end of for. 
        System.out.println("Which destination would you like to go to?");
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            arr = inp.readLine();
           
        } // end of try
        catch(Exception e)
        {
            System.out.println(e);
        }// end of catch. 
       
        chooseArrival(arr);
        
        
    }// end of void
    private void typeTrip()
    {
        int counter = 0; 
        System.out.println("What type of trip will you be taking?"); 
        System.out.println("One-Way trip or a Retrun Trip"); 
        System.out.println("Please enter 1, for a one way trip and 2 for a return trip ");
        //Prompting the user to choose the trip. 
        Scanner sc = new Scanner(System.in); 
        //Creating an object.
        int choice = sc.nextInt(); 
        if(choice == 1)// to determine the trip type
        {
            trip = false; 
        }// end of if. 
        else if(choice == 2)
        {
            trip = true; 
        }// end of else-if
        else 
        {
            if(counter <= 1)
            {
                System.out.println("Please enter a valid choice, the programme will terminate after another invalid choice. "); 
                counter += 1; 
                typeTrip();
            }
            else
            {
                
            System.out.println("Invalid choice, terminating the program, please restert. ");
            //printing the error message. 
            System.exit(0); 
            //exits the program
            }
        }//end of else. 
        
    }//end of void

    private void calculateCost()
    {
        int cost_per_km = 0; 
        setDistance dist = new setDistance(departure, arrival); 
        if(dist.distance == 0.0)
        {
            System.out.println("Error");

        } // end of if.
        
        
        if(dist.distance<= 500)
        {
            cost_per_km = 30; 
        }
        else if(dist.distance > 500 && dist.distance<=1000)
        {
            cost_per_km = 45; 
        }
        else if(dist.distance> 1000 && dist.distance <= 1500)
        {
            cost_per_km = 60; 
        }
        else if(dist.distance> 1500 && dist.distance <= 2000)
        {
            cost_per_km = 70; 
        } 
        else if(dist.distance>2000)
        {
            cost_per_km = 75;
        }
        if(trip)
        {
            cost = default_cost + (dist.distance*cost_per_km); 
            cost = cost*2; 
        }
        else 
        {
            cost = default_cost + (dist.distance*cost_per_km); 
        }

        

    }

    private void display()
    {
        System.out.println("The total cost for this trip will be: " + cost);

    }
    private void Sequence()
    {
        input_depart();
        input_arrival();
        typeTrip();
        calculateCost();
        display();
        write(); 
    } //end of void. 
    private void write()
    {
        System.out.println("Please give a path to store the text file."); 
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            path = inp.readLine();
            writeToFile write = new writeToFile(path);
            write.write("This is the information entered by You!" + '\n');
            write.write("Name: " + name + '\n');
            write.write("Age: " + age + '\n');
            write.write("Gender: " + gender + '\n');

            write.write(" "); 

            write.write("The destinations chosen by you are: "+ '\n'); 
            write.write("Departure: " + departure + '\n');
            write.write("Arrival: " + arrival + '\n'); 

            if(trip)
            {
                write.write("The trip type is Round-Trip" + '\n'); 
            }
            else
            {
                write.write("The trip type is One-Way" + '\n'); 
            }

            write.write("The total cost is: " + cost + '\n'); 




        }
        catch(Exception e)
        {
            System.out.println(e); 
        }
        System.out.println("File successfully stored at " + path);
    }
  


    


    public static void main(String [] args)
    {
        airplanetickets user = new airplanetickets();
        user.Sequence();
        
        
        
    } // end of main. 
}//end of class


