package zhook.aohoc.bridge;

import zhook.aohoc.a.ag;

/* loaded from: classes.dex */
public abstract class h {
    protected zhook.aohoc.a.a.a a;
    protected int b = -1;
    protected int c = -1;
    protected long d = -1;
    protected int e = -1;
    protected boolean f = false;
    protected boolean g = false;
    protected int h = -1;
    protected boolean i = false;
    protected long j = 0;
    protected int k = 0;
    protected boolean l = false;
    protected zhook.aohoc.a.c.a m;

    public void a() {
        this.a.f(-1036288);
    }

    public void a(int i) {
        if (ag.b == 0 && this.a != null && this.a.O) {
            try {
                if (this.a.r) {
                    return;
                }
                this.a.f.a(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(int i, int i2) {
        if (this.a.A != 3 || this.a.N == null || this.a.h != null) {
        }
        if (i2 > this.m.d) {
            a();
        }
    }

    public abstract void a(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4);

    public void a(zhook.aohoc.a.a.a aVar) {
        this.a = aVar;
        this.m = this.a.T;
    }

    public abstract void b();

    public void b(int i) {
        if (ag.b == 0 && this.a != null && this.a.O) {
            try {
                if (this.a.r) {
                    return;
                }
                this.a.f.b(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void b(int i, int i2) {
    }
}
