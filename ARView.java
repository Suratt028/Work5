
public class ARView {
    private Item item;
    private String dObject;
    private Colour colour;
    private int[] dimensions;

    public ARView() {
    }
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String get3dObject() {
        return dObject;
    }

    public void set3dObject(String dObject) {
        this.dObject = dObject;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }

    public void render() {
        
    }
}


