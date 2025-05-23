package DAY_1;

interface Actor {
    void act();

    // Nested Interface
    interface Dialogue {
        void speak();
    }
}

// Implementing outer interface
class Q25_ShahRukhKhan implements Actor {
    @Override
    public void act() {
        System.out.println("Shah Rukh Khan is acting in a romantic scene.");
    }
}

// Implementing nested interface
class SRKDialogue implements Actor.Dialogue {
    @Override
    public void speak() {
        System.out.println("\"Don ko pakadna mushkil hi nahi, namumkin hai!\"");
    }
}

 class IndianActor {
    public static void main(String[] args) {
        Q25_ShahRukhKhan srk = new Q25_ShahRukhKhan();
        srk.act();

        Actor.Dialogue dialogue = new SRKDialogue();
        dialogue.speak();
    }
}
