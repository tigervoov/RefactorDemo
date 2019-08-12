package gildedRose;

public class CalQualityStrategyForOthers implements calQualityStrategy {
    @Override
    public void calculateQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
