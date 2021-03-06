package zoeyow.elytraboost;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import zoeyow.elytraboost.eventhandlers.ClientEventHandler;
import zoeyow.elytraboost.proxy.CommonProxy;

@Mod(modid = ModInfo.MODID, name = ModInfo.MODNAME, version = ModInfo.MODVERSION, useMetadata = true)
public class ElytraBoost {

    @SidedProxy(clientSide = "zoeyow.elytraboost.proxy.ClientProxy", serverSide = "zoeyow.elytraboost.proxy.ServerProxy")
    public static CommonProxy proxy;
    @Mod.Instance
    public static ElytraBoost instance;
    public static Logger logger;
    ClientEventHandler ElytraBoosteventHandler;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
