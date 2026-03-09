public class ShelfShelf
{
    Shelf[] shelves;

    public ShelfShelf()
    {
        this.shelves = null;
    }

    public void add(Shelf shelf) {
        Shelf[] tempShelves = new Shelf[shelves.length+1];

        for (int i = 0; i < tempShelves.length; i++) {
            tempShelves[i] = shelves[i];
        }
        tempShelves[shelves.length] = shelf;
        shelves = tempShelves;
    }

    public Shelf[] superGet()
    {
        return shelves;
    }
}
