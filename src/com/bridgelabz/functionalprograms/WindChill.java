package com.bridgelabz.functionalprograms;

/*Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:
w=35.74 + 0.6215 t +(0.4275 t - 35.75) v^0.16.*/

public class WindChill {

	public static void main(String[] args) {
		
		//takes temperature and wind speed command line argument
		double temperature = Double.parseDouble(args[0]);
        double windSpeed = Double.parseDouble(args[1]);
        
        //calculate wind chill using formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        
        //print wind chill
        System.out.println("The wind chill is " + windChill);

	}

}
