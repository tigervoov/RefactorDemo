package gildedRose;

public class CalQualityStrategyForBackstage implements calQualityStrategy {

    @Override
    public void calculateQuality(Item item) {
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
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
