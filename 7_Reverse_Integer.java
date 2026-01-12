public class Reverse_Integer {
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
    public int reverse(int x) {
            int reversed = 0;
            
            while (x != 0) {
            int digit = x % 10;
             if (reversed > MAX / 10 || reversed < MIN / 10){
                    return 0;
             }
           
            reversed = reversed * 10 + digit;
             x /= 10;
        }
        return reversed;
        }
    }

