package sekwah.mods.narutomod.packets.clientbound;

import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import sekwah.mods.narutomod.packets.NarutoMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import sekwah.mods.narutomod.packets.ClientPacketHandler;

public class ClientParticleEffectPacket extends NarutoMessage implements IMessageHandler<ClientParticleEffectPacket, IMessage>, IMessage {
    public ClientParticleEffectPacket(byte[] payload) {
        this.packet = payload;
        this.packetLength = payload.length;
    }

    public ClientParticleEffectPacket() {
    }

    public IMessage onMessage(ClientParticleEffectPacket message, MessageContext ctx) {
        ClientPacketHandler.handleParticleEffect(message.packet);
        return null;
    }
}