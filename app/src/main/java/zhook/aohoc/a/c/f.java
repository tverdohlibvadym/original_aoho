package zhook.aohoc.a.c;

import zhook.aohoc.a.ag;
import zhook.aohoc.a.y;

/* loaded from: classes.dex */
public class f {
    public int a;
    public short[] b;
    public short[] c;
    public String[] d;
    public zhook.aohoc.bridge.f e;
    public zhook.aohoc.bridge.e f;
    zhook.aohoc.a.j g;
    zhook.aohoc.a.a.a h;
    a i;
    c j;
    int[] k;
    String[] l;
    public boolean m = true;
    public boolean n = false;

    private f() {
    }

    public f(zhook.aohoc.a.a.a aVar, zhook.aohoc.a.j jVar) {
        this.g = jVar;
        this.h = aVar;
        this.i = aVar.T;
        this.j = this.i.j;
        this.a = jVar.c;
        y.a("gVarBuffer.init : txtCount=" + this.a);
        this.b = new short[this.a];
        this.c = new short[this.a];
        this.d = new String[this.a];
        System.arraycopy(jVar.e, 0, this.b, 0, this.a);
        System.arraycopy(jVar.f, 0, this.c, 0, this.a);
        this.e = zhook.aohoc.bridge.a.d.a(this.i.a, this.i.b);
        this.f = this.e.c();
        this.k = new int[this.e.a() * this.e.b()];
        this.e.a(this.k, 0, this.e.a(), 0, 0, this.e.a(), this.e.b());
        for (int i = 0; i < this.k.length; i++) {
            int[] iArr = this.k;
            iArr[i] = iArr[i] & 16777215;
        }
    }

    private zhook.aohoc.bridge.f e() {
        return zhook.aohoc.bridge.a.d.a(this.k, this.i.a, this.i.b, true);
    }

    public void a(int i, int i2, int i3) {
        if (this.n) {
            d();
            this.n = false;
        }
        if (this.m) {
            zhook.aohoc.bridge.e eVar = this.i.g;
            this.i.g = this.f;
            this.g.e(i, i2, i3);
            this.i.g = eVar;
        }
    }

    public void a(boolean z) {
        this.m = a() || z;
        if (this.m) {
            this.n = true;
        }
    }

    public boolean a() {
        boolean z = false;
        for (int i = 0; i < this.a; i++) {
            if (a(i)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(int i) {
        b();
        short s = this.c[i];
        short[] sArr = this.b;
        short b = (short) this.h.g.b(s, this.b[i]);
        sArr[i] = b;
        if (b != -1) {
            String str = this.h.g.c[b];
            String str2 = this.l[b];
            this.l[b] = this.h.g.c[b];
            if (str != null ? !str.equals(str2) : str2 != null) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        if (this.h.g.c == null) {
            return;
        }
        int length = this.h.g.c.length;
        if (this.l == null) {
            this.l = new String[length];
        } else if (length > this.l.length) {
            this.l = ag.a(this.l, length, "");
        }
    }

    public void c() {
        this.j.f();
        zhook.aohoc.bridge.e eVar = this.i.g;
        zhook.aohoc.bridge.f fVar = this.e;
        a aVar = this.i;
        eVar.a(fVar, 0, 0, 20);
    }

    public void d() {
        if (zhook.aohoc.bridge.a.c.b() != zhook.aohoc.bridge.platform.b.c) {
            this.e.d();
            return;
        }
        this.e = e();
        this.f = this.e.c();
    }
}
