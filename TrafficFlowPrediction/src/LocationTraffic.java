
import java.util.Vector;


public class LocationTraffic {
    
    double lat;
    
    double longt;
    
    String loc;
     
    
    DayTraffic[]  alldaytraff = new  DayTraffic[7];
    
    double dis;
    
    Vector<LocationTraffic> correl = new Vector<LocationTraffic>();
    
    LocationTraffic()
    {
        
        for (int i=0;i<alldaytraff.length;i++)
        {
            alldaytraff[i] = new DayTraffic();
            
        }
        
    }
    
    
    
    
}
