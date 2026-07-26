// LogisticsPipes recipe changes

// ── JEI Cleanup ──────────────────────────────────────────────────────────────

mods.jei.ingredient.removeAndHide(item('logisticspipes:guide_book'))
mods.jei.ingredient.hide(item('logisticspipes:parts', 3))          // Nano Hopper
mods.jei.ingredient.hide(item('logisticspipes:broken_item'))
mods.jei.ingredient.hide(item('logisticspipes:item_card'))
mods.jei.ingredient.hide(item('logisticspipes:upgrade_logic_controller'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_basic_raw'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_basic'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_advanced_raw'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_advanced'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_fpga_raw'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:chip_fpga'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:logistics_programmer'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:frame'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:power_junction'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:program_compiler'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:upgrade_power_supplier_mj'))
mods.jei.ingredient.removeAndHide(item('logisticspipes:power_provider_mj'))

// ── Module Recipes ────────────────────────────────────────────────────────────

// Pipe Controller
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_controller'))
    .shape([
        [ore('ingotGold'),     item('buildcraftcore:wrench'), ore('ingotGold')],
        [item('minecraft:redstone'), item('minecraft:glass'), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .replace()
    .register()

// Pipe Manager
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_manager'))
    .shape([
        [ore('ingotIron'),     item('buildcraftcore:wrench'), ore('ingotIron')],
        [item('minecraft:redstone'), item('minecraft:glass'), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .replace()
    .register()

// Logistics HUD Glasses parts
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:parts', 2))
    .shape([
        [null, item('buildcraftsilicon:redstone_chipset', 4), null],
        [item('minecraft:diamond'), null, item('minecraft:diamond')],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:parts', 1))
    .shape([
        [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:redstone')],
        [item('minecraft:redstone'), item('minecraft:glass'),                       item('minecraft:redstone')],
        [item('minecraft:redstone'), item('minecraft:redstone'),                    item('minecraft:redstone')]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:parts'))
    .shape([
        [null, null, null],
        [item('minecraft:diamond'), item('minecraft:diamond'), item('minecraft:diamond')],
        [null, null, item('buildcraftsilicon:redstone_chipset', 4)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:hud_glasses'))
    .shape([
        [item('logisticspipes:parts'),   null,                        item('logisticspipes:parts')],
        [item('logisticspipes:parts', 1), item('logisticspipes:parts', 2), item('logisticspipes:parts', 1)],
        [null, null, null]
    ])
    .register()

// Crafting Sign Creator (two variants)
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:sign_creator'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, item('buildcraftsilicon:redstone_chipset', 2)],
        [null, item('minecraft:sign'), null],
        [null, item('buildcraftsilicon:redstone_chipset', 4), null]
    ])
    .replace()
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:sign_creator'))
    .shape([
        [item('buildcraftcore:gear_gold'), null, item('buildcraftcore:gear_gold')],
        [null, item('minecraft:sign'), null],
        [null, item('buildcraftcore:gear_diamond'), null]
    ])
    .register()

// Blank Module
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_blank'))
    .shape([
        [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')],
        [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')],
        [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')]
    ])
    .replace()
    .register()

// ItemSink Module (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_item_sink'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_item_sink'))
    .shape([
        [item('minecraft:dye', 2), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 2)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 2), item('minecraft:redstone'), item('minecraft:dye', 2)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_item_sink'))
    .shape([
        [item('minecraft:dye', 2), item('buildcraftcore:gear_iron'), item('minecraft:dye', 2)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 2), item('minecraft:redstone'), item('minecraft:dye', 2)]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_item_sink'))
    .input([item('logisticspipes:module_item_sink')])
    .register()

// Mod Based ItemSink Module (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_item_sink_mod'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_item_sink_mod'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, null],
        [item('logisticspipes:module_item_sink'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_item_sink_mod'))
    .shape([
        [item('buildcraftcore:gear_gold'), null, null],
        [item('logisticspipes:module_item_sink'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_item_sink_mod'))
    .input([item('logisticspipes:module_item_sink_mod')])
    .register()

// OreDict ItemSink Module (one variant + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_item_sink_oredict'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_item_sink_oredict'))
    .shape([
        [item('minecraft:book'), null, null],
        [item('logisticspipes:module_item_sink_mod'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_item_sink_oredict'))
    .input([item('logisticspipes:module_item_sink_oredict')])
    .register()

// Creative Tab Based ItemSink Module (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_item_sink_creativetab'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_item_sink_creativetab'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, null],
        [item('logisticspipes:module_item_sink_oredict'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_item_sink_creativetab'))
    .shape([
        [item('buildcraftcore:gear_gold'), null, null],
        [item('logisticspipes:module_item_sink_oredict'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_item_sink_creativetab'))
    .input([item('logisticspipes:module_item_sink_creativetab')])
    .register()

// Passive Supplier Module (two variants + toggle from active)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_passive_supplier'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_passive_supplier'))
    .shape([
        [item('minecraft:dye', 1), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 1)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 1), item('minecraft:redstone'), item('minecraft:dye', 1)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_passive_supplier'))
    .shape([
        [item('minecraft:dye', 1), item('buildcraftcore:gear_iron'), item('minecraft:dye', 1)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 1), item('minecraft:redstone'), item('minecraft:dye', 1)]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_passive_supplier'))
    .input([item('logisticspipes:module_active_supplier')])
    .register()

// Active Supplier Module (toggle from passive)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_active_supplier'))
mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_active_supplier'))
    .input([item('logisticspipes:module_passive_supplier')])
    .register()

// Extractor Module (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_extractor'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_extractor'))
    .shape([
        [item('minecraft:dye', 4), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_extractor'))
    .shape([
        [item('minecraft:dye', 4), item('buildcraftcore:gear_iron'), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_extractor'))
    .input([item('logisticspipes:module_extractor')])
    .register()

// Advanced Extractor Module (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_extractor_advanced'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_extractor_advanced'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, null],
        [item('logisticspipes:module_extractor'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_extractor_advanced'))
    .shape([
        [item('buildcraftcore:gear_gold'), null, null],
        [item('logisticspipes:module_extractor'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_extractor_advanced'))
    .input([item('logisticspipes:module_extractor_advanced')])
    .register()

// Polymorphic ItemSink Module (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_item_sink_polymorphic'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_item_sink_polymorphic'))
    .shape([
        [item('minecraft:dye', 14), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:dye', 14)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 14), item('minecraft:redstone'), item('minecraft:dye', 14)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_item_sink_polymorphic'))
    .shape([
        [item('minecraft:dye', 14), item('buildcraftcore:gear_gold'), item('minecraft:dye', 14)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 14), item('minecraft:redstone'), item('minecraft:dye', 14)]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_item_sink_polymorphic'))
    .input([item('logisticspipes:module_item_sink_polymorphic')])
    .register()

// QuickSort Module (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_quick_sort'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_quick_sort'))
    .shape([
        [item('minecraft:dye', 4), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_quick_sort'))
    .shape([
        [item('minecraft:dye', 4), item('buildcraftcore:gear_diamond'), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_quick_sort'))
    .input([item('logisticspipes:module_quick_sort')])
    .register()

// Terminus Module (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_terminus'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_terminus'))
    .shape([
        [item('minecraft:dye', 5), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye')],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye'), item('minecraft:redstone'), item('minecraft:dye', 5)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_terminus'))
    .shape([
        [item('minecraft:dye', 5), item('buildcraftcore:gear_iron'), item('minecraft:dye')],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye'), item('minecraft:redstone'), item('minecraft:dye', 5)]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_terminus'))
    .input([item('logisticspipes:module_terminus')])
    .register()

// Provider Module MK1 (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_provider'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_provider'))
    .shape([
        [item('minecraft:dye', 4), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_provider'))
    .shape([
        [item('minecraft:dye', 4), item('buildcraftcore:gear_gold'), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_provider'))
    .input([item('logisticspipes:module_provider')])
    .register()

// Provider Module MK2 (two variants + upgrade from MK1 + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_provider_mk2'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_provider_mk2'))
    .shape([
        [item('minecraft:dye', 4), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_provider_mk2'))
    .shape([
        [item('minecraft:dye', 4), item('buildcraftcore:gear_diamond'), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 4)]
    ])
    .register()

// Provider Module MK1 -> MK2 Upgrade (two variants)
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_provider_mk2'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 4), null, null],
        [item('logisticspipes:module_provider'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_provider_mk2'))
    .shape([
        [item('buildcraftcore:gear_diamond'), null, null],
        [item('logisticspipes:module_provider'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_provider_mk2'))
    .input([item('logisticspipes:module_provider_mk2')])
    .register()

// Enchantment Sink Module MK1 (one variant + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_enchantment_sink'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_enchantment_sink'))
    .shape([
        [item('minecraft:enchanted_book'), null, null],
        [item('logisticspipes:module_item_sink'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_enchantment_sink'))
    .input([item('logisticspipes:module_enchantment_sink')])
    .register()

// Enchantment Sink Module MK2 (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_enchantment_sink_mk2'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_enchantment_sink_mk2'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, null],
        [item('logisticspipes:module_enchantment_sink'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_enchantment_sink_mk2'))
    .shape([
        [item('buildcraftcore:gear_gold'), null, null],
        [item('logisticspipes:module_enchantment_sink'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_enchantment_sink_mk2'))
    .input([item('logisticspipes:module_enchantment_sink_mk2')])
    .register()

// Crafting Module MK1 (two variants + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_crafter'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter'))
    .shape([
        [item('minecraft:dye', 1), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 1)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter'))
    .shape([
        [item('minecraft:dye', 1), item('buildcraftcore:gear_iron'), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 1)]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_crafter'))
    .input([item('logisticspipes:module_crafter')])
    .register()

// Crafting Module MK2 (two variants + upgrade from MK1 + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_crafter_mk2'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter_mk2'))
    .shape([
        [item('minecraft:dye', 1), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 1)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter_mk2'))
    .shape([
        [item('minecraft:dye', 1), item('buildcraftcore:gear_gold'), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 1)]
    ])
    .register()

// Crafting Module MK1 -> MK2 Upgrade (two variants)
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter_mk2'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, null],
        [item('logisticspipes:module_crafter'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter_mk2'))
    .shape([
        [item('buildcraftcore:gear_gold'), null, null],
        [item('logisticspipes:module_crafter'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_crafter_mk2'))
    .input([item('logisticspipes:module_crafter_mk2')])
    .register()

// Crafting Module MK3 (two variants + upgrade from MK2 + self-reuse)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:module_crafter_mk3'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter_mk3'))
    .shape([
        [item('minecraft:dye', 1), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 1)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter_mk3'))
    .shape([
        [item('minecraft:dye', 1), item('buildcraftcore:gear_diamond'), item('minecraft:dye', 4)],
        [item('minecraft:redstone'), item('logisticspipes:module_blank'), item('minecraft:redstone')],
        [item('minecraft:dye', 4), item('minecraft:redstone'), item('minecraft:dye', 1)]
    ])
    .register()

// Crafting Module MK2 -> MK3 Upgrade (two variants)
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter_mk3'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 4), null, null],
        [item('logisticspipes:module_crafter_mk2'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:module_crafter_mk3'))
    .shape([
        [item('buildcraftcore:gear_diamond'), null, null],
        [item('logisticspipes:module_crafter_mk2'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:module_crafter_mk3'))
    .input([item('logisticspipes:module_crafter_mk3')])
    .register()

// ── Upgrade Recipes ───────────────────────────────────────────────────────────

// Crafting Byproduct Extraction Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_crafting_byproduct'))
    .shape([
        [item('minecraft:redstone'), item('buildcraftcore:gear_wood'), item('minecraft:redstone')],
        [item('buildcraftcore:gear_wood'), item('buildcraftsilicon:redstone_chipset', 1), item('buildcraftcore:gear_wood')],
        [item('minecraft:redstone'), item('buildcraftcore:gear_wood'), item('minecraft:redstone')]
    ])
    .replace()
    .register()

// Fluid Crafting Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_fluid_crafting'))
    .shape([
        [item('minecraft:redstone'), item('minecraft:glass_bottle'), item('minecraft:redstone')],
        [item('minecraft:glass_bottle'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:glass_bottle')],
        [item('minecraft:redstone'), item('minecraft:glass_bottle'), item('minecraft:redstone')]
    ])
    .replace()
    .register()

// Sneaky Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_sneaky'))
    .shape([
        [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')],
        [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:redstone')],
        [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')]
    ])
    .replace()
    .register()

// Sneaky Combination Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_sneaky_combination'))
    .shape([
        [item('minecraft:slime_ball'), item('minecraft:redstone'), item('minecraft:slime_ball')],
        [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:redstone')],
        [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')]
    ])
    .replace()
    .register()

// Power Transportation Upgrade (two variants, output 4)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:upgrade_power_transportation'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_power_transportation') * 4)
    .shape([
        [item('minecraft:paper'), item('minecraft:redstone_block'), item('minecraft:paper')],
        [item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:glowstone'), item('buildcraftsilicon:redstone_chipset', 1)],
        [item('minecraft:paper'), item('minecraft:lapis_block'), item('minecraft:paper')]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_power_transportation') * 4)
    .shape([
        [item('minecraft:paper'), item('minecraft:redstone_block'), item('minecraft:paper')],
        [item('buildcraftcore:gear_iron'), item('minecraft:glowstone'), item('buildcraftcore:gear_iron')],
        [item('minecraft:paper'), item('minecraft:lapis_block'), item('minecraft:paper')]
    ])
    .register()

// Item Speed Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_speed'))
    .shape([
        [item('minecraft:paper'), ore('ingotGold'), item('minecraft:paper')],
        [ore('ingotGold'), item('buildcraftsilicon:redstone_chipset', 1), ore('ingotGold')],
        [item('minecraft:paper'), ore('ingotGold'), item('minecraft:paper')]
    ])
    .replace()
    .register()

// Disconnection Upgrade (output 8)
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_disconnection') * 8)
    .shape([
        [ore('ingotIron'), item('minecraft:redstone'), ore('ingotIron')],
        [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:redstone')],
        [item('minecraft:paper'), item('minecraft:redstone'), item('minecraft:paper')]
    ])
    .replace()
    .register()

// Advanced Satellite Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_satellite_advanced'))
    .shape([
        [item('minecraft:paper'), ore('ingotIron'), item('minecraft:paper')],
        [ore('ingotIron'), item('buildcraftsilicon:redstone_chipset', 2), ore('ingotIron')],
        [item('minecraft:paper'), ore('ingotIron'), item('minecraft:paper')]
    ])
    .replace()
    .register()

// Placement Rules Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_pattern'))
    .shape([
        [item('minecraft:redstone'), item('minecraft:hopper'), item('minecraft:dye', 11)],
        [ore('ingotIron'), item('buildcraftsilicon:redstone_chipset', 1), ore('ingotIron')],
        [item('minecraft:dye', 1), ore('ingotIron'), item('minecraft:redstone')]
    ])
    .replace()
    .register()

// Fuzzy Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_fuzzy'))
    .shape([
        [item('minecraft:paper'), item('minecraft:quartz'), item('minecraft:paper')],
        [item('minecraft:quartz'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:quartz')],
        [item('minecraft:paper'), item('minecraft:quartz'), item('minecraft:paper')]
    ])
    .replace()
    .register()

// Crafting Monitoring Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_crafting_monitoring'))
    .shape([
        [item('minecraft:redstone'), item('minecraft:dye', 4), item('minecraft:redstone')],
        [item('minecraft:dye', 2), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:dye', 11)],
        [item('minecraft:redstone'), item('logisticspipes:pipe_chassis_mk2'), item('minecraft:redstone')]
    ])
    .replace()
    .register()

// Opaque Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_opaque'))
    .shape([
        [item('minecraft:redstone'), item('minecraft:dye', 15), item('minecraft:redstone')],
        [item('minecraft:dye', 15), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:dye', 15)],
        [item('minecraft:redstone'), item('minecraft:dye', 15), item('minecraft:redstone')]
    ])
    .replace()
    .register()

// Crafting Cleanup Upgrade (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:upgrade_crafting_cleanup'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_crafting_cleanup'))
    .shape([
        [item('minecraft:redstone'), item('minecraft:dye', 1), item('minecraft:redstone')],
        [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:paper')],
        [item('minecraft:redstone'), item('logisticspipes:module_extractor'), item('minecraft:redstone')]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_crafting_cleanup'))
    .shape([
        [item('minecraft:redstone'), item('minecraft:dye', 1), item('minecraft:redstone')],
        [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:paper')],
        [item('minecraft:redstone'), item('logisticspipes:module_extractor_advanced'), item('minecraft:redstone')]
    ])
    .register()

// Module Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_module_upgrade'))
    .shape([
        [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')],
        [item('minecraft:dye'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:dye')],
        [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')]
    ])
    .replace()
    .register()

// Action Speed Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_action_speed'))
    .shape([
        [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')],
        [item('minecraft:redstone'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:redstone')],
        [item('minecraft:paper'), item('minecraft:gold_nugget'), item('minecraft:paper')]
    ])
    .replace()
    .register()

// Item Extraction Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_item_extraction'))
    .shape([
        [item('minecraft:redstone'), item('minecraft:dye', 2), item('minecraft:redstone')],
        [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 2), item('minecraft:paper')],
        [item('minecraft:redstone'), item('logisticspipes:module_extractor_advanced'), item('minecraft:redstone')]
    ])
    .replace()
    .register()

// ItemSink Extraction Upgrade (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:upgrade_item_stack_extraction'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_item_stack_extraction'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, null],
        [item('logisticspipes:upgrade_item_extraction'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_item_stack_extraction'))
    .shape([
        [item('buildcraftcore:gear_gold'), null, null],
        [item('logisticspipes:upgrade_item_extraction'), null, null],
        [null, null, null]
    ])
    .register()

// RF Power Supplier Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_power_supplier_rf'))
    .shape([
        [item('minecraft:paper'), item('buildcraftcore:engine', 2), item('minecraft:paper')],
        [item('buildcraftsilicon:redstone_chipset', 2), item('logisticspipes:upgrade_power_transportation'), item('buildcraftsilicon:redstone_chipset', 2)],
        [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:paper')]
    ])
    .register()

// EU LV Power Supplier Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_power_supplier_eu_lv'))
    .shape([
        [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
        [item('ic2:ic2upgrades'), item('logisticspipes:upgrade_power_transportation'), item('ic2:ic2upgrades')],
        [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]
    ])
    .register()

// EU MV Power Supplier Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_power_supplier_eu_mv'))
    .shape([
        [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
        [item('ic2:ic2upgrades'), item('logisticspipes:upgrade_power_supplier_eu_lv'), item('ic2:ic2upgrades')],
        [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]
    ])
    .register()

// EU HV Power Supplier Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_power_supplier_eu_hv'))
    .shape([
        [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
        [item('ic2:ic2upgrades'), item('logisticspipes:upgrade_power_supplier_eu_mv'), item('ic2:ic2upgrades')],
        [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]
    ])
    .register()

// EU EV Power Supplier Upgrade
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:upgrade_power_supplier_eu_ev'))
    .shape([
        [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
        [item('ic2:ic2upgrades'), item('logisticspipes:upgrade_power_supplier_eu_hv'), item('ic2:ic2upgrades')],
        [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]
    ])
    .register()

// Remote Orderer (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:remote_orderer'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:remote_orderer'))
    .shape([
        [item('minecraft:glass'), item('minecraft:glass'), null],
        [item('minecraft:glass'), item('minecraft:glass'), null],
        [item('buildcraftsilicon:redstone_chipset', 4), item('buildcraftsilicon:redstone_chipset', 4), null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:remote_orderer'))
    .shape([
        [item('minecraft:glass'), item('minecraft:glass'), null],
        [item('minecraft:glass'), item('minecraft:glass'), null],
        [item('buildcraftcore:gear_diamond'), item('buildcraftcore:gear_diamond'), null]
    ])
    .register()

// ── Pipe Recipes ──────────────────────────────────────────────────────────────

// Unrouted Transport Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_transport_basic'))
    .shape([
        [ore('ingotIron'), item('minecraft:glass_pane'), ore('ingotIron')],
        [null, item('minecraft:redstone'), null],
        [null, null, null]
    ])
    .replace()
    .register()

// Basic Logistics Pipe (downgrade from any advanced pipe)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_basic'))

def advancedPipes = [
    item('logisticspipes:pipe_request'),
    item('logisticspipes:pipe_provider'),
    item('logisticspipes:pipe_provider_mk2'),
    item('logisticspipes:pipe_crafting'),
    item('logisticspipes:pipe_crafting_mk2'),
    item('logisticspipes:pipe_crafting_mk3'),
    item('logisticspipes:pipe_satellite'),
    item('logisticspipes:pipe_supplier'),
    item('logisticspipes:pipe_chassis_mk1'),
    item('logisticspipes:pipe_chassis_mk2'),
    item('logisticspipes:pipe_chassis_mk3'),
    item('logisticspipes:pipe_chassis_mk4'),
    item('logisticspipes:pipe_chassis_mk5'),
    item('logisticspipes:pipe_request_mk2'),
    item('logisticspipes:pipe_remote_orderer'),
    item('logisticspipes:pipe_inventory_system_connector'),
    item('logisticspipes:pipe_system_entrance'),
    item('logisticspipes:pipe_system_destination'),
    item('logisticspipes:pipe_firewall'),
    item('logisticspipes:pipe_fluid_supplier'),
    item('logisticspipes:pipe_fluid_basic'),
    item('logisticspipes:pipe_fluid_request'),
    item('logisticspipes:pipe_fluid_provider'),
    item('logisticspipes:pipe_fluid_insertion'),
    item('logisticspipes:pipe_fluid_extractor'),
    item('logisticspipes:pipe_fluid_satellite'),
    item('logisticspipes:pipe_fluid_supplier_mk2')
]
advancedPipes.each { pipeItem ->
    mods.minecraft.crafting.shapelessBuilder()
        .output(item('logisticspipes:pipe_basic'))
        .input([pipeItem])
        .register()
}

// Basic Logistics Pipe (new recipes, output 8 - chipset and gear variants)
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_basic') * 8)
    .shape([
        [item('minecraft:glass'), item('minecraft:redstone_torch'), item('minecraft:glass')],
        [item('buildcraftsilicon:redstone_chipset', 2), item('buildcrafttransport:pipe_diamond_item'), item('buildcraftsilicon:redstone_chipset', 2)],
        [item('minecraft:glass'), item('minecraft:redstone_torch'), item('minecraft:glass')]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_basic') * 8)
    .shape([
        [item('minecraft:glass'), item('minecraft:redstone_torch'), item('minecraft:glass')],
        [item('buildcraftcore:gear_gold'), item('buildcrafttransport:pipe_diamond_item'), item('buildcraftcore:gear_gold')],
        [item('minecraft:glass'), item('minecraft:redstone_torch'), item('minecraft:glass')]
    ])
    .register()

// Request Logistics Pipe MK1 (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_request'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_request'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 2)],
        [null, null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_request'))
    .shape([
        [item('buildcraftcore:gear_gold'), item('logisticspipes:pipe_basic'), item('buildcraftcore:gear_gold')],
        [null, null, null],
        [null, null, null]
    ])
    .register()

// Request Logistics Pipe MK2 (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_request_mk2'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_request_mk2'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 4), null, null],
        [item('logisticspipes:pipe_request'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_request_mk2'))
    .shape([
        [item('buildcraftcore:gear_diamond'), null, null],
        [item('logisticspipes:pipe_request'), null, null],
        [item('minecraft:redstone'), null, null]
    ])
    .register()

// Provider Logistics Pipe MK1
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_provider'))
    .shape([
        [item('minecraft:glowstone_dust'), null, null],
        [item('logisticspipes:pipe_basic'), null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// Provider Logistics Pipe MK1 -> MK2 Upgrade (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_provider_mk2'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_provider_mk2'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 4), null, null],
        [item('logisticspipes:pipe_provider'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_provider_mk2'))
    .shape([
        [item('buildcraftcore:gear_diamond'), null, null],
        [item('logisticspipes:pipe_provider'), null, null],
        [null, null, null]
    ])
    .register()

// Crafting Logistics Pipe MK1
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_crafting'))
    .shape([
        [item('minecraft:glowstone_dust'), item('logisticspipes:pipe_basic'), item('minecraft:glowstone_dust')],
        [null, null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// Crafting Logistics Pipe MK2
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_crafting_mk2'))

// Crafting Logistics Pipe MK1 -> MK2 Upgrade (two variants)
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_crafting_mk2'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, null],
        [item('logisticspipes:pipe_crafting'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_crafting_mk2'))
    .shape([
        [item('buildcraftcore:gear_gold'), null, null],
        [item('logisticspipes:pipe_crafting'), null, null],
        [null, null, null]
    ])
    .register()

// Crafting Logistics Pipe MK3
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_crafting_mk3'))

// Crafting Logistics Pipe MK2 -> MK3 Upgrade (two variants)
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_crafting_mk3'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 4), null, null],
        [item('logisticspipes:pipe_crafting_mk2'), null, null],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_crafting_mk3'))
    .shape([
        [item('buildcraftcore:gear_diamond'), null, null],
        [item('logisticspipes:pipe_crafting_mk2'), null, null],
        [null, null, null]
    ])
    .register()

// Satellite Logistics Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_satellite'))
    .shape([
        [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
        [null, null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// Supplier Logistics Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_supplier'))
    .shape([
        [item('minecraft:dye', 4), item('logisticspipes:pipe_basic'), item('minecraft:dye', 4)],
        [null, null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// Logistics Chassis MK1 (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_chassis_mk1'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk1'))
    .shape([
        [null, item('buildcraftsilicon:redstone_chipset'), null],
        [item('buildcraftsilicon:redstone_chipset'), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset')],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk1'))
    .shape([
        [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:redstone')],
        [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
        [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:redstone')]
    ])
    .register()

// Logistics Chassis MK2 (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_chassis_mk2'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk2'))
    .shape([
        [null, item('buildcraftsilicon:redstone_chipset', 1), null],
        [item('buildcraftsilicon:redstone_chipset', 1), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 1)],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk2'))
    .shape([
        [ore('ingotIron'), ore('ingotIron'), ore('ingotIron')],
        [ore('ingotIron'), item('logisticspipes:pipe_basic'), ore('ingotIron')],
        [ore('ingotIron'), ore('ingotIron'), ore('ingotIron')]
    ])
    .register()

// Logistics Chassis MK3 (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_chassis_mk3'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk3'))
    .shape([
        [null, item('buildcraftsilicon:redstone_chipset', 2), null],
        [item('buildcraftsilicon:redstone_chipset', 2), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 2)],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk3'))
    .shape([
        [ore('ingotGold'), ore('ingotGold'), ore('ingotGold')],
        [ore('ingotGold'), item('logisticspipes:pipe_basic'), ore('ingotGold')],
        [ore('ingotGold'), ore('ingotGold'), ore('ingotGold')]
    ])
    .register()

// Logistics Chassis MK4 (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_chassis_mk4'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk4'))
    .shape([
        [null, item('buildcraftsilicon:redstone_chipset', 4), null],
        [item('buildcraftsilicon:redstone_chipset', 4), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 4)],
        [null, null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk4'))
    .shape([
        [item('minecraft:diamond'), item('minecraft:diamond'), item('minecraft:diamond')],
        [item('minecraft:diamond'), item('logisticspipes:pipe_basic'), item('minecraft:diamond')],
        [item('minecraft:diamond'), item('minecraft:diamond'), item('minecraft:diamond')]
    ])
    .register()

// Logistics Chassis MK5 (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_chassis_mk5'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk5'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 4), item('buildcraftsilicon:redstone_chipset', 2), item('buildcraftsilicon:redstone_chipset', 4)],
        [item('buildcraftsilicon:redstone_chipset', 2), item('logisticspipes:pipe_basic'), item('buildcraftsilicon:redstone_chipset', 2)],
        [item('buildcraftsilicon:redstone_chipset', 4), item('buildcraftsilicon:redstone_chipset', 2), item('buildcraftsilicon:redstone_chipset', 4)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_chassis_mk5'))
    .shape([
        [item('minecraft:diamond_block'), item('minecraft:gold_block'), item('minecraft:diamond_block')],
        [item('minecraft:gold_block'), item('logisticspipes:pipe_basic'), item('minecraft:gold_block')],
        [item('minecraft:diamond_block'), item('minecraft:gold_block'), item('minecraft:diamond_block')]
    ])
    .register()

// Remote Orderer Logistics Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_remote_orderer'))
    .shape([
        [item('minecraft:ender_pearl'), null, null],
        [item('logisticspipes:pipe_basic'), null, null],
        [item('minecraft:redstone'), null, null]
    ])
    .replace()
    .register()

// Logistics Inventory System Connector
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_inventory_system_connector'))
    .shape([
        [null, item('minecraft:ender_pearl'), null],
        [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
        [null, null, null]
    ])
    .replace()
    .register()

// Logistics System Entrance Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_system_entrance'))
    .shape([
        [item('minecraft:dye', 2), null, null],
        [item('logisticspipes:pipe_provider'), null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// Logistics System Destination Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_system_destination'))
    .shape([
        [item('minecraft:dye', 1), null, null],
        [item('logisticspipes:pipe_provider'), null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// Logistics Firewall Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_firewall'))
    .shape([
        [item('minecraft:nether_brick'), item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:nether_brick')],
        [null, item('logisticspipes:pipe_basic'), null],
        [item('minecraft:nether_brick'), null, item('minecraft:nether_brick')]
    ])
    .replace()
    .register()

// Logistics Fluid Basic Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_basic'))
    .shape([
        [item('buildcrafttransport:waterproof'), item('buildcrafttransport:waterproof'), item('buildcrafttransport:waterproof')],
        [item('minecraft:bucket'), item('logisticspipes:pipe_basic'), item('minecraft:bucket')],
        [item('buildcrafttransport:waterproof'), item('buildcrafttransport:waterproof'), item('buildcrafttransport:waterproof')]
    ])
    .replace()
    .register()

// Logistics Fluid Request Pipe (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_fluid_request'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_request'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, null],
        [item('logisticspipes:pipe_fluid_basic'), null, null],
        [item('buildcraftcore:gear_iron'), null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_request'))
    .shape([
        [item('buildcraftcore:gear_gold'), null, null],
        [item('logisticspipes:pipe_fluid_basic'), null, null],
        [item('buildcraftcore:gear_iron'), null, null]
    ])
    .register()

// Logistics Fluid Provider Pipe (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_fluid_provider'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_provider'))
    .shape([
        [item('buildcraftsilicon:redstone_chipset', 2), null, null],
        [item('logisticspipes:pipe_fluid_basic'), null, null],
        [item('minecraft:redstone_torch'), null, null]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_provider'))
    .shape([
        [null, item('buildcraftcore:gear_gold'), null],
        [item('minecraft:redstone'), item('logisticspipes:pipe_fluid_basic'), item('minecraft:redstone')],
        [null, null, null]
    ])
    .register()

// Logistics Fluid Container Supplier Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_supplier'))
    .shape([
        [item('minecraft:dye', 4), item('logisticspipes:pipe_basic'), item('minecraft:dye', 4)],
        [null, item('minecraft:bucket'), null],
        [null, null, null]
    ])
    .replace()
    .register()

// Logistics Fluid Supplier Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_supplier_mk2'))
    .shape([
        [item('minecraft:dye', 4), item('logisticspipes:pipe_fluid_basic'), item('minecraft:dye', 4)],
        [null, null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// Logistics Fluid Satellite Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_satellite'))
    .shape([
        [item('minecraft:redstone'), item('logisticspipes:pipe_fluid_basic'), item('minecraft:redstone')],
        [null, null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// Logistics Fluid Insertion Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_insertion'))
    .shape([
        [null, item('minecraft:glass_bottle'), null],
        [item('minecraft:glass_bottle'), item('logisticspipes:pipe_fluid_basic'), item('minecraft:glass_bottle')],
        [null, item('minecraft:glass_bottle'), null]
    ])
    .replace()
    .register()

// Logistics Fluid Extractor Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_extractor'))
    .shape([
        [item('buildcrafttransport:pipe_wood_fluid'), null, null],
        [item('logisticspipes:pipe_fluid_basic'), null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// Logistics Fluid Terminus Pipe
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_fluid_terminus'))
    .shape([
        [item('minecraft:dye'), item('logisticspipes:pipe_fluid_basic'), item('minecraft:dye', 5)],
        [null, null, null],
        [null, null, null]
    ])
    .replace()
    .register()

// ── Block Recipes ─────────────────────────────────────────────────────────────

// Logistics Crafting Table
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:crafting_table'))
    .shape([
        [item('minecraft:planks'), item('minecraft:crafting_table'), item('minecraft:planks')],
        [null, item('buildcraftcore:gear_stone'), null],
        [item('minecraft:planks'), item('minecraft:chest'), item('minecraft:planks')]
    ])
    .replace()
    .register()

// Logistics Fuzzy Crafting Table
mods.minecraft.crafting.shapelessBuilder()
    .output(item('logisticspipes:crafting_table_fuzzy'))
    .input([item('logisticspipes:crafting_table'), item('minecraft:quartz')])
    .replace()
    .register()

// Logistics Request Table (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:pipe_request_table'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_request_table'))
    .shape([
        [item('minecraft:stonebrick'), item('minecraft:crafting_table'), item('minecraft:stonebrick')],
        [item('logisticspipes:pipe_crafting'), item('minecraft:hopper'), item('logisticspipes:pipe_request_mk2')],
        [item('buildcraftsilicon:redstone_chipset', 4), item('minecraft:chest'), item('buildcraftsilicon:redstone_chipset', 4)]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:pipe_request_table'))
    .shape([
        [item('minecraft:stonebrick'), item('minecraft:crafting_table'), item('minecraft:stonebrick')],
        [item('logisticspipes:pipe_crafting'), item('minecraft:hopper'), item('logisticspipes:pipe_request_mk2')],
        [item('buildcraftcore:gear_diamond'), item('minecraft:chest'), item('buildcraftcore:gear_diamond')]
    ])
    .register()

// Logistics Security Station (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:security_station'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:security_station'))
    .shape([
        [ore('ingotIron'), item('buildcraftsilicon:redstone_chipset', 4), ore('ingotIron')],
        [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
        [ore('ingotIron'), ore('ingotIron'), ore('ingotIron')]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:security_station'))
    .shape([
        [ore('ingotIron'), item('buildcraftcore:gear_diamond'), ore('ingotIron')],
        [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
        [ore('ingotIron'), ore('ingotIron'), ore('ingotIron')]
    ])
    .register()

// Logistics Statistics Table (two variants)
mods.minecraft.crafting.removeByOutput(item('logisticspipes:statistics_table'))
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:statistics_table'))
    .shape([
        [ore('ingotIron'), item('buildcraftsilicon:redstone_chipset', 2), ore('ingotIron')],
        [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
        [ore('ingotIron'), ore('ingotIron'), ore('ingotIron')]
    ])
    .register()

mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:statistics_table'))
    .shape([
        [ore('ingotIron'), item('buildcraftcore:gear_gold'), ore('ingotIron')],
        [item('minecraft:redstone'), item('logisticspipes:pipe_basic'), item('minecraft:redstone')],
        [ore('ingotIron'), ore('ingotIron'), ore('ingotIron')]
    ])
    .register()

// RF Power Provider
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:power_provider_rf'))
    .shape([
        [item('minecraft:paper'), item('buildcraftcore:engine', 2), item('minecraft:paper')],
        [item('buildcraftsilicon:redstone_chipset', 2), ore('blockRedstone'), item('buildcraftsilicon:redstone_chipset', 2)],
        [item('minecraft:paper'), item('buildcraftsilicon:redstone_chipset', 1), item('minecraft:paper')]
    ])
    .register()

// EU Power Provider
mods.minecraft.crafting.shapedBuilder()
    .output(item('logisticspipes:power_provider_eu'))
    .shape([
        [item('minecraft:paper'), item('ic2:ic2upgrades', 2), item('minecraft:paper')],
        [item('ic2:ic2upgrades'), ore('blockRedstone'), item('ic2:ic2upgrades')],
        [item('minecraft:paper'), item('ic2:ic2upgrades', 1), item('minecraft:paper')]
    ])
    .register()
