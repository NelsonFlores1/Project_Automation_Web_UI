package browser;

public class FactoryBrowser {

    public static IBrowser make(String browserType){
        /**
         * @return the browser type
         */

        IBrowser browser; // SOLID, L
        switch (browserType.toLowerCase()) {
            case "chrome":
                browser =  new Chrome();
                break;
            default:
                browser =  new Firefox();
                break;
        }
        return browser;
    }
}
