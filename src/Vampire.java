class Vampire extends Monster {
    Vampire(int x, int y, Player owner) {
        super(x, y, owner);
    }

    @Override
    char getSymbol() {
        return 'V';
    }

//    @Override
//    boolean canMove(int newX, int newY) {
//        return (x == newX || y == newY || Math.abs(x - newX) == Math.abs(y - newY)) && Math.abs(x - newX) <= 2 && Math.abs(y - newY) <= 2;
//    }
}
