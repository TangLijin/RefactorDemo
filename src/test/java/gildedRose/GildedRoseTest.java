package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_9_when_call_updateQuality_given_normal_item_sellIn_10_quality_10(){
        Item item = new Item("Normal Item",10,10);
        GildedRose gildedRose = new GildedRose((new Item[]{item}));

        gildedRose.updateQuality();

        assertEquals(9,item.quality);
        assertEquals(9,item.sellIn);
    }


    @Test
    public void should_return_8_when_call_updateQuality_given_normal_item_sellIn_0_quality_10() {
        Item item = new Item("Normal Item", 0, 10);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(8, item.quality);
    }

    @Test
    public void should_return_0_when_call_updateQuality_given_normal_item_sellIn_10_quality_0(){
        Item item = new Item("Normal Item", 10, 0);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
    }


    @Test
    public void should_return_31_when_call_updateQuality_given_Aged_BrieSe_sellIn_10_quality_30() {
        Item item = new Item("Aged Brie", 10, 30);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(31, item.quality);
    }

    @Test
    public void should_return_50_when_call_updateQuality_given_normal_item_sellIn_10_quality_50() {
        Item item = new Item("Aged Brie", 10, 50);
            GildedRose gildedRose = new GildedRose(new Item[]{item});

            gildedRose.updateQuality();

            assertEquals(50, item.quality);


    }


}