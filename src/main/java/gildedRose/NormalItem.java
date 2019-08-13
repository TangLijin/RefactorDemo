package gildedRose;

public class NormalItem implements ItemStrategy {
    @Override
    public void update(Item item) {
        if (item.getQuality() > 0) {
            item.decreaseQualityBy1();
        }
        item.decreaseSellInBy1();
        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.decreaseQualityBy1();
        }
    }
}
