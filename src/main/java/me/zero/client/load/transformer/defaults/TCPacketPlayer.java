package me.zero.client.load.transformer.defaults;

import me.zero.client.load.transformer.LoadTransformer;
import me.zero.client.load.transformer.Transformer;
import me.zero.client.load.transformer.hook.ClassHook;
import me.zero.client.load.transformer.reference.ClassReference;
import me.zero.client.load.transformer.wrapper.defaults.WCPacketPlayer;

import java.util.Collection;

import static me.zero.client.load.transformer.reference.obfuscation.MCMappings.CPacketPlayer;

/**
 * Wraps the CPacketPlayer class with ICPacketPlayer
 *
 * @since 1.0
 *
 * Created by Brady on 2/24/2017.
 */
@LoadTransformer
public class TCPacketPlayer extends Transformer {

    @Override
    public void loadHooks(Collection<ClassHook> hooks) {
        hooks.add(new WCPacketPlayer().createClassHook());
    }

    @Override
    public ClassReference getTargetClass() {
        return CPacketPlayer;
    }
}
