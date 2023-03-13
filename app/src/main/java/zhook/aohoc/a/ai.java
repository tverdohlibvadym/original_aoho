package zhook.aohoc.a;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: classes.dex */
public class ai {
    public static zhook.aohoc.bridge.f a(DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(-1991225785);
        dataOutputStream.writeInt(218765834);
        a(dataInputStream, dataOutputStream, 1229472850);
        a(dataInputStream, dataOutputStream, 1347179589);
        a(dataInputStream, dataOutputStream, 1951551059);
        a(dataInputStream, dataOutputStream, 1229209940);
        dataOutputStream.writeInt(0);
        dataOutputStream.writeInt(1229278788);
        dataOutputStream.writeInt(-1371381630);
        return zhook.aohoc.bridge.a.d.a(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
    }

    private static void a(DataInputStream dataInputStream, DataOutputStream dataOutputStream, int i) {
        short readShort = dataInputStream.readShort();
        if (readShort == -1) {
            return;
        }
        byte[] bArr = new byte[readShort + 4];
        dataInputStream.read(bArr);
        dataOutputStream.writeInt(readShort);
        dataOutputStream.writeInt(i);
        dataOutputStream.write(bArr);
    }
}
