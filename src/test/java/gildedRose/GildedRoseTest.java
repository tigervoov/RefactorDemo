package gildedRose;

import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {
    @Test
    //sellIn>=1,quality<50
    public void should_return_correct_statement_when_given_Aged_Brie_1_49() {
        //given
        Item item = new Item("Aged Brie", 1, 49);
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("Aged Brie, 0, 50",items[0].toString());
    }
    @Test
    //sellIn<=0,quality<50
    public void should_return_correct_statement_when_given_Aged_Brie_0_49() {
        //given
        Item item = new Item("Aged Brie", 0, 49);
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("Aged Brie, -1, 50",items[0].toString());
    }
    @Test
    //sellIn<=0,quality<=48
    public void should_return_correct_statement_when_given_Aged_Brie_0_48() {
        //given
        Item item = new Item("Aged Brie", 0, 48);
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("Aged Brie, -1, 50",items[0].toString());
    }
    @Test
    //sellIn>=1,quality>=50
    public void should_return_correct_statement_when_given_Aged_Brie_1_50() {
        //given
        Item item = new Item("Aged Brie", 1, 49);
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("Aged Brie, 0, 50",items[0].toString());
    }
    @Test
    //sellIn>=1,quality>=50
    public void should_return_correct_statement_when_given_Aged_Brie_0_50() {
        //given
        Item item = new Item("Aged Brie", 0, 50);
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("Aged Brie, -1, 50",items[0].toString());
    }

    @Test
    public void should_return_correct_statement_when_given_Backstage_5_40() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5,40 );
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 43",items[0].toString());
    }
    @Test
    public void should_return_correct_statement_when_given_Backstage_0_40() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0,40 );
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0",items[0].toString());
    }
    @Test
    public void should_return_correct_statement_when_given_Backstage_1_40() {
        //given
        Item item = new Item("Sulfuras, Hand of Ragnaros", 1,40 );
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 1, 40",items[0].toString());
    }
    @Test
    public void should_return_correct_statement_when_given_Backstage_smaller_0_40() {
        //given
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1,40 );
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, -1, 40",items[0].toString());
    }



    @Test
    public void should_return_correct_statement_when_given_demo_1_1() {
        //given
        Item item = new Item("demo", 1, 1);
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("demo, 0, 0",items[0].toString());
    }
    @Test
    public void should_return_correct_statement_when_A_demo_0_1() {
        //given
        Item item = new Item("demo", 0, 1);
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("demo, -1, 0",items[0].toString());
    }
    @Test
    public void should_return_correct_statement_when_A_demo_0_0() {
        //given
        Item item = new Item("demo", 0, 0);
        Item[] items ={item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals("demo, -1, 0",items[0].toString());
    }
}
