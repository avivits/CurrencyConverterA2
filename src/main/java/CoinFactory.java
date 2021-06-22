
//factory method to get coins instances (USD and ILS) use the enum types

public class CoinFactory {


    public Coin getCoin(Coins coinType){

        if(coinType == null){
            return null;
        }

        if(coinType.equals(Coins.USD))
         {
            return new USD();
        }

        else if(coinType.equals(Coins.ILS))
        {
            return new ILS();
        }

        return null;
    }
}

