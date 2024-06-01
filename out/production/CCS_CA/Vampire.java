class Vampire extends Monster {
    Vampire(int x, int y, Player owner) {
        super(x, y, owner);
    }

    char getSymbol() {
        return 'V';
    }
}
