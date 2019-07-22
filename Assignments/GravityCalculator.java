class GravityCalculator {
<<<<<<< HEAD
  public static void main(String[] args){
=======
  public static void main(String[] arguments){
>>>>>>> 2dd2abd9ba9a38ea02b95fb267860c11f8582b47
    double gravity =-9.81; // Earth's gravity in m/s^2
    double initialVelocity = 0.0;
    double fallingTime = 10.0;
    double initialPosition = 0.0;
    double finalPosition = 0.5*gravity*Math.pow(fallingTime, 2)
                           + initialVelocity*fallingTime + initialPosition;
    System.out.println("The object's position after " + fallingTime +
                       " seconds is " + finalPosition + " m.");
  }
}
