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
    

}