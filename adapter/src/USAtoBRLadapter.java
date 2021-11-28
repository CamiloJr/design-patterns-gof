public class USAtoBRLadapter extends BrazilianWallSocket {

    public String connect(AmericanPowerCord americanPowerCord) {
        return americanPowerCord.getElectricity() + this.getType();
    }
}
