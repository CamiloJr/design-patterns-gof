public class AmericanWallSocket extends WallSocket<AmericanPowerCord> {

    public String connect(AmericanPowerCord powerCord) {
        return powerCord.getElectricity() + this.getType();
    }

    public String getType() {
        return "American Wall Socket";
    }
}
