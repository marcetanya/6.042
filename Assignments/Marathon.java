class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        int firstRunner = firstRunner(names, times);
        int secondRunner = secondRunner(names, times);

        System.out.println(names[firstRunner] + " " + times[firstRunner]);
        System.out.println(names[secondRunner] + " " + times[secondRunner]);
    }

    public static int firstRunner (String[] runners, int[] times) {
      int tracker = 0;

      for (int i = 1; i < runners.length; i++) {
        if (times[i] < times[tracker]) {
          tracker = i;
        }
      }

      return tracker;
    }

    public static int secondRunner (String[] runners, int[] times) {
      int firstRunner = firstRunner(runners, times);
      int tracker = 0;

      for (int i = 1; i < runners.length; i++) {
        if (times[i] < times[tracker]) {
          if (i != firstRunner) {
            tracker = i;
          }
        }
      }

      return tracker;
    }
}
