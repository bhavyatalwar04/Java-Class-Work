try {
            t1.join(); //it force to complete the task of t1 thread.
        } catch (Exception e) {
            System.out.println(e);
        }