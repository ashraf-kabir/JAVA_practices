class Node {
    // a node connects two players and also has a length;
    private Player from;
    private Player to;
    private int length;
    
    Player getNext (Player from) {
        if (from.equals(this.from)) {
            return this.to;
        } else if (from.equals(this.to)) {
            return this.from;
        }
        return null;
    }
}