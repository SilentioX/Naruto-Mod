package sekwah.mods.narutomod.packets.clientbound;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import sekwah.mods.narutomod.packets.ClientPacketHandler;
import sekwah.mods.narutomod.packets.NarutoMessage;

public class ClientJutsuPacket extends NarutoMessage implements IMessageHandler<ClientJutsuPacket, IMessage>, IMessage {
    public ClientJutsuPacket(byte[] payload) {
        this.packet = payload;
        this.packetLength = payload.length;
    }

    public ClientJutsuPacket() {
    }

    public IMessage onMessage(ClientJutsuPacket message, MessageContext ctx) {
        ClientPacketHandler.handleJutsuData(message.packet);
        return null;
    }
}