package powerNum;

public class PowerNumAlg {
    
    public Integer power(int x, int n) {
        return power(new Integer(x), new Integer(n));
    }

    public Integer power(Integer x, Integer n) {
        if (isEven(n)) {
            return powerEven(x, n);
        } else {
            return powerEven(x, n-1) * x;
        }
    }
    
    private boolean isEven(Integer n) {
        return (n%2 == 0);
    }
    
    private Integer powerEven(Integer x, Integer n) {
        if (n <= 1) {
            return x;
        }
        
        return powerEven(x, n) * powerEven(x, n);
    }
    
}
