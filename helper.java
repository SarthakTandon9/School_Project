public class helper {
    
    final double MtoK = 2209.0,  MtoCh = 1336.8,  MtoD = 1424.2,  MtoB = 983.8;
    final double  KtoCh = 1674.4, KtoD = 1517.0, KtoB = 1887.8; 
    final double ChtoD = 2201.7, ChtoB = 346.8; 
    final double DtoB = 2176.8; 

    double mum_dist[] = {MtoK,  MtoCh,  MtoD,  MtoB}; 
    double kol_dist[] = {MtoK,  KtoCh,  KtoD,  KtoB}; 
    double chen_dist[] = {MtoCh,  KtoCh,  ChtoD,  ChtoB}; 
    double del_dist[] = {MtoD,  KtoD,  ChtoD,  DtoB}; 
    double ban_dist[] = {MtoB,  KtoB,  ChtoB,  DtoB}; 

}