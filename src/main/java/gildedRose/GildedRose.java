package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {

        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                calculateQualityForSulfuras(items[i]);
            } else {
                calculateQualityForAgedBrie(items[i]);
                calculateQualityForBackstage(items[i]);
            }
            calculateItemSellIn(items[i]);
            calculateQualityBySellIn(items[i]);
        }
    }

    private void calculateQualityForSulfuras(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
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
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
    }

    private void calculateItemSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }

    private void calculateQualityForAgedBrie(Item item) {
        if (item.name.equals("Aged Brie")) {
            if (item.quality < 50) {
                item.quality++;
            }

        }
    }

    private void calculateQualityForBackstage(Item item) {
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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

        }
    }
}