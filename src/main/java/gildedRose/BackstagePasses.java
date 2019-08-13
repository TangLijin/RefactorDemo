package gildedRose;

public class BackstagePasses implements ItemStrategy {
    @Override
    public void update(Item item) {
        item.increaseQualityWhenLessThanMax();
        if (item.getSellIn() < 11) {
            item.increaseQualityWhenLessThanMax();
        }
        if (item.getSellIn() < 6) {
            item.increaseQualityWhenLessThanMax();
        }
        item.decreaseSellInBy1();
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}
