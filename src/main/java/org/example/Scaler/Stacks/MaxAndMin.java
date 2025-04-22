//package org.example.Scaler.Stacks;
//
//public class MaxAndMin {
//    // public class Solution {
////     public int solve(int[] A) {
////     }
//
//
////     public int[] getPrevSmall(int[] A){
////         int n = A.length;
////         Stack<Integer> stack = new Stack<>();
////         int[] ans = new int[n];
////         Arrays.fill(ans,-1);
//
////         for(int i = 0; i<n; i++ ){
////             if(!stack.isEmpty() && stack.peek()>=A[i]){
////                 stack.pop();
////             }
//
////             if(!stack.isEmpty()){
////                 ans[i] = stack.peek();
////             }
////         }
////         return ans;
////     }
//
////     public int[] getNextSmall(int[] A){
////         int n = A.length;
////         Stack<Integer> stack = new Stack<>();
////         int[] ans = new int[n];
////         Arrays.fill(ans,-1);
//
////         for(int i = n-1; i>=0; i-- ){
////             if(!stack.isEmpty() && stack.peek()>=A[i]){
////                 stack.pop();
////             }
//
////             if(!stack.isEmpty()){
////                 ans[i] = stack.peek();
////             }
////         }
////         return ans;
////     }
//// }
//
//    public class Solution {
//        public int solve(int[] A) {
//            //optimized approach
//            //TC-O(n),SC-O(n)
//            int mod = 1000000007;
//            long sum_of_max=0;
//            long sum_of_min=0;
//            Stack<Integer> st=new Stack<>();
//            int[] naL=new int[A.length];
//            int[] naR=new int[A.length];
//            int[] naL1=new int[A.length];
//            int[] naR1=new int[A.length];
//            //find the next smaller to left
//            for(int i=0;i<A.length;i++){
//                while(!st.isEmpty() && A[st.peek()]>=A[i]){
//                    st.pop();
//                }
//                if(st.isEmpty()){
//                    naL[i]=-1;
//                }else{
//                    naL[i]=st.peek();
//                }
//                st.push(i);
//            }
//            st.clear();
//            //find the next smaller to right
//            for(int i=A.length-1;i>=0;i--){
//                while(!st.isEmpty() && A[st.peek()]>=A[i]){
//                    st.pop();
//                }
//                if(st.isEmpty()){
//                    naR[i]=A.length;
//                }else{
//                    naR[i]=st.peek();
//                }
//                st.push(i);
//            }
//            st.clear();
//            //find the next max to left
//            for(int i=0;i<A.length;i++){
//                while(!st.isEmpty() && A[st.peek()]<=A[i]){
//                    st.pop();
//                }
//                if(st.isEmpty()){
//                    naL1[i]=-1;
//                }else{
//                    naL1[i]=st.peek();
//                }
//                st.push(i);
//            }
//            st.clear();
//            //find the next max to right
//            for(int i=A.length-1;i>=0;i--){
//                while(!st.isEmpty() && A[st.peek()]<=A[i]){
//                    st.pop();
//                }
//                if(st.isEmpty()){
//                    naR1[i]=A.length;
//                }else{
//                    naR1[i]=st.peek();
//                }
//                st.push(i);
//            }
//            //calculate sum of Maximums and Minimums
//            for(int i=0;i<A.length;i++){
//                //Number of subarrays where A[i] is maximum
//                //System.out.println(naL1[i]);
//                long max_contrib=(long)(i-naL1[i])*(naR1[i]-i);
//                sum_of_max=(sum_of_max+ max_contrib*A[i])%mod;
//                //Number of subarrays where A[i] is minimum
//                long min_contrib=(long)(i-naL[i])*(naR[i]-i);
//                sum_of_min= (sum_of_min +min_contrib*A[i])%mod;
//
//            }
//            int ans=0;
//            ans=(int)((sum_of_max-sum_of_min+mod)%mod);
//            return ans;
//        }
//    }
//
//}
