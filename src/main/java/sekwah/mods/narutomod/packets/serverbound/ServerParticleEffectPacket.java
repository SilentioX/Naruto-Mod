package sekwah.mods.narutomod.packets.serverbound;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import sekwah.mods.narutomod.packets.NarutoMessage;
import sekwah.mods.narutomod.packets.ServerPacketHandler;

public class ServerParticleEffectPacket extends NarutoMessage implements IMessageHandler<ServerParticleEffectPacket, IMessage>, IMessage {
    public ServerParticleEffectPacket(byte[] payload) {
        this.packet = payload;
        this.packetLength = payload.length;
    }

    public ServerParticleEffectPacket() {
    }

    public IMessage onMessage(ServerParticleEffectPacket message, MessageContext ctx) {
        ServerPacketHandler.handleParticlePacket(message.packet);
        return null;
    }
}