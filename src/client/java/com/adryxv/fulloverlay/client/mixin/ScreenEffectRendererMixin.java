package com.adryxv.fulloverlay.client.mixin;

import com.adryxv.fulloverlay.client.OverlayConfig;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.ScreenEffectRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Lowers or hides the fire overlay shown on screen while you are burning.
 * Target (26.2): private static void submitFire(PoseStack, SubmitNodeCollector, TextureAtlasSprite)
 */
@Mixin(ScreenEffectRenderer.class)
public class ScreenEffectRendererMixin {

    @Inject(method = "submitFire", at = @At("HEAD"), cancellable = true)
    private static void fulloverlay$lowerFire(PoseStack poseStack, SubmitNodeCollector collector,
                                              TextureAtlasSprite sprite, CallbackInfo ci) {
        OverlayConfig cfg = OverlayConfig.get();
        if (cfg.fireHidden) {
            ci.cancel();
            return;
        }
        poseStack.translate(0.0F, -cfg.fireOffsetY, 0.0F);
    }
}