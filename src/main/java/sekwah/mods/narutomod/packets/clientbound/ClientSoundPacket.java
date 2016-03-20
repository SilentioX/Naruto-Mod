package sekwah.mods.narutomod.packets.clientbound;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import sekwah.mods.narutomod.packets.NarutoMessage;
import sekwah.mods.narutomod.packets.ClientPacketHandler;

public class ClientSoundPacket extends NarutoMessage implements IMessageHandler<ClientSoundPacket, IMessage>, IMessage {
    public ClientSoundPacket(byte[] payload) {
        this.packet = payload;
        this.packetLength = payload.length;
    }

    public ClientSoundPacket() {
    }

    public IMessage onMessage(ClientSoundPacket message, MessageContext ctx) {
        ClientPacketHandler.handleSoundData(message.packet);
        return null;
    }
}