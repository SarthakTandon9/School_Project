import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

    public class airplanetickets {
    String destinations[] = { "Mumbai", "Kolkata", "Chennai", "Delhi", "Bangalore" };
    String name, gender, departure , arrival;
    int age = 0;
    boolean trip = false;
    double distance, cost, default_cost = 2500; 
    final int length = 5; 
    int counter_global_arr =  0, counter_global_dep = 0; 

    airplanetickets() {
        
        registration();
        displayCredentials();
        
    }

    public void registration() {
        int counter = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = sc.nextLine();
        System.out.println("Please enter your age: ");
        age = sc.nextInt();
        System.out.println("Please enter your gender: ");
        gender = sc.next();
        switch (gender)
        /* we use this to determine whether to add Mr. or Mrs */
        {
            case "m":
            case "M":
            case "male":
            case "Male":

                if (age >= 18) {
                    name = "Mr. " + name;
                } // end of if
                else {
                    name = "Master. " + name;
                }

                break;

            case "f":
            case "F":
            case "female":
            case "Female":

                if (age >= 18) {
                    name = "Mrs. " + name;
                } // end of if
                else {
                    name = "Miss. " + name;
                }
                break;
            default:
                if(counter <= 1)
                {
                    System.out.println("Please do not make a mistake, again, otherwise the program will terminate. "); 
                    counter += 1; 
                }

        }// end of switch case
        

    }// end of void

    void displayCredentials() {
        System.out.println();
        System.out.println("This is the information entered by You!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        

    }

    void chooseDeparture(String depart)
    {
        
        for(int i = 0; i<length; i++)
        {
            if(depart.equals(destinations[i]))
            {
                
                departure = depart; 
                
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
           
        }//end of if. 
        else
        {
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
    void chooseArrival(String arr)
    {
        
        for(int i = 0; i<length; i++)
        {
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
            System.out.println("Destination successfully chosen!");
           
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

    void input_depart() 
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

    void input_arrival() 
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
    void typeTrip()
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

    void calculateCost()
    {
        int cost_per_km = 0; 
        setDistance dist = new setDistance(departure, arrival); 
        if(dist.distance != 0.0)
        {
            distance = dist.distance; 

        } // end of if.
        else
        {
            System.out.println("Error");
        } //end of else.
        
        if(distance <= 500)
        {
            cost_per_km = 30; 
        }
        else if(distance > 500 && distance<=1000)
        {
            cost_per_km = 45; 
        }
        else if(distance > 1000 && distance <= 1500)
        {
            cost_per_km = 60; 
        }
        else if(distance > 1500 && distance <= 2000)
        {
            cost_per_km = 70; 
        } 
        else if(distance >2000)
        {
            cost_per_km = 75;
        }
        if(trip)
        {
            cost = default_cost + (distance*cost_per_km); 
            cost = cost*2; 
        }
        else 
        {
            cost = default_cost + (distance*cost_per_km); 
        }

    }

    void display()
    {
        System.out.println("The total cost for this trip will be: " + cost);

    }
    void Sequence()
    {
        input_depart();
        input_arrival();
        typeTrip();
        calculateCost();
        display();
    } //end of void. 



    


    public static void main(String [] args)
    {
        airplanetickets user = new airplanetickets();
        user.Sequence();
        
        
        
    } // end of main. 
}//end of class


