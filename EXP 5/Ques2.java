
class Player {

    String name;
    int age;
    String position;

    Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    void play() {
        System.out.println(name + " is playing.");
    }

    void train() {
        System.out.println(name + " is training.");
    }
}

class Cricket_Player extends Player {

    Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Football_Player extends Player {

    Football_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Hockey_Player extends Player {

    Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Ques2 {

    public static void main(String[] args) {
        Cricket_Player c = new Cricket_Player("Virat Kohli", 32, "Batsman");
        c.play();
        c.train();

        Football_Player f = new Football_Player("Messi", 31, "Right-footed");
        f.play();
        f.train();

        Hockey_Player h = new Hockey_Player("Dhanraj", 48, "Left-hand paddle");
        h.play();
        h.train();
    }
}
