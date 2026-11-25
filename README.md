<div align="center">

# 🖥️ FullOverlay

### Edit, move or hide **every** overlay in Minecraft.

Screen effects · Fog · First-person items · Vanilla HUD · Custom HUD modules

<br>

![Minecraft](https://img.shields.io/badge/Minecraft-26.2-62b47a?style=for-the-badge&logo=minecraft&logoColor=white)
![Fabric](https://img.shields.io/badge/Loader-Fabric-dbd0b4?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-25-e76f00?style=for-the-badge&logo=openjdk&logoColor=white)
![Side](https://img.shields.io/badge/Side-Client-5865f2?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Early%20development-f5a623?style=for-the-badge)

</div>

---

## ✨ What is FullOverlay?

FullOverlay is a **client-side Fabric mod** that puts every on-screen overlay under your control. Hide the fire, lower your shield, strip the lava fog, rearrange the HUD, add FPS / CPS / ping counters, all from one settings screen, with no resource pack edits and no paid client.

> [!NOTE]
> **Work in progress:** This repository currently contains **source code only** — there is no compiled `.jar` release available yet, and the mod may not be usable or fully playable in its current state. Only the fire overlay is implemented so far; everything marked 🛠️ is planned.

---

## 📋 Features

| | Module | What you can do | Status |
|---|---|---|---|
| 🔥 | **Fire overlay** | Hide it or lower it by any amount | ✅ Available |
| 🛡️ | **Shield** | Separate position at rest and while blocking, per hand (hide it at rest, show only a corner when blocking) | 🛠️ Planned |
| 🌫️ | **Fog** | Remove or reduce normal, lava, water, powder snow, blindness, darkness and Nether fog | 🛠️ Planned |
| 💥 | **Screen effects** | In-block, underwater, powder snow, pumpkin, portal, world border, vignette, damage flash, camera shake, nausea, totem animation | 🛠️ Planned |
| ✋ | **First person** | Empty hand and held item position | 🛠️ Planned |
| ❤️ | **Vanilla HUD** | Toggle or move hotbar, hearts, hunger, armor, XP, crosshair, action bar, titles, chat, boss bar, scoreboard, player list, toasts, potion effects | 🛠️ Planned |
| 📊 | **FPS / CPS / Ping** | Draggable counters | 🛠️ Planned |
| 🪖 | **Armor HUD** | Durability as `remaining/total`, horizontal or vertical, placed wherever you want. Includes elytra | 🛠️ Planned |
| ➕ | **Crosshair** | Size, color, thickness, plus an elytra indicator under it | 🛠️ Planned |
| ⌨️ | **Hotbar keys** | Shows the key bound to each slot. Mouse buttons appear as `M1`, `M2`, `M3`, `M4`, `M5`... | 🛠️ Planned |
| 🎛️ | **Editor** | In-game settings screen with sliders and toggles, plus a drag-and-drop HUD editor | 🛠️ Planned |

---

## 📦 Requirements

| Requirement | Version |
|---|---|
| Minecraft | **26.2** |
| [Fabric Loader](https://fabricmc.net/use/installer/) | 0.20.1 or newer |
| [Fabric API](https://modrinth.com/mod/fabric-api) | Required |
| Java | 25 |

FullOverlay is **client-only**: it does not need to be installed on the server.

---

## 🚀 Installation

> Pre-built `.jar` files are not available yet. To test the current state, follow the [Building from source](#-building-from-source) instructions below.

1. Install **Fabric Loader** for Minecraft 26.2.
2. Drop the compiled `fulloverlay-<version>.jar` and **Fabric API** into your `mods` folder.
3. Launch the game. The config file is created automatically.

---

## ⚙️ Configuration

Settings live in `.minecraft/config/fulloverlay.json`:

```json
{
  "fireHidden": false,
  "fireOffsetY": 0.3
}
```

| Option | Description |
|---|---|
| `fireHidden` | `true` hides the on-screen fire completely |
| `fireOffsetY` | How far the fire is lowered, in blocks. `0` is vanilla; higher pushes it further down |

> [!TIP]
> Restart the game after editing the file. An in-game settings screen is on the roadmap.

---

## 🗺️ Roadmap

- [x] **Phase 1**: project setup and fire overlay
- [ ] **Phase 2**: in-game settings screen with sliders
- [ ] **Phase 3**: shield position (rest / blocking, per hand)
- [ ] **Phase 4**: fog and the rest of the screen effects
- [ ] **Phase 5**: HUD modules (FPS, CPS, ping, armor, hotbar keys) and the drag-and-drop editor

---

## 🔨 Building from source

```bash
git clone [https://github.com/adryxv/fulloverlay.git](https://github.com/adryxv/fulloverlay.git)
cd fulloverlay
./gradlew build
```

The jar is written to `build/libs/` (use the one that does not end in `-sources`). To try it in a development client:

```bash
./gradlew runClient
```

---

## 🌐 Multiplayer

FullOverlay only changes what is drawn on **your** screen and sends nothing to the server. Even so, some servers have their own rules about client mods, so check them before using it.

---

## 🤝 Contributing

Bug reports and suggestions are welcome. Open an issue and include your **Minecraft version**, the **mod version** and, if the game crashes, `logs/latest.log`.

---

## 📄 License

Released under the license in the [LICENSE](LICENSE) file.

<div align="center">

Made by **adryxv**

</div>
