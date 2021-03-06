package terrails.terracore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constants {

    public static final String MOD_ID = "terracore";
    public static final String MOD_NAME = "TerraCore";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String MC_VERSION = "[1.12],[1.12.1],[1.12.2]";

    public static final String CLIENT_PROXY = "terrails.terracore.proxies.ClientProxy";
    public static final String SERVER_PROXY = "terrails.terracore.proxies.ClientProxy";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public static Logger getLogger(String name) {
        return LogManager.getLogger(name);
    }
}
