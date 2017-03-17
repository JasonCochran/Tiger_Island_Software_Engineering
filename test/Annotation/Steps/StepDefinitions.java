package test.Annotation.Steps;
import TigerIsland.Board;
import TigerIsland.Terrain;
import TigerIsland.Tile;
import TigerIsland.TileBag;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    private TileBag testBag = null;
    private Tile testTile = null;
    private Board board = null;

    @Given("^a new tile bag$")
    public void initTileBag() {
        testBag = new TileBag();
    }

    @Given("^a new board$")
    public void newBoard() throws Throwable {
        board = new Board();
        Assert.assertNotNull(board);
    }

    @When("^a tile is drawn$")
    public void tileDrawn() throws Throwable {
        this.testTile = testBag.drawTile();
    }
    @Then("^the bag should have (\\d+) tiles$")
    public void tilesExistingInBag(int number) {
        assertEquals(number, testBag.getNumberOfTilesInBag());

        System.out.println("Test1 Pass");
    }

    @Then("^I should be returned a tile instance$")
    public void I_should_be_returned_a_tile_instance() {
        assert( testTile != null );
        System.out.println("Test2 Pass");
    }

    @Then("^the tile should have terrains$")
    public void tileTerrainCheck() {
        Terrain[] result = this.testTile.getTerrainsClockwiseFromVolcano();
        assertEquals(result[0].toString(),Terrain.VOLCANO.toString());
        assertThat(result[1].toString(), anyOf(
                containsString(Terrain.GRASSLAND.toString()),
                containsString(Terrain.JUNGLE.toString()),
                containsString(Terrain.LAKE.toString()),
                containsString(Terrain.ROCK.toString()))
        );
        assertThat(result[2].toString(), anyOf(
                containsString(Terrain.GRASSLAND.toString()),
                containsString(Terrain.JUNGLE.toString()),
                containsString(Terrain.LAKE.toString()),
                containsString(Terrain.ROCK.toString()))
        );
        System.out.println("Test3 Pass");
    }
}