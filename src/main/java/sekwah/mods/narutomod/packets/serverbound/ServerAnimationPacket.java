package sekwah.mods.narutomod.packets.serverbound;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import sekwah.mods.narutomod.packets.NarutoMessage;
import sekwah.mods.narutomod.packets.ServerPacketHandler;

public class ServerAnimationPacket extends NarutoMessage implements IMessageHandler<ServerAnimationPacket, IMessage>, IMessage {
    public ServerAnimationPacket(byte[] payload) {
        this.packet = payload;
        this.packetLength = payload.length;
    }

    public ServerAnimationPacket() {
    }

    public IMessage onMessage(ServerAnimationPacket message, MessageContext ctx) {
        ServerPacketHandler.handleAnimationPacket(message.packet, ctx.getServerHandler().playerEntity);
        return null;
    }
}