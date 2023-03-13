package zhook.aohoc.a;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* loaded from: classes.dex */
public class a {
    public int b;
    public int a = 0;
    public String c = null;
    public String d = null;
    public String e = null;

    public a() {
        this.b = -1;
        this.b = -1;
    }

    public void a(zhook.aohoc.bridge.j jVar, String str) {
        this.a = 0;
        this.b = -1;
        this.c = null;
        byte[] bArr = jVar.a("aoholu_" + str, 0)[0];
        if (bArr == null) {
            if (e.a.equals(str)) {
                try {
                    this.b = Integer.parseInt(zhook.aohoc.bridge.a.c.b("q-user-id"));
                    this.c = zhook.aohoc.bridge.a.c.b("q-user-data");
                    return;
                } catch (Throwable th) {
                    this.b = -1;
                    this.c = null;
                    return;
                }
            }
            return;
        }
        this.a = 2;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            this.b = dataInputStream.readInt();
            this.c = dataInputStream.readUTF();
        } catch (Exception e) {
            this.b = -1;
            this.c = null;
            e.printStackTrace();
        }
    }

    public void b(zhook.aohoc.bridge.j jVar, String str) {
        this.a = 0;
        this.b = -1;
        this.c = null;
        if (jVar == null) {
            return;
        }
        jVar.d("aoholu_" + str);
    }
}
