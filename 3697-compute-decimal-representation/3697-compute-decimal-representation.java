class Solution {

    public int dc(int d) {
        int count = 0;

        while (d != 0) {
            count++;
            d = d / 10;
        }

        return count;
    }

    public void isFill(ArrayList<Integer> li, int x) {

        int count = 0;

        while (x != 0) {

            int rem = x % 10;

            if (rem != 0) {
                int num = rem;

                for (int i = 0; i < count; i++) {
                    num = num * 10;
                }

                li.add(num);
            }

            count++;
            x = x / 10;
        }
    }

    public int[] decimalRepresentation(int n) {

        int x = dc(n);

        if (x == 1) {
            return new int[]{n};
        }

        ArrayList<Integer> li = new ArrayList<>();

        isFill(li, n);

        Collections.reverse(li);

        int res[] = new int[li.size()];

        for (int i = 0; i < li.size(); i++) {
            res[i] = li.get(i);
        }

        return res;
    }
}