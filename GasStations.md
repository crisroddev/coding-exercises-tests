# Gas Stations
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i]. You have a car with an unlimited gas tank, and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
Given two integer arrays of gas and cost, return the starting gas station’s index if you can travel around the circuit once in the clockwise direction, otherwise return -1.
\
* Input: [] gas and [] cost
 * Output: fuelForNextStation > gas[i] - cost[i]
 * fuelForNextStation = fuelForNextStation + gas[i] - cost[i]
 * Like start with 0 gas I put 2 of gas and the cost for next station is < that my gas I go fot next station
 * Pseudo Code
 * start = 0 gas
 * totalTrip = 0
 * fuelForTrip = 0
 * fuelForTrip = fuelForTrip + gas[i] - cost[i]
 * if(fuelForTrip <= cost){}

 ```
 public class GasStations {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 6, 7};

        int start = 0;
        int total = 0;
        int fuelForTrip = 0;

        for(int i = 0; i < gas.length; i++){
            fuelForTrip = fuelForTrip + gas[i] - cost[i];
            if(fuelForTrip < 0){
                start = i + 1;
                total = total + fuelForTrip;
                fuelForTrip = 0;
            }
        }
        if(total + fuelForTrip < 0){
            System.out.println("-1");
            // return -1;
        }
        System.out.println(start);
        //return start;
    }
}
 ```