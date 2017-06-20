package com.settingdust.skillapirender.event;

import com.settingdust.skillapirender.SkillAPIRender;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ClientCustomPacketEvent;

import java.io.IOException;

/**
 * Author: SettingDust
 * Date: 2017/6/20.
 */
public class Events {
    public static Events instance;

    public Events() {
        instance = this;
    }

    @SubscribeEvent
    public void displayDamage(LivingUpdateEvent event) {
        SkillAPIRender.proxy.displayDamageDealt(event.getEntityLiving());
    }

    @SubscribeEvent
    public void skillPacket(ClientCustomPacketEvent event) throws IOException {
        PacketBuffer packetBuffer = null;
        if (event.getPacket().channel().equalsIgnoreCase(SkillAPIRender.channel)) {
            event.getPacket().readPacketData(packetBuffer);
        }
    }
}
