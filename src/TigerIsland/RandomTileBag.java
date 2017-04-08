package TigerIsland;

import java.util.LinkedList;

public class RandomTileBag implements TileBag {

    private LinkedList<Tile> bag;
    private int numberOfTilesInBag;

    public RandomTileBag() {
        bag = new LinkedList<Tile>();
        permutationForAllTiles();
    }

    @Override
    public Tile drawTile() {
        numberOfTilesInBag--;
        return this.bag.pop();
    }

    public LinkedList<Tile> getAllTilesInBag() {
        return this.bag;
    }
    @Override
    public int getNumberOfTilesInBag() {
        return numberOfTilesInBag;
    }

    private void permutationForAllTiles() {
        for (Terrain terrain_1 : Terrain.values() ) {
            for ( Terrain terrain_2 : Terrain.values() ) {
                if( terrain_1 != Terrain.VOLCANO && terrain_1 != Terrain.EMPTY &&
                        terrain_2 != Terrain.VOLCANO && terrain_2 != Terrain.EMPTY) {

                    Tile newTile = new Tile(terrain_1, terrain_2);
                    this.bag.push(newTile);
                    this.bag.push(newTile);
                    this.bag.push(newTile);
                }

            }
        }

        numberOfTilesInBag = bag.size();
    }

}
