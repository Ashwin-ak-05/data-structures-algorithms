package org.example.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FractionalKnapsack {
    class PricePerKg implements Comparable<PricePerKg>{
        int index;
        double price;
        int weight;
        int val;

        PricePerKg(int index, int val, int weight){
            this.index = index;
            this.weight = weight;
            this.val = val;
            this.price = (double) this.val/this.weight;
        }

        @Override
        public int compareTo(PricePerKg obj) {
            return Double.compare(this.price, obj.price);
        }
    }

    List<PricePerKg> valueObj = new ArrayList<>();

    double ans = 0;


    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        for (int i = 0; i < val.size(); i++) {
            PricePerKg obj = new PricePerKg(i,val.get(i),wt.get(i));
            valueObj.add(obj);
        }

        Collections.sort(valueObj);

        for(int i = 0; i<valueObj.size();i++){
            if(valueObj.get(i).weight <= capacity){
                ans += valueObj.get(i).price * valueObj.get(i).weight;
                capacity = capacity - valueObj.get(i).weight;
            }
            else{
                ans += valueObj.get(i).price * capacity;
                break;
            }
        }

        return ans;
    }
}
