package gildedRose;

public class Item {

    public static final int MAX_QUALITY = 50;
    private String name;

    private int sellIn;

    private int quality;

    private ItemStrategy itemStrategy;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        createItemStrategy(this.name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }


    public void createItemStrategy(String strategyName) {
        switch (strategyName) {
            case "Aged Brie":
                itemStrategy =  new AgedBrie();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemStrategy = new BackstagePasses();
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemStrategy = new Sulfuras();
                break;
            default:
                itemStrategy = new NormalItem();
                break;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void addQualityBy1() {
        this.quality = this.quality + 1;
    }

    public void decreaseQualityBy1() {
        this.quality = this.quality - 1;
    }

    public void decreaseSellInBy1() {
        this.sellIn = this.sellIn - 1;
    }

    public void increaseQualityWhenLessThanMax() {
        if (this.quality < Item.MAX_QUALITY) {
            this.addQualityBy1();
        }
    }

    public void updateQuality() {
        itemStrategy.update(this);
    }
}
