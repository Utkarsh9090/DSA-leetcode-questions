public class 66_PlusOne {
  
        public int[] plusOne(int[] digits) {
            int n = digits.length-1;
            while(n >= 0 && digits[n] == 9){
                digits[n--] = 0 ;
            }
            if(n < 0 ){
               int[] newArr = new int[digits.length + 1];
                newArr[0]=1;
                return newArr;
            }
            else{
                 digits[n]++;
            }
            return digits;
        }
    
}
