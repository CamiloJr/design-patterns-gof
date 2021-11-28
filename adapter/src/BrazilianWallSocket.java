public class BrazilianWallSocket extends WallSocket<BrazilianPowerCord> {

    public String connect(BrazilianPowerCord powerCord) {
        return powerCord.getElectricity() + this.getType();
    }

    public String getType() {
        return "Brazilian Wall Socket";
    }
}
