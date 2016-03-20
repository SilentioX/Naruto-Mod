package sekwah.mods.narutomod.packets.serverbound;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import sekwah.mods.narutomod.packets.NarutoMessage;
import sekwah.mods.narutomod.packets.ServerPacketHandler;

public class ServerJutsuPacket extends NarutoMessage implements IMessageHandler<ServerJutsuPacket, IMessage>, IMessage {
    public ServerJutsuPacket(byte[] payload) {
        this.packet = payload;
        this.packetLength = payload.length;
    }

    public ServerJutsuPacket() {
    }

    public IMessage onMessage(ServerJutsuPacket message, MessageContext ctx) {
        ServerPacketHandler.handleJutsuPacket(message.packet, ctx.getServerHandler().playerEntity);
        return null;
    }
}