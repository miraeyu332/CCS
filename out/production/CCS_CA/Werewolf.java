class Werewolf extends Monster {
    Werewolf(int x, int y, Player owner) {
        super(x, y, owner);
    }

    char getSymbol() {
        return 'W';
    }
}
