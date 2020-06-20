
public class setDistance extends helper
{
   
    //distance constants required for the costing.
    

    String destinations[] = { "Mumbai", "Kolkata", "Chennai", "Delhi", "Bangalore" };
    //The destinations array, determined by default. 
    double cost = 0.0; 
    double distance = 0.0;  
    
    setDistance(String departure, String arr)
    {
        determineDestinations(departure, arr);
    } //end of construcot. 
    public void determineDestinations(String depart, String arrival)
    {
        switch(depart)
        {
            case "Mumbai":
                arrMumbai(arrival);
                break;
            case "Kolkata": 
                arrKolkata(arrival);
                break; 
            case "Chennai": 
                arrChennai(arrival);
                break; 
            case "Delhi": 
                arrDelhi(arrival);
                break; 
            case "Bangalore": 
                arrBangalore(arrival);
                break; 
            default: 
                System.out.println("Invalid statement entered, terminating the programme");
                System.exit(0);

        }
    }
    void arrMumbai(String arrival)
    {
        if(arrival.equals(destinations[1]))
        {
            distance = MtoK; 
            //helloll
            
        } // end of if. 
        else if(arrival.equals(destinations[2]))
        {
            distance = MtoCh; 
        } // end of else-if. 
        else if(arrival.equals(destinations[3]))
        {
            distance = MtoD; 
        } // end of else-if. 
        else if(arrival.equals(destinations[4]))
        {
            distance = MtoB; 
        } // end of else-if. 
        else
        {
            System.out.println("Invalid statement entered, terminating the program");
            System.exit(0); 
        } // end of else. 
        
    }// end of void. 

    void arrKolkata(String arrival)
    {
        if(arrival.equals(destinations[0]))
        {
            distance = MtoK; 
        } // end of if. 
        else if(arrival.equals(destinations[2]))
        {
            distance = KtoCh; 
        } // end of else-if. 
        else if(arrival.equals(destinations[3]))
        {
            distance = KtoD; 
        } // end of else-if. 
        else if(arrival.equals(destinations[4]))
        {
            distance = KtoB; 
        } // end of else-if. 
        else
        {
            System.out.println("Invalid statement entered, terminating the program");
            System.exit(0); 
        } // end of else. 
        
    }// end of void. 
    void arrChennai(String arrival)
    {
        if(arrival.equals(destinations[0]))
        {
            distance = MtoCh; 
        } // end of if. 
        else if(arrival.equals(destinations[1]))
        {
            distance = KtoCh; 
        } // end of else-if. 
        else if(arrival.equals(destinations[3]))
        {
            distance = ChtoD; 
        } // end of else-if. 
        else if(arrival.equals(destinations[4]))
        {
            distance = ChtoB; 
        } // end of else-if. 
        else
        {
            System.out.println("Invalid statement entered, terminating the program");
            System.exit(0); 
        } // end of else. 
        
    }// end of void. 
    //String destinations[] = { "Mumbai", "Kolkata", "Chennai", "Delhi", "Bangalore" };
    void arrDelhi(String arrival)
    {
        if(arrival.equals(destinations[0]))
        {
            distance = MtoD; 
        } // end of if. 
        else if(arrival.equals(destinations[1]))
        {
            distance = KtoD; 
        } // end of else-if. 
        else if(arrival.equals(destinations[2]))
        {
            distance = ChtoD; 
        } // end of else-if. 
        else if(arrival.equals(destinations[4]))
        {
            distance = DtoB; 
        } // end of else-if. 
        else
        {
            System.out.println("Invalid statement entered, terminating the program");
            System.exit(0); 
        } // end of else. 
        
    }// end of void. 
    void arrBangalore(String arrival)
    {
        if(arrival.equals(destinations[0]))
        {
            distance = MtoB; 
        } // end of if. 
        else if(arrival.equals(destinations[1]))
        {
            distance = KtoB; 
        } // end of else-if. 
        else if(arrival.equals(destinations[2]))
        {
            distance = ChtoB; 
        } // end of else-if. 
        else if(arrival.equals(destinations[3]))
        {
            distance = DtoB; 
        } // end of else-if. 
        else
        {
            System.out.println("Invalid statement entered, terminating the program");
            System.exit(0); 
        } // end of else. 
        
    }// end of void.
    



} // end of class. 