package org.example;

        import net.thauvin.erik.crypto.CryptoPrice;
        import org.telegram.telegrambots.bots.TelegramLongPollingBot;
        import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
        import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
        import org.telegram.telegrambots.meta.api.objects.InputFile;
        import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    public MyBot() {
        super("");
    }

    @Override
    public void onUpdateReceived(Update update) {
        var chatId = update.getMessage().getChatId();
        var text = update.getMessage().getText();

        try {
            if (text.equals("/start")) {
                sendMessage(chatId, "Hello! " +
                        "\nIf you want to know the course of Bitcoin type \"btc\". " +
                        "\nIf you want to know the course of Tether type \"usdt\". " +
                        "\nIf you want to know the course of Ethereum type \"eth\". " +
//                        "\nIf you want to know the course of Tronixe type \"trx\". " +
                        "\nIf you want to know the course of Ripple type \"xrp\". " +
                        "\nIf you want to know the course of Litecoin type \"ltc\". " +
                        "\nIf you want to know the course of Stellar type \"xlm\". " +
//                        "\nIf you want to know the course of Monero type \"xmr\". " +
                        "\nIf you want to know the course of Dogecoin type \"doge\". " +
                        "\nIf you want to know the course of Bitcoin Cash / BCC type \"bch\". " +
//                        "\nIf you want to know the course of Verge type \"xvg\". " +
                        "\nIf you want to know the course of OmiseGo type \"omg\". " +
//                        "\nIf you want to know the course of NEO type \"neo\". " +
                        "\nIf you want to know the course of EOS type \"eos\". " +
                        "\nIf you want to know the course of Ethereum Classic type \"etc\". " +
//                        "\nIf you want to know the course of Decred type \"dcr\". " +
//                        "\nIf you want to know the course of NEM type \"xem\". " +
//                        "\nIf you want to know the course of DigiByte type \"dgb\". " +
                        "\nIf you want to know the course of ZCash type \"zec\". " +
                        "\nIf you want to know the course of Decentraland type \"mana\". " +
                        "\nIf you want to know the course of Tezos type \"xtz\". " +
//                        "\nIf you want to know the course of FunFair type \"fun\". " +
                        "\nIf you want to know the course of DigitalCash type \"dash\". " +
//                        "\nIf you want to know the course of Ox type \"ox\". " +
//                        "\nIf you want to know the course of Bitshares type \"bts\". " +
//                        "\nIf you want to know the course of Lisk type \"lsk\". " +
                        "\nIf you want to know the course of Augur type \"rep\". " +
//                        "\nIf you want to know the course of LEOcoin type \"leo\". " +
//                        "\nIf you want to know the course of Bitcoin Gold type \"btg\". " +
//                        "\nIf you want to know the course of Gamecredits type \"game\". " +
//                        "\nIf you want to know the course of Nxt type \"nxt\". " +
//                        "\nIf you want to know the course of PeerCoin type \"ppc\". " +
//                        "\nIf you want to know the course of ReddCoin type \"rdd\". " +
//                        "\nIf you want to know the course of AventCoin type \"avt\". " +
//                        "\nIf you want to know the course of Cindicator type \"cnd\". " +
//                        "\nIf you want to know the course of Onix type \"onx\". " +
                        "\nIf you want to know all courses type \"all\".");
            } else if (text.equals("btc")) {
                sendPicture(chatId, "btc.png");
                sendPrice(chatId, "BTC");
            } else if (text.equals("usdt")) {
                sendPicture(chatId, "usdt.png");
                sendPrice(chatId, "USDT");
            } else if (text.equals("eth")) {
                sendPicture(chatId, "eth.png");
                sendPrice(chatId, "ETH");
//            } else if (text.equals("trx")) {
//                sendPicture(chatId, "trx.png");
//                sendPrice(chatId, "TRX");
            } else if (text.equals("xrp")) {
                sendPicture(chatId, "xrp.jpg");
                sendPrice(chatId, "XRP");
            } else if (text.equals("ltc")) {
                sendPicture(chatId, "ltc.png");
                sendPrice(chatId, "LTC");
            } else if (text.equals("xlm")) {
                sendPicture(chatId, "xlm.png");
                sendPrice(chatId, "XLM");
            } else if (text.equals("xmr")) {
                sendPicture(chatId, "xmr.jpg");
                sendPrice(chatId, "XMR");
            } else if (text.equals("doge")) {
                sendPicture(chatId, "doge.png");
                sendPrice(chatId, "DOGE");
            } else if (text.equals("bch")) {
                sendPicture(chatId, "bch.png");
                sendPrice(chatId, "BCH");
//            } else if (text.equals("xvg")) {
//                sendPicture(chatId, "xvg.png");
//                sendPrice(chatId, "XVG");
            } else if (text.equals("omg")) {
                sendPicture(chatId, "omg.jpg");
                sendPrice(chatId, "OMG");
//            } else if (text.equals("neo")) {
//                sendPicture(chatId, "neo.png");
//                sendPrice(chatId, "NEO");
            } else if (text.equals("eos")) {
                sendPicture(chatId, "eos.jpg");
                sendPrice(chatId, "EOS");
            } else if (text.equals("etc")) {
                sendPicture(chatId, "etc.png");
                sendPrice(chatId, "ETC");
//            } else if (text.equals("dcr")) {
//                sendPicture(chatId, "dcr.jpg");
//                sendPrice(chatId, "DCR");
//            } else if (text.equals("xem")) {
//                sendPicture(chatId, "xem.png");
//                sendPrice(chatId, "XEM");
//            } else if (text.equals("dgb")) {
//                sendPicture(chatId, "dgb.jpg");
//                sendPrice(chatId, "DGB");
            } else if (text.equals("zec")) {
                sendPicture(chatId, "zec.jpg");
                sendPrice(chatId, "ZEC");
            } else if (text.equals("mana")) {
                sendPicture(chatId, "mana.jpg");
                sendPrice(chatId, "MANA");
            } else if (text.equals("xtz")) {
                sendPicture(chatId, "xtz.jpg");
                sendPrice(chatId, "XTZ");
//            } else if (text.equals("fun")) {
//                sendPicture(chatId, "fun.png");
//                sendPrice(chatId, "FUN");
            } else if (text.equals("dash")) {
                sendPicture(chatId, "dash.png");
                sendPrice(chatId, "DASH");
//            } else if (text.equals("ox")) {
//                sendPicture(chatId, "ox.jpg");
//                sendPrice(chatId, "OX");
//            } else if (text.equals("bts")) {
//                sendPicture(chatId, "bts.jpg");
//                sendPrice(chatId, "BTS");
//            } else if (text.equals("lsk")) {
//                sendPicture(chatId, "lsk.jpg");
//                sendPrice(chatId, "LSK");
            } else if (text.equals("rep")) {
                sendPicture(chatId, "rep.jpg");
                sendPrice(chatId, "REP");
//            } else if (text.equals("leo")) {
//                sendPicture(chatId, "leo.jpg");
//                sendPrice(chatId, "LEO");
//            } else if (text.equals("btg")) {
//                sendPicture(chatId, "btg.jpg");
//                sendPrice(chatId, "BTG");
//            } else if (text.equals("game")) {
//                sendPicture(chatId, "game.png");
//                sendPrice(chatId, "GAME");
//            } else if (text.equals("nxt")) {
//                sendPicture(chatId, "nxt.png");
//                sendPrice(chatId, "NXT");
//            } else if (text.equals("ppc")) {
//                sendPicture(chatId, "ppc.jpg");
//                sendPrice(chatId, "PPC");
//            } else if (text.equals("rdd")) {
//                sendPicture(chatId, "rdd.png");
//                sendPrice(chatId, "RDD");
//            } else if (text.equals("avt")) {
//                sendPicture(chatId, "avt.jpg");
//                sendPrice(chatId, "AVT");
//            } else if (text.equals("cnd")) {
//                sendPicture(chatId, "cnd.jpg");
//                sendPrice(chatId, "CND");
//            } else if (text.equals("onx")) {
//                sendPicture(chatId, "onx.png");
//                sendPrice(chatId, "ONX");
            } else if (text.equals("all")) {
                sendPicture(chatId, "btc.png");
                sendPrice(chatId, "BTC");

                sendPicture(chatId, "usdt.png");
                sendPrice(chatId, "USDT");

                sendPicture(chatId, "eth.png");
                sendPrice(chatId, "ETH");

//                sendPicture(chatId, "trx.png");
//                sendPrice(chatId, "TRX");

                sendPicture(chatId, "xrp.jpg");
                sendPrice(chatId, "XRP");

                sendPicture(chatId, "ltc.png");
                sendPrice(chatId, "LTC");

                sendPicture(chatId, "xlm.png");
                sendPrice(chatId, "XLM");

//                sendPicture(chatId, "xmr.jpg");
//                sendPrice(chatId, "XMR");

                sendPicture(chatId, "doge.png");
                sendPrice(chatId, "DOGE");

                sendPicture(chatId, "bch.png");
                sendPrice(chatId, "BCH");

//                sendPicture(chatId, "xvg.png");
//                sendPrice(chatId, "XVG");

                sendPicture(chatId, "omg.jpg");
                sendPrice(chatId, "OMG");

//                sendPicture(chatId, "neo.png");
//                sendPrice(chatId, "NEO");

                sendPicture(chatId, "eos.jpg");
                sendPrice(chatId, "EOS");

                sendPicture(chatId, "etc.png");
                sendPrice(chatId, "ETC");

//                sendPicture(chatId, "dcr.jpg");
//                sendPrice(chatId, "DER");

//                sendPicture(chatId, "xem.png");
//                sendPrice(chatId, "XEM");
//
//                sendPicture(chatId, "dgb.jpg");
//                sendPrice(chatId, "DGB");

                sendPicture(chatId, "zec.jpg");
                sendPrice(chatId, "ZEC");

                sendPicture(chatId, "mana.jpg");
                sendPrice(chatId, "MANA");

                sendPicture(chatId, "xtz.jpg");
                sendPrice(chatId, "XTZ");

//                sendPicture(chatId, "fun.png");
//                sendPrice(chatId, "FUN");

                sendPicture(chatId, "dash.png");
                sendPrice(chatId, "DASH");

//                sendPicture(chatId, "ox.jpg");
//                sendPrice(chatId, "OX");
//
//                sendPicture(chatId, "bts.jpg");
//                sendPrice(chatId, "BTS");
//
//                sendPicture(chatId, "lsk.jpg");
//                sendPrice(chatId, "LSK");

                sendPicture(chatId, "rep.jpg");
                sendPrice(chatId, "REP");

//                sendPicture(chatId, "leo.jpg");
//                sendPrice(chatId, "LEO");
//
//                sendPicture(chatId, "btg.jpg");
//                sendPrice(chatId, "BTG");

//                sendPicture(chatId, "game.png");
//                sendPrice(chatId, "GAME");

//                sendPicture(chatId, "nxt.png");
//                sendPrice(chatId, "NXT");
//
//                sendPicture(chatId, "ppc.jpg");
//                sendPrice(chatId, "PPC");

//                sendPicture(chatId, "rdd.png");
//                sendPrice(chatId, "RDD");
//
//                sendPicture(chatId, "avt.jpg");
//                sendPrice(chatId, "AVT");
//
//                sendPicture(chatId, "cnd.jpg");
//                sendPrice(chatId, "CND");
//
//                sendPicture(chatId, "onx.png");
//                sendPrice(chatId, "ONX");
            } else {
                sendMessage(chatId, "Unknown command!");
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    void sendPrice(long chatId, String name) throws Exception {
        var price = CryptoPrice.spotPrice(name);
        sendMessage(chatId, name + " price: " + price.getAmount().doubleValue() + " USD");
    }

    void sendPicture(long chatId, String name) throws Exception {
        var photo = getClass().getClassLoader().getResourceAsStream(name);

        var message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile(photo, name));
        execute(message);
    }

    void sendMessage(long chatId, String text) throws Exception {
        var message = new SendMessage();
        message.setChatId(chatId);
        message.setText(text);
        execute(message);
    }

    @Override
    public String getBotUsername() {
        return "Erebus3794_bot";
    }
}

