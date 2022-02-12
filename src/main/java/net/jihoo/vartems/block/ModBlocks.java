package net.jihoo.vartems.block;

import net.jihoo.vartems.item.ModItems;
import net.jihoo.vartems.vartems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, vartems.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK =
        registerBlock("ruby_block",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> RUBY_ORE =
        registerBlock("ruby_ore",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> AMBER_BLOCK =
        registerBlock("amber_block",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> AMBER_ORE =
        registerBlock("amber_ore",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> TOPAZ_BLOCK =
        registerBlock("topaz_block",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> TOPAZ_ORE =
        registerBlock("topaz_ore",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> PERIDOT_BLOCK =
        registerBlock("peridot_block",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> PERIDOT_ORE =
        registerBlock("peridot_ore",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> LARIMAR_BLOCK =
        registerBlock("larimar_block",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> LARIMAR_ORE =
        registerBlock("larimar_ore",
        () -> new Block(BlockBehaviour.Properties.
        of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
        CreativeModeTab.TAB_MISC);

    private static <T extends Block> RegistryObject<T>
        registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
        {
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn, tab);
            return toReturn;
        }

    private static <T extends Block>RegistryObject<Item>
        registerBlockItem(String name, RegistryObject<T> block,
        CreativeModeTab tab)
        {
            return ModItems.ITEMS.register(name,
            () -> new BlockItem(block.get(),
            new Item.Properties().tab(tab)));
        }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
