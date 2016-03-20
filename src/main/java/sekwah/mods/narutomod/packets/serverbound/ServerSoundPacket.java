package sekwah.mods.narutomod.packets.serverbound;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import sekwah.mods.narutomod.packets.NarutoMessage;
import sekwah.mods.narutomod.packets.ServerPacketHandler;

public class ServerSoundPacket extends NarutoMessage implements IMessageHandler<ServerSoundPacket, IMessage>, IMessage {
    public ServerSoundPacket(byte[] payload) {
        this.packet = payload;
        this.packetLength = payload.length;
    }

    public ServerSoundPacket() {
    }

    public IMessage onMessage(ServerSoundPacket message, MessageContext ctx) {
        ServerPacketHandler.handleSoundPacket(message.packet);
        return null;
    }
}