package org.example.graphs;

import java.util.*;

public class CheapestFlight {
    class Flight{
        int from;
        int to;
        int cost;
        int count;

        Flight(int from, int to, int cost){
            this.from = from;
            this.to = to;
            this.cost = cost;
            this.count = 0;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] cost_list = new int[n][2];
        for(int[] arr : cost_list){
            arr[0] = Integer.MAX_VALUE;
        }
        //Arrays.fill(cost_list,Integer.MAX_VALUE);
        ArrayList<ArrayList<Flight>> flightList = new ArrayList<>();
        PriorityQueue<Flight> pq = new PriorityQueue<>(Comparator.comparing(flight -> flight.cost));

        for(int i = 0; i<n; i++){
            flightList.add(new ArrayList<>());
        }

        for(int i = 0; i<flights.length; i++){
            int from = flights[i][0];
            int to = flights[i][1];
            int cost = flights[i][2];

            Flight flight = new Flight(from,to,cost);
            flightList.get(flight.from).add(flight);
        }

        pq.add(new Flight(src,src,0));

        while (!pq.isEmpty()){
            Flight temp = pq.poll();
            if((cost_list[temp.to][0] == Integer.MAX_VALUE || temp.count < cost_list[temp.to][1]) && temp.count <= k+1 ){
                cost_list[temp.to][0] = temp.cost;
                cost_list[temp.to][1] = temp.count;
                ArrayList<Flight> list = flightList.get(temp.to);

                for(int i = 0; i< list.size(); i++){
                    Flight flight = list.get(i);
                    if(cost_list[flight.to][0] == Integer.MAX_VALUE){
                        int flight_cost = flight.cost + temp.cost;
                        int flight_count = temp.count +1;
                        Flight new_flight = new Flight(flight.from,flight.to,flight_cost);
                        new_flight.count = flight_count;
//                        flight.cost = flight.cost + temp.cost;
//                        flight.count =  temp.count + 1;
                        pq.add(new_flight);
                    }

                }
            }
        }

        if(cost_list[dst][0] != Integer.MAX_VALUE){
            return cost_list[dst][0];
        }
        return -1;
    }
}
