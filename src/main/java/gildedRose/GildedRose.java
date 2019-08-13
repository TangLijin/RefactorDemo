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
                        item.setQuality(item.getQuality() + 1);
                    }
                    item.setSellIn(item.getSellIn() - 1);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    if (item.getQuality() < 50) {
                        item.setQuality(item.getQuality() + 1);
                    }
                    if (item.getSellIn() < 11) {
                        if (item.getQuality() < 50) {
                            item.setQuality(item.getQuality() + 1);
                        }
                    }
                    if (item.getSellIn() < 6) {
                        if (item.getQuality() < 50) {
                            item.setQuality(item.getQuality() + 1);
                        }
                    }
                    item.setSellIn(item.getSellIn() - 1);
                    if (item.getSellIn() < 0) {
                        item.setQuality(0);
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":

                    break;
                default:
                    if (item.getQuality() > 0) {
                        item.setQuality(item.getQuality() - 1);
                    }
                    item.setSellIn(item.getSellIn() - 1);
                    if (item.getSellIn() < 0 && item.getQuality() > 0) {
                        item.setQuality(item.getQuality() - 1);
                    }
                    break;
            }
        }
        /*
        for (int i = 0; i < items.length; i++){

            if(items[i].name.equals("Aged Brie")){
                if (items[i].getQuality() < 50) {
                    items[i].getQuality() = items[i].getQuality() + 1;
                }
                items[i].sellIn = items[i].sellIn - 1;
            }else if(items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
                if (items[i].getQuality() < 50) {
                    items[i].getQuality() = items[i].getQuality() + 1;
                }
                if (items[i].sellIn < 11) {
                    if (items[i].getQuality() < 50) {
                        items[i].getQuality() = items[i].getQuality() + 1;
                    }
                }
                if (items[i].sellIn < 6) {
                    if (items[i].getQuality() < 50) {
                        items[i].getQuality() = items[i].getQuality() + 1;
                    }
                }
                items[i].sellIn -= 1;
                if (items[i].sellIn < 0) {
                    items[i].getQuality() = 0;
                }
            }else if(items[i].name.equals("Sulfuras, Hand of Ragnaros")){

            }else{
                if (items[i].getQuality() > 0) {
                    items[i].getQuality() = items[i].getQuality() - 1;
                }
                items[i].sellIn = items[i].sellIn - 1;
                if (items[i].sellIn < 0 && items[i].getQuality() > 0) {
                    items[i].getQuality() = items[i].getQuality() - 1;
                }
            }

        }*/

    }
}