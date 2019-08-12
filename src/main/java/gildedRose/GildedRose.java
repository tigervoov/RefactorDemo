package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {

        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name){
                case "Aged Brie":
                    calculateQualityForAgedBrie(items[i]);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    calculateQualityForBackstage(items[i]);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    calculateQualityForOthers(items[i]);
            }
            calculateQualityBySellIn(items[i]);
        }
    }



    private void calculateQualityBySellIn(Item item) {
        if (item.sellIn < 0) {
            if (!item.name.equals("Aged Brie")) {
                if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.quality > 0) {
                        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                            item.quality = item.quality - 1;
                        }
                    }
                } else {
                    item.quality = item.quality - item.quality;
                }
            }
        }
    }

    private void calculateQualityForOthers(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        item.sellIn = item.sellIn - 1;

    }

    private void calculateQualityForAgedBrie(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

    private void calculateQualityForBackstage(Item item) {
            if (item.quality < 50) {
                item.quality++;
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality++;
                    }
                }
                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality++;
                    }
                }
            }
        item.sellIn = item.sellIn - 1;
    }
}