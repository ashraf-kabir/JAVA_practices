class Route {
    private List<node> nodes;
    private int length;
    
    void buildRoute (Player from, Player to) {
        // Starting at 'from' find the shortest routes to each player
        ArrayList<distance> distances = new ArrayList<distance>();
        distances.add(new Distance(from));
        int pos = 0;
        while (pos < distances.size()) {
            Distance current = distances.get(pos);
            for (Node node : current.getConnections()) {
                int length = current.length + node.getLength();
                Player dest = node.getNext(current);
                Distance next = null;
                for (Distance d : distances) {
                    if (d.player.equals(dest)) {
                        next = d;
                        break;
                    }
                }
                if (next == null) {
                    next = new Distance(dest);
                    next.length = length+1;  // this will now be updated below
                    distances.add(next);
                }
                
                if (length < next.length) {
                    next.nodes = current.nodes.clone();
                    next.nodes.add(node);
                    next.length = length;
                }
            }
            pos++;
        }
        // find the final destinatiogn and take the route:
        for (Distance d : distances) {
            if (d.player.equals(to)) {
                this.nodes = d.nodes;
                this.length = d.length;
                break;
            }
        }
    }
    
    class Distance {
        
        Player player;
        ArrayList<nodes> nodes;
        int length;
        
        Distance (Player player) {
            this.player = player;
            this.length = 0;
            this.nodes = new ArrayList<nodes>();
        }
 
        public boolean equals(Object o) {
            // shortend version
            return (this.player.equals((Distance)o.player));
        }
    }
}