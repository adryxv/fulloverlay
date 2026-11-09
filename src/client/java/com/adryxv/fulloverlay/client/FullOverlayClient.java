package com.adryxv.fulloverlay.client;

import net.fabricmc.api.ClientModInitializer;

public class FullOverlayClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        OverlayConfig.load();
        System.out.println("[FullOverlay] Loaded. fireHidden=" + OverlayConfig.get().fireHidden
                + " fireOffsetY=" + OverlayConfig.get().fireOffsetY);
    }
}
