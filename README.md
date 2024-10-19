Example
``` java
Player player = Bukkit.getPlayer("Cortez_Romeo");
InventoryPagesPlusAPI inventoryPagesPlusAPI = Bukkit.getServicesManager().getRegistration(InventoryPagesPlusAPI.class).getProvider();
PlayerInventoryDatabase playerInventoryDatabase = inventoryPagesPlusAPI.getInventoryPagesPlusDataManager().getPlayerInventoryDatabase(player.getUniqueId());

playerInventoryDatabase.addMaxPage(1);

// Get items from player's current page
for (ItemStack page0Item : playerInventoryDatabase.getItems(playerInventoryDatabase.getCurrentPage())) {
    if (page0Item == null)
        continue;
    if (page0Item.getType() == Material.DIAMOND_AXE)
        playerInventoryDatabase.dropPage(player.getGameMode());
    if (page0Item.getType() == Material.TNT)
        playerInventoryDatabase.dropAllPages(playerInventoryDatabase.getPlayer().getGameMode());
    if (page0Item.getType() == Material.COMMAND_BLOCK)
        playerInventoryDatabase.setNextItemPos(1);
}

ItemStack testItem = new ItemStack(Material.DIAMOND_AXE);
ItemMeta itemMeta = testItem.getItemMeta();
itemMeta.setDisplayName(ChatColor.RED + "Rìu siêu vip");
testItem.setItemMeta(itemMeta);

// Add item to inventory
playerInventoryDatabase.storeOrDropItem(testItem, player.getGameMode());
