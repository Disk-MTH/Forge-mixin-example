package xxxxx.yyyyy.zzzzz.mixins;

import xxxxx.yyyyy.zzzzz.Main;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import javax.annotation.Nullable;
import java.util.Map;

public class MixinLoader implements IFMLLoadingPlugin
{
    @Override
    public String[] getASMTransformerClass()
    {
        return new String[0];
    }

    @Override
    public String getModContainerClass()
    {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass()
    {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data)
    {
        MixinBootstrap.init();
        Mixins.addConfiguration(Main.MODID + ".mixins.json");
    }

    @Override
    public String getAccessTransformerClass()
    {
        return null;
    }
}
