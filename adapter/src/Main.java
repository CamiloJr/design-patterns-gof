public class Main {
    public static void main(String[] args) {

        // Test
        BrazilianWallSocket brazilianWallSocketTest = new BrazilianWallSocket();
        BrazilianPowerCord brazilianPowerCordTest = new BrazilianPowerCord();
        String replyTest = brazilianWallSocketTest.connect(brazilianPowerCordTest);
        System.out.println(replyTest);

        //Pattern:
        //Target
        BrazilianWallSocket brazilianWallSocket = new BrazilianWallSocket();

        //Plug
        AmericanPowerCord americanPowerCord = new AmericanPowerCord();

        //Error
        //brazilianWallSocket.connect(americanPowerCord);

        //Correct
        USAtoBRLadapter usAtoBRLadapter = new USAtoBRLadapter();
        String reply = usAtoBRLadapter.connect(americanPowerCord);

        System.out.println(reply);
    }
}
