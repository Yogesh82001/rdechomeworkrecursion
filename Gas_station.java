public class Gas_station {
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        complete_station(gas,cost);

    }
    public static int complete_station(int[] gas, int[] cost) {
        int totalleft=0;
        for(int i=0;i<gas.length;i++){
            totalleft+=gas[i]-cost[i];

        }
        if(totalleft<0){
            return -1;
        }
        int start=0,remaining =0;
        for(int i=0;i<gas.length;i++){
            int currentgas=gas[i]+remaining;
            int currentcost=cost[i];
            remaining =currentgas-currentcost;
            if(remaining<0){
                remaining =0;
                start=i+1;
            }
        }
        return start;
 }
 }
    
