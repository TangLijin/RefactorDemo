package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void increaseQualityWhenLessThanMax(Item item){
        if (item.getQuality() < Item.MAX_QUALITY) {
            item.addQualityBy1();
        }
    }
    

    public void updateQuality() {
        for(Item item : items){
            switch (item.getName()){
                case "Aged Brie":
                    increaseQualityWhenLessThanMax(item);
                    item.decreaseSellInBy1();
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    increaseQualityWhenLessThanMax(item);
                    if (item.getSellIn() < 11) {
                        increaseQualityWhenLessThanMax(item);
                    }
                    if (item.getSellIn() < 6) {
                        increaseQualityWhenLessThanMax(item);
                    }
                    item.decreaseSellInBy1();
                    if (item.getSellIn() < 0) {
                        item.setQuality(0);
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":

                    break;
                default:
                    if (item.getQuality() > 0) {
                        item.decreaseQualityBy1();
                    }
                    item.decreaseSellInBy1();
                    if (item.getSellIn() < 0 && item.getQuality() > 0) {
                        item.decreaseQualityBy1();
                    }
                    break;
            }
        }
    }
}