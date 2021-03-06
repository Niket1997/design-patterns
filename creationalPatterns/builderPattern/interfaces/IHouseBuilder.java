package creationalPatterns.builderPattern.interfaces;

import creationalPatterns.builderPattern.House;

public interface IHouseBuilder {
    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    public House getHouse();
}
