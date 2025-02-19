package net.dragon_girl7567.villagerbrewin.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.dragon_girl7567.villagerbrewin.VillagerBrewin;
import umpaz.brewinandchewin.common.registry.BnCBlocks;
import umpaz.brewinandchewin.common.registry.BnCItems;
import net.dragon_girl7567.villagerbrewin.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = VillagerBrewin.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        if (event.getType() == ModVillagers.BREWER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(BnCItems.COASTER.get(), 2),
                    new ItemStack(Items.EMERALD, 1),
                    16, 8, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(BnCItems.TANKARD.get(), 2),
                    new ItemStack(Items.EMERALD, 1),
                    16, 8, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(BnCItems.BEER.get(), 1),
                    16, 8, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(BnCItems.VODKA.get(), 1),
                    5, 12, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(BnCItems.MEAD.get(), 1),
                    16, 8, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(BnCItems.RICE_WINE.get(), 1),
                    5, 12, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(BnCItems.EGG_GROG.get(), 1),
                    5, 12, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(BnCItems.STRONGROOT_ALE.get(), 1),
                    5, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(BnCItems.SWEET_BERRY_JAM.get(), 1),
                    new ItemStack(Items.EMERALD, 1),
                    5, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(BnCItems.GLOW_BERRY_MARMALADE.get(), 1),
                    new ItemStack(Items.EMERALD, 1),
                    5, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(BnCItems.APPLE_JELLY.get(), 1),
                    new ItemStack(Items.EMERALD, 1),
                    5, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(BnCItems.KIMCHI.get(), 2),
                    5, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(BnCItems.JERKY.get(), 2),
                    5, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(BnCItems.PICKLED_PICKLES.get(), 2),
                    5, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(BnCItems.KIPPERS.get(), 2),
                    5, 12, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(BnCBlocks.HEATING_CASK.get(), 1),
                    5, 12, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(BnCBlocks.ICE_CRATE.get(), 1),
                    5, 12, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 10),
                    new ItemStack(BnCItems.UNRIPE_FLAXEN_CHEESE_WHEEL.get(), 1),
                    5, 12, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 10),
                    new ItemStack(BnCItems.UNRIPE_SCARLET_CHEESE_WHEEL.get(), 1),
                    5, 12, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 10),
                    new ItemStack(BnCItems.COCOA_FUDGE.get(), 1),
                    5, 12, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15),
                    new ItemStack(BnCItems.PIZZA.get(), 1),
                    5, 12, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(BnCItems.FIERY_FONDUE_POT.get(), 1),
                    5, 12, 0.02f));
        }
    }
}