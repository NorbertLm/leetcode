public class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> output = new ArrayList<String>();
        
        for (int i = 1; i < n + 1; i++) {
            
            if (i%3 == 0 && i%5 == 0) {
                output.add("FizzBuzz");
            }
            else if (i%5 == 0) {
                output.add("Buzz");
            }
            else if (i%3 == 0) {
                output.add("Fizz");
            }
            else {
                output.add(Integer.toString(i));
            }
        }
        
        return output;
    }
}