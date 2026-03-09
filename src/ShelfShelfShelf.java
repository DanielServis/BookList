public class ShelfShelfShelf
{
    ShelfShelf[] shelfshelves;

    public ShelfShelfShelf()
    {
        this.shelfshelves = null;
    }

    public void add(ShelfShelf shelf) {
        ShelfShelf[] tempShelfShelves = new ShelfShelf[shelfshelves.length+1];

        for (int i = 0; i < tempShelfShelves.length; i++) {
            tempShelfShelves[i] = shelfshelves[i];
        }
        tempShelfShelves[shelfshelves.length] = shelf;
        shelfshelves = tempShelfShelves;
    }

    public ShelfShelf[] superGet()
    {
        return shelfshelves;
    }
}
