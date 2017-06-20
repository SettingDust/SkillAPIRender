package com.settingdust.skillapirender;

import com.settingdust.skillapirender.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


/**
 * Author: SettingDust
 * Date: 2017/6/20.
 */
@Mod(modid = SkillAPIRender.MODID, name = SkillAPIRender.MODNAME, version = SkillAPIRender.VERSION, acceptedMinecraftVersions = "[1.11)")
public class SkillAPIRender {
    public static final String MODID = "skillapirender";
    public static final String VERSION = "0.0.1";
    public static final String MODNAME = "SkillAPIRender";
    @Instance(SkillAPIRender.MODID)
    public static SkillAPIRender instance;

    @SidedProxy(clientSide = "com.settingdust.skillapirender.client.ClientProxy",
            serverSide = "com.settingdust.skillapirender.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
