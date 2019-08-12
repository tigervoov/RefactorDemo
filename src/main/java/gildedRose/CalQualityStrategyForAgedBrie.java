package gildedRose;

public class CalQualityStrategyForAgedBrie implements calQualityStrategy {
    @Override
    public void calculateQuality(Item item) {
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
}
