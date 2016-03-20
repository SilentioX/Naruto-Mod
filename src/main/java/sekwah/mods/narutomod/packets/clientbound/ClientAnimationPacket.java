package sekwah.mods.narutomod.packets.clientbound;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import sekwah.mods.narutomod.packets.ClientPacketHandler;
import sekwah.mods.narutomod.packets.NarutoMessage;

public class ClientAnimationPacket extends NarutoMessage implements IMessageHandler<ClientAnimationPacket, IMessage>, IMessage {
    public ClientAnimationPacket(byte[] payload) {
        this.packet = payload;
        this.packetLength = payload.length;
    }

    public ClientAnimationPacket() {
    }

    public IMessage onMessage(ClientAnimationPacket message, MessageContext ctx) {
        ClientPacketHandler.handleAnimationData(message.packet);
        return null;
    }
}