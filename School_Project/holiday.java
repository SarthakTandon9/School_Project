package School_Project;
public class holiday extends helper
{
    
    //distance constants required for the costing.
    public String dest[] = new String[4]; 


    holiday(String depart)
    {
        dest = ascendDestinations(depart);
    } // end of constructor. 
    public String[] ascendDestinations(String depart)
    {
        String places_init[] = new String[3]; 
        String places_final[] = new String[3];
        String retVal[] = new String[3]; 
        if(depart.equals(destinations[0]))
        {
            places_init = findDepart(destinations, depart); 
            places_final = bubble_sort(mum_dist, places_init); 
        } // end of if. 
        else if(depart.equals(destinations[1]))
        {
            places_init = findDepart(destinations, depart); 
            places_final = bubble_sort(kol_dist, places_init); 
        } //end of else-if. 
        else if(depart.equals(destinations[2]))
        {
            places_init = findDepart(destinations, depart); 
            places_final = bubble_sort(chen_dist, places_init); 
        }//end of else-if. 
        else if(depart.equals(destinations[3]))
        {
            places_init = findDepart(destinations, depart); 
            places_final = bubble_sort(del_dist, places_init); 
        } //end of else-if. 
        else if(depart.equals(destinations[4]))
        {
            places_init = findDepart(destinations, depart); 
            places_final = bubble_sort(ban_dist, places_init); 
        } //end of else-if. 
        else
        {
            System.out.println("lol u dork, there is an error cuz u dumb");
        } //end of else. 

        retVal = places_final; 
        return retVal; 
        
    } 

    //bubble sort to return array in assending order of cost
    private static String[] bubble_sort(double[] dest, String[] places)
    {
        
        int n = dest.length; 
        String retVal[] = new String[n-1]; 
        double temp = 0; 
        String rep = ""; 
        for(int i = 0 ; i< n; i++)
        {
            for(int j = 1; j<(n-i); j++)
            {
                if(dest[j-1] > dest[j])
                {
                    temp = dest[j-1]; 
                    dest[j-1] = dest[j]; 
                    dest[j] = temp; 
                    

                    rep = places[j-1]; 
                    
                    places[j-1] = places[j]; 
                    places[j] = rep; 
                } // end of if.  
                else
                {
                    continue; 
                } // end of else. 
            }// end of nested for. 
        }//end of for.
        retVal = places; 
        return retVal;  
    } // end of void. 

    private static String[] findDepart(String[] places, String depart)
    {
       
        String retVal[] = new String[(places.length-1)]; 
        for(int i = 0, k = 0; i<places.length; i++)
        {
            if(depart.equals(places[i]))
            {
                continue; 

            }// end of if. 
            else
            {
                retVal[k++] = places[i];  
            } //end of else. 
        } //end of for. 
        
        return retVal; 

    }
}