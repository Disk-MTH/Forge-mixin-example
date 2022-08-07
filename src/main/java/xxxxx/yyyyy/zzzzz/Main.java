package xxxxx.yyyyy.zzzzz;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID)
public class Main
{
    public static final String MODID = "zzzzz";

    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        System.out.println("Hello world!");
    }
}
