package model;

public class Tile {
    private TileType type;
    private int elevation;
    private int distanceToObstacle;
    private int x, y;

    public Tile(TileType type, int elevation, int x, int y) 
    {
        this.type = type;
        this.elevation = elevation;
        this.x = x;
        this.y = y;
        this.distanceToObstacle = -1; //////////// 
    }

    public TileType getType() {
        return type;
    }

    public int getElevation() {
        return elevation;
    }

    public int getDistanceToObstacle() {
        return distanceToObstacle;
    }

    public void setDistanceToObstacle(int distance) {
        this.distanceToObstacle = distance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
