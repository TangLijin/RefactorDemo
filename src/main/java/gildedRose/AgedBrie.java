package gildedRose;

public class AgedBrie implements ItemStrategy {


    @Override
    public void update(Item item) {
        item.increaseQualityWhenLessThanMax();
        item.decreaseSellInBy1();
    }
}
