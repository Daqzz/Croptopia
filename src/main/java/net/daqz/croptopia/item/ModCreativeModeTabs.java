package net.daqz.croptopia.item;

import net.daqz.croptopia.Croptopia;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Croptopia.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CROPTOPIA = CREATIVE_MODE_TABS.register("croptopia", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CROCUS.get()))
            .title(Component.translatable("creativetab.croptopia"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.CROCUS.get());
                output.accept(ModItems.RUBY.get());
            })
            .build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
