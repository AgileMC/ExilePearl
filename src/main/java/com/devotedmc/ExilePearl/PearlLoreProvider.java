package com.devotedmc.ExilePearl;

import java.util.List;
import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public interface PearlLoreProvider {

	/**
	 * Generates the lore for the pearl
	 * @return The pearl lore
	 */
	List<String> generateLore(ExilePearl pearl);
	
	/**
	 * Generates the lore for a pearl with a modified health value
	 * @return The pearl lore
	 */
	List<String> generateLoreWithModifiedHealth(ExilePearl pearl, int healthValue);
	
	/**
	 * Gets the pearl ID from a pearl item stack
	 * @param is The item stack to parse
	 * @return The pearl ID, or 0 if can't parse
	 */
	int getPearlIdFromItemStack(ItemStack is);
	
	/**
	 * Gets a player ID from a legacy prison pearl
	 * @return The player ID if it exists
	 */
	UUID getPlayerIdFromLegacyPearl(ItemStack is);
}
