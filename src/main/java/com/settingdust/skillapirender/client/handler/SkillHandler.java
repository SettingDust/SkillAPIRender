package com.settingdust.skillapirender.client.handler;

import com.settingdust.skillapirender.client.packet.SkillAPITranslator;
import com.settingdust.skillapirender.client.packet.impl.SkillAPITranslatorImpl;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraftforge.fml.common.network.FMLIndexedMessageToMessageCodec;

/**
 * Author: SettingDust
 * Date: 2017/6/20.
 */
public class SkillApiHandler extends FMLIndexedMessageToMessageCodec<SkillAPITranslator> {
    public SkillApiHandler() {
        addDiscriminator(0, SkillAPITranslatorImpl.class);
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, SkillAPITranslator msg, ByteBuf target) throws Exception {
        msg.write(target);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf source, SkillAPITranslator msg) {
        msg.read(source);
    }
}
