public class ShelfShelfShelfShelfShelf
{
    ShelfShelfShelfShelf[] shelfShelfShelfShelfShelves;

    public ShelfShelfShelfShelfShelf()
    {
        this.shelfShelfShelfShelfShelves = null;
    }

    public void add(ShelfShelfShelfShelf shelf) {
        ShelfShelfShelfShelf[] tempShelfShelfShelfShelfShelves = new ShelfShelfShelfShelf[this.shelfShelfShelfShelfShelves.length + 1];

        for (int i = 0; i < tempShelfShelfShelfShelfShelves.length; i++) {
            tempShelfShelfShelfShelfShelves[i] = shelfShelfShelfShelfShelves[i];
        }
        tempShelfShelfShelfShelfShelves[shelfShelfShelfShelfShelves.length] = shelf;
        shelfShelfShelfShelfShelves = tempShelfShelfShelfShelfShelves;
    }

    public ShelfShelfShelfShelf[] superGet()
    {
        return shelfShelfShelfShelfShelves;
    }
}
