package me.zero.client.load.transformer.wrapper.defaults;

import me.zero.client.wrapper.ISPacketPlayerPosLook;
import me.zero.client.load.transformer.LoadTransformer;
import me.zero.client.load.transformer.wrapper.ClassWrapper;

import static javassist.CtClass.*;
import static me.zero.client.load.transformer.reference.obfuscation.MCMappings.*;

/**
 * Wraps ISPacketPlayerPosLook to SPacketPlayerPosLook
 *
 * @since 1.0
 *
 * Created by Brady on 2/28/2017.
 */
@LoadTransformer
public class WSPacketPlayerPosLook extends ClassWrapper {

    public WSPacketPlayerPosLook() {
        super(SPacketPlayerPosLook, ISPacketPlayerPosLook.class);
    }

    @Override
    protected void loadImplementations() {
        this.implementS("setX", doubleType, player_x);
        this.implementS("setY", doubleType, player_y);
        this.implementS("setZ", doubleType, player_z);
        this.implementS("setYaw", floatType, player_yaw);
        this.implementS("setPitch", floatType, player_pitch);
    }
}