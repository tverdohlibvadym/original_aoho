package zhook.aohoc.a;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: classes.dex */
public class x implements Runnable {
    zhook.aohoc.a.a.a a;
    private zhook.aohoc.a.c.a c;
    private String d;
    private String e;
    private zhook.aohoc.bridge.a.f f;
    private DataOutputStream g;
    private DataInputStream h;
    private w i;
    private Thread j;
    private String k = "\r\n";
    int b = -1;

    public x(zhook.aohoc.a.a.a aVar, String str, String str2) {
        this.a = aVar;
        this.c = this.a.T;
        this.a.b.h = this;
        this.d = str;
        this.e = str2;
        Thread thread = new Thread(this);
        this.j = thread;
        thread.start();
    }

    public w a() {
        return this.i;
    }

    public void a(String str) {
        y.a(str);
    }

    public void a(String str, String str2, String str3) {
        y.b("[error] " + str + " [fields] " + str2 + " [context] " + str3);
    }

    public boolean b() {
        return this.a.q && this.f != null;
    }

    public void c() {
        if (this.g != null) {
            try {
                this.g.close();
            } catch (Throwable th) {
            }
        }
        this.g = null;
        if (this.h != null) {
            try {
                this.h.close();
            } catch (Throwable th2) {
            }
        }
        this.h = null;
        if (this.f != null) {
            try {
                this.f.a();
            } catch (Throwable th3) {
            }
        }
        this.f = null;
    }

    public boolean d() {
        ag.a(this.g, zhook.aohoc.bridge.a.c.a());
        this.g.writeInt(70);
        this.g.writeShort(this.c.c);
        this.g.writeShort(this.c.d);
        ag.a(this.g, this.d);
        this.g.writeUTF("" + System.getProperty("microedition.platform"));
        this.g.writeUTF("");
        this.g.writeUTF("delay=" + this.f.a((byte) 0) + " keepalive=" + this.f.a((byte) 2) + " linger=" + this.f.a((byte) 1) + " rcvbuf=" + this.f.a((byte) 3) + " sndbuf=" + this.f.a((byte) 4));
        this.g.flush();
        Thread.yield();
        String e = ag.e(this.h);
        a("received url: " + e);
        if (e.length() == 0) {
            return true;
        }
        zhook.aohoc.bridge.a.c.a(e);
        this.a.b(true);
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                this.f = (zhook.aohoc.bridge.a.f) ag.a(this.d, 3, true);
            } finally {
                y.a("qCon.run FINALLY : m_thread = null;");
                this.j = null;
            }
        } catch (SecurityException e) {
            return;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.f == null && this.e != null) {
            this.f = (zhook.aohoc.bridge.a.f) ag.a(this.e, 3, true);
        }
        if (this.f != null) {
            this.h = new DataInputStream(this.f.c());
            this.g = new DataOutputStream(this.f.d());
            zhook.aohoc.a.a.d.p = false;
            if (d()) {
                this.i = new w(this.a, this, this.h, this.g);
                this.a.a(2);
            }
        } else {
            this.a.a(4);
        }
    }
}
