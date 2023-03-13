package zhook.aohoc.bridge.platform.andr;

import android.util.Log;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes.dex */
public class k implements zhook.aohoc.bridge.a.f {
    protected Socket a;

    public k(String str) {
        int i = 0;
        int indexOf = str.indexOf(58);
        if (indexOf < 1) {
            throw new IllegalArgumentException("no ':' in URL");
        }
        str.substring(0, indexOf);
        String substring = str.substring(indexOf + 1);
        int indexOf2 = substring.indexOf(58);
        if (indexOf2 < 1) {
            Log.w("Connect", "No Port in URL.");
        } else {
            i = Integer.parseInt(substring.substring(indexOf2 + 1));
            substring = substring.substring(2, indexOf2);
        }
        this.a = new Socket(substring, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // zhook.aohoc.bridge.a.f
    public int a(byte b) {
        switch (b) {
            case 0:
                return this.a.getSoTimeout();
            case 1:
                return this.a.getSoLinger();
            case 2:
                return this.a.getKeepAlive() ? 1 : 0;
            case 3:
                this.a.getReceiveBufferSize();
                break;
            case 4:
                break;
            default:
                return 0;
        }
        this.a.getSendBufferSize();
        return 0;
    }

    @Override // zhook.aohoc.bridge.a.a
    public void a() {
        this.a.close();
        this.a = null;
    }

    @Override // zhook.aohoc.bridge.a.d
    public DataInputStream b() {
        return new DataInputStream(c());
    }

    @Override // zhook.aohoc.bridge.a.d
    public InputStream c() {
        return this.a.getInputStream();
    }

    @Override // zhook.aohoc.bridge.a.e
    public OutputStream d() {
        return this.a.getOutputStream();
    }
}
