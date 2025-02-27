package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_9_when_call_updateQuality_given_normal_item_sellIn_10_quality_10(){
        Item item = new Item("Normal Item",10,10);
        GildedRose gildedRose = new GildedRose((new Item[]{item}));

        gildedRose.updateQuality();

        assertEquals(9,item.getQuality());
        assertEquals(9,item.getSellIn());
    }


    @Test
    public void should_return_8_when_call_updateQuality_given_normal_item_sellIn_0_quality_10() {
        Item item = new Item("Normal Item", 0, 10);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(8, item.getQuality());
    }

    @Test
    public void should_return_0_when_call_updateQuality_given_normal_item_sellIn_10_quality_0(){
        Item item = new Item("Normal Item", 10, 0);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(0, item.getQuality());
    }


    @Test
    public void should_return_31_when_call_updateQuality_given_Aged_Brie_sellIn_10_quality_30() {
        Item item = new Item("Aged Brie", 10, 30);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(31, item.getQuality());
    }

    @Test
    public void should_return_50_when_call_updateQuality_given_Aged_Brie_sellIn_10_quality_50() {
        Item item = new Item("Aged Brie", 10, 50);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(50, item.getQuality());
    }

    @Test
    public void should_return_same_when_call_updateQuality_given_Sulfuras_sellIn_10_quality_20() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 10, 20);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(10, item.getSellIn());
        assertEquals(20, item.getQuality());
    }


    @Test
    public void should_return_22_when_call_updateQuality_given_Backstage_passes_sellIn_8_quality_20(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 20);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(22, item.getQuality());
    }

    @Test
    public void should_return_50_when_call_updateQuality_given_Backstage_passes_sellIn_8_quality_49() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 49);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(50, item.getQuality());
    }

    @Test
    public void should_return_33_when_call_updateQuality_given_Backstage_passes_sellIn_5_quality_30() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(33, item.getQuality());
    }


    @Test
    public void should_return_0_when_call_updateQuality_given_Backstage_passes_sellIn_0_quality_20() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(0, item.getQuality());
    }

    @Test
    public void should_return_80_when_call_updateQuality_given_Sulfuras_sellIn_20_quality_80() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 20, 80);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(80, item.getQuality());
    }
    @Test
    public void should_return_80_when_call_updateQuality_given_Sulfuras_sellIn_0_quality_80() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(80, item.getQuality());
    }

}