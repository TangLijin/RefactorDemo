package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    

    public void updateQuality() {
        for(Item item : items){
            switch (item.getName()){
                case "Aged Brie":
                    if (item.getQuality() < 50) {
                        item.addQualityBy1();
                    }
                    item.decreaseSellInBy1();
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    if (item.getQuality() < 50) {
                        item.addQualityBy1();
                    }
                    if (item.getSellIn() < 11) {
                        if (item.getQuality() < 50) {
                            item.addQualityBy1();
                        }
                    }
                    if (item.getSellIn() < 6) {
                        if (item.getQuality() < 50) {
                            item.addQualityBy1();
                        }
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