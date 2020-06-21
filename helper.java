package School_Project;

public class helper 
{
    public String destinations[] = { "Mumbai", "Kolkata", "Chennai", "Delhi", "Bangalore" };
    
    public final double MtoK = 2209.0,  MtoCh = 1336.8,  MtoD = 1424.2,  MtoB = 983.8;
    public final double  KtoCh = 1674.4, KtoD = 1517.0, KtoB = 1887.8; 
    public final double ChtoD = 2201.7, ChtoB = 346.8; 
    public final double DtoB = 2176.8; 

    public double mum_dist[] = {MtoK,  MtoCh,  MtoD,  MtoB}; 
    public double kol_dist[] = {MtoK,  KtoCh,  KtoD,  KtoB}; 
    public double chen_dist[] = {MtoCh,  KtoCh,  ChtoD,  ChtoB}; 
    public double del_dist[] = {MtoD,  KtoD,  ChtoD,  DtoB}; 
    public double ban_dist[] = {MtoB,  KtoB,  ChtoB,  DtoB}; 

}