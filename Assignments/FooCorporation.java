class FooCorporation {

  public static void main(String[] args) {
    double basePay;
    int hoursWorked;

    basePay = 7.5;
    hoursWorked = 35;
    calculation(basePay, hoursWorked);

    basePay = 8.2;
    hoursWorked = 47;
    calculation(basePay, hoursWorked);

    basePay = 10.0;
    hoursWorked = 73;
    calculation(basePay, hoursWorked);
  }

  static void calculation(double rate, int time) {
    if (rate < 8.0) {
      System.out.println("Employee is not paid enough.");
    } else if (time > 60) {
      System.out.println("Employee worked over allowed company limit.");
    } else if (time < 40) {
      System.out.println("Employee made $" + rate*time + ".");
    } else if (time > 40 && time < 60) {
      System.out.println("Employee made $" + (rate*40 + ((time - 40) *
                                                         (1.5 * time))) + ".");
    }
  }

}
