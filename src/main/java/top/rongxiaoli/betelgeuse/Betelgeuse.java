package top.rongxiaoli.betelgeuse;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import top.rongxiaoli.betelgeuse.logging.Logger;

@Mod(modid = Betelgeuse.MODID, name = Betelgeuse.VERSION, clientSideOnly = true)
public class Betelgeuse {
    public static final String MODID = "betelgeuse";
    public static final String VERSION = "0.0.0-Alpha";
    public static Betelgeuse instance;
    public Logger logger;

    public Betelgeuse() {
        instance = this;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        logger = new Logger();
        logger.log(Logger.Level.Info, "Betelgeuse initializing. ");
    }
}
