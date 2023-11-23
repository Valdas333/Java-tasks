package lt.techin.strategy;

public class WarehouseTests extends BaseWarehouseTests{
    @Override
    Warehouse getWarehouse() {
        return null;
    }

    @Override
    FilteringStrategy getManufacturerFilteringStrategy(String manufacturer) {
        return null;
    }

    @Override
    FilteringStrategy getMaxPriceFilteringStrategy(double maxPrice) {
        return null;
    }
}
