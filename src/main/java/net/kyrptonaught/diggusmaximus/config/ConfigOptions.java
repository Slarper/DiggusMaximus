package net.kyrptonaught.diggusmaximus.config;

import blue.endless.jankson.Comment;
import net.kyrptonaught.diggusmaximus.client.DiggusKeyBinding;
import net.kyrptonaught.kyrptconfig.config.ConfigWDefaults;
import net.kyrptonaught.kyrptconfig.keybinding.CustomKeyBinding;

import java.util.HashSet;

public class ConfigOptions extends ConfigWDefaults {

    @Comment("Mod enabled or disabled")
    public boolean enabled = true;

    @Comment("Activation key")
    public DiggusKeyBinding keybinding = new DiggusKeyBinding(true, true, "key.keyboard.grave.accent");

    @Comment("Inverts the keybinding activation")
    public boolean invertActivation = false;

    @Comment("Sneak to excavate(can work serverside only)")
    public boolean sneakToExcavate = false;

    @Comment("Should mine diagonally, excludes shape excavating")
    public boolean mineDiag = true;

    @Comment("Maximum number of blocks to mine")
    public int maxMinedBlocks = 40;

    @Comment("Maximum distance from start to mine")
    public int maxMineDistance = 10;

    @Comment("Automatically pick up drops")
    public boolean autoPickup = true;

    @Comment("Tool required to excavate")
    public boolean requiresTool = false;

    @Comment("Stop before tool breaks")
    public boolean dontBreakTool = true;

    @Comment("Stop excavating when tool breaks")
    public boolean stopOnToolBreak = true;

    @Comment("Should tool take durability")
    public boolean toolDurability = true;

    @Comment("Should player get exhaustion")
    public boolean playerExhaustion = true;

    @Comment("Multiply exhaustion when excavating")
    public float exhaustionMultiplier = 1.0f;

    @Comment("Other items to be considered tools ie: \"minecraft:stick\"")
    public HashSet<String> tools = new HashSet<>();

    @Override
    public ConfigOptions getDefaults() {
        return (ConfigOptions) super.getDefaults();
    }

    @Override
    public void afterLoad() {
        keybinding.copyFromDefault(getDefaults().keybinding);
    }
}
