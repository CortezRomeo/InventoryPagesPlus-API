package me.cortezromeo.inventorypagesplus.storage;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;

public interface PlayerInventoryDatabase {

    Player getPlayer();

    String getPlayerName();

    void setPlayerName(String playerName);

    String getPlayerUUID();

    void setPlayerUUID(String playerUUID);

    int getPrevItemPos();

    void setPrevItemPos(int number);

    int getNextItemPos();

    void setNextItemPos(int number);

    int getCurrentPage();

    void setCurrentPage(Integer page);

    int getMaxPage();

    void setMaxPage(int number);

    void addMaxPage(int number);

    void removeMaxPage(int number);

    void saveCurrentPage();

    void clearPage(GameMode gm);

    void clearPage(int page, GameMode gm);

    void clearAllPages(GameMode gm);

    void dropPage(GameMode gm);

    void dropPage(int page, GameMode gm);

    void dropAllPages(GameMode gm);

    void showPage();

    void showPage(Integer page);

    void showPage(GameMode gm);

    void showPage(Integer page, GameMode gm);

    int getUsedSlot(int page);

    void createPage(Integer page);

    HashMap<Integer, ArrayList<ItemStack>> getItems();

    ArrayList<ItemStack> getItems(int page);

    void setItems(HashMap<Integer, ArrayList<ItemStack>> items);

    ArrayList<ItemStack> getCreativeItems();

    void setCreativeItems(ArrayList<ItemStack> creativeItems);

    boolean hasUsedCreative();

    void setUsedCreative(Boolean hasUsedCreative);

    boolean storeOrDropItem(ItemStack itemStack, GameMode gameMode);

    int getUsedSlotCreative();

    void prevPage();

    void nextPage();

}
