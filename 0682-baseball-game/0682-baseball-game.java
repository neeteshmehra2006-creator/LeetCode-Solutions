 class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();

        for (String x : operations) {

            if (x.equals("C")) {
                st.pop();
            }
            else if (x.equals("D")) {
                st.push(st.peek() * 2);
            }
            else if (x.equals("+")) {
                int last = st.peek();
                int slast = st.get(st.size() - 2);
                st.push(last + slast);
            }
            else {
                st.push(Integer.parseInt(x));
            }
        }

        int sum = 0;

        while (st.size() > 0) {
            sum = sum + st.pop();
        }

        return sum;
    }
}