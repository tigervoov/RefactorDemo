package gildedRose;

public class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {

        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case "Aged Brie":
                    new CalQualityStrategyForAgedBrie().calculateQuality(items[i]);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    new CalQualityStrategyForBackstage().calculateQuality(items[i]);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    new CalQualityStrategyForOthers().calculateQuality(items[i]);
            }
        }
    }


}