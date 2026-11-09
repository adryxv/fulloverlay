package com.adryxv.fulloverlay.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Mod settings, saved to .minecraft/config/fulloverlay.json
 * Plain Java (no Minecraft classes), so it is stable across game versions.
 */
public class OverlayConfig {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path FILE = FabricLoader.getInstance().getConfigDir().resolve("fulloverlay.json");

    /** If true, the on-screen fire is not drawn at all. */
    public boolean fireHidden = false;
    /** How far the fire is lowered, in blocks (0 = vanilla, 0.3 = noticeably lower). */
    public float fireOffsetY = 0.3f;

    private static OverlayConfig instance = new OverlayConfig();

    public static OverlayConfig get() {
        return instance;
    }

    public static void load() {
        try {
            if (Files.exists(FILE)) {
                OverlayConfig loaded = GSON.fromJson(Files.readString(FILE), OverlayConfig.class);
                if (loaded != null) instance = loaded;
            }
            save(); // rewrite the file so new options get added
        } catch (IOException | RuntimeException e) {
            System.err.println("[FullOverlay] Could not read config: " + e);
        }
    }

    public static void save() {
        try {
            Files.writeString(FILE, GSON.toJson(instance));
        } catch (IOException e) {
            System.err.println("[FullOverlay] Could not save config: " + e);
        }
    }
}
