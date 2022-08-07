package xxxxx.yyyyy.zzzzz.mixins.client;

import xxxxx.yyyyy.zzzzz.Main;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class MixinMinecraft
{
    @Inject(at = @At("TAIL"), method = "createDisplay")
    public void setTitle(CallbackInfo callbackInfo)
    {
        Display.setTitle(Main.MODID);
    }
}
