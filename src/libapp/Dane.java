package libapp;

public class Dane {
    protected static double freq, samp, alias, range;
    
    protected static double calculate() {
        // res = ((freq+samp/2) mod samp) - samp/2
        double temp = (freq + 0.5*samp)/samp;
        double res = (temp - Math.floor(temp))*samp - 0.5*samp;
        return res;
    }
}
