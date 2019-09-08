package org.cyclops.everlastingabilities.ability.config;

import net.minecraft.item.Rarity;
import net.minecraftforge.fml.config.ModConfig;
import org.cyclops.cyclopscore.config.ConfigurableProperty;
import org.cyclops.everlastingabilities.ability.AbilityTypePowerStare;
import org.cyclops.everlastingabilities.core.config.extendedconfig.AbilityConfig;

/**
 * Config for an ability.
 * @author rubensworks
 *
 */
public class AbilityPowerStareConfig extends AbilityConfig<AbilityTypePowerStare> {

    @ConfigurableProperty(category = "ability", comment = "Rarity of this ability.", requiresMcRestart = true, configLocation = ModConfig.Type.SERVER)
    public static int rarity = Rarity.UNCOMMON.ordinal();

    @ConfigurableProperty(category = "ability", comment = "The maximum ability level.", requiresMcRestart = true, configLocation = ModConfig.Type.SERVER)
    public static int maxLevel = 5;

    @ConfigurableProperty(category = "ability", comment = "The xp required per level.", requiresMcRestart = true, configLocation = ModConfig.Type.SERVER)
    public static int xpPerLevel = 50;

    @ConfigurableProperty(category = "ability", comment = "Require sneak to activate.", configLocation = ModConfig.Type.SERVER)
    public static boolean requireSneak = true;

    @ConfigurableProperty(category = "ability", comment = "If this can be obtained by initially spawning players.", requiresMcRestart = true, configLocation = ModConfig.Type.SERVER)
    public static boolean obtainableOnPlayerSpawn = true;

    @ConfigurableProperty(category = "ability", comment = "If this can be obtained by spawning mobs.", requiresMcRestart = true, configLocation = ModConfig.Type.SERVER)
    public static boolean obtainableOnMobSpawn = true;

    @ConfigurableProperty(category = "ability", comment = "If this can be obtained by combining totems in a crafting grid.", requiresMcRestart = true, configLocation = ModConfig.Type.SERVER)
    public static boolean obtainableOnCraft = true;

    @ConfigurableProperty(category = "ability", comment = "If this can be obtained in loot chests.", requiresMcRestart = true, configLocation = ModConfig.Type.SERVER)
    public static boolean obtainableOnLoot = true;

    public AbilityPowerStareConfig() {
        super("power_stare",
                eConfig -> new AbilityTypePowerStare(eConfig.getNamedId(), rarity, maxLevel, xpPerLevel,
                        obtainableOnPlayerSpawn, obtainableOnMobSpawn, obtainableOnCraft, obtainableOnLoot));
    }

}
