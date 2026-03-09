public class ShelfShelfShelfShelf
{
    ShelfShelfShelf[] shelfShelfShelves;

    public ShelfShelfShelfShelf()
    {
        this.shelfShelfShelves = null;
    }

    public void add(ShelfShelfShelf shelf) {
        ShelfShelfShelf[] tempShelfShelfShelves = new ShelfShelfShelf[shelfShelfShelves.length+1];

        for (int i = 0; i < tempShelfShelfShelves.length; i++) {
            tempShelfShelfShelves[i] = shelfShelfShelves[i];
        }
        tempShelfShelfShelves[shelfShelfShelves.length] = shelf;
        shelfShelfShelves = tempShelfShelfShelves;
    }

    public ShelfShelfShelf[] superGet()
    {
        return shelfShelfShelves;
    }
}
