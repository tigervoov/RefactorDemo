package gildedRose;

public class CalQualityStrategyForOthers implements calQualityStrategy {
    @Override
    public void calculateQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn--;
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
