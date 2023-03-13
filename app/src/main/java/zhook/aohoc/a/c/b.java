package zhook.aohoc.a.c;

import zhook.aohoc.a.ag;
import zhook.aohoc.a.y;

/* loaded from: classes.dex */
public class b {
    public zhook.aohoc.bridge.f a;
    public zhook.aohoc.bridge.e b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    g k;
    private a l;
    private c m;

    public b(a aVar) {
        this.l = aVar;
        this.m = this.l.j;
    }

    public void a() {
        this.l.g = this.b;
        this.l.e = this.g;
        this.l.f = this.h;
    }

    public void a(int i, int i2) {
        y.a("initBuffer: " + i + "x" + i2);
        this.d = true;
        this.c = false;
        this.e = 0;
        this.f = 0;
        this.g = i;
        this.h = i2;
        this.a = zhook.aohoc.bridge.a.d.a(i, i2);
        this.b = this.a.c();
    }

    public void b() {
        this.e = 0;
        this.f = 0;
        this.c = false;
        this.d = true;
    }

    public void b(int i, int i2) {
        int a = this.a.a();
        int b = this.a.b();
        if (!this.c) {
            if (this.m.c(i, i2, a, b)) {
                zhook.aohoc.bridge.e eVar = this.l.g;
                zhook.aohoc.bridge.f fVar = this.a;
                a aVar = this.l;
                eVar.a(fVar, i, i2, 20);
                return;
            }
            return;
        }
        int i3 = this.e;
        int i4 = this.f;
        int i5 = a - i3;
        int i6 = b - i4;
        this.k.a(this.a, i3, i4, i5, i6, i, i2, 0);
        this.k.a(this.a, 0, i4, i3, i6, i + i5, i2, 0);
        this.k.a(this.a, i3, 0, i5, i4, i, i2 + i6, 0);
        this.k.a(this.a, 0, 0, i3, i4, i + i5, i2 + i6, 0);
    }

    public void c(int i, int i2) {
        this.e = ag.a(this.e + i, this.a.a());
        this.f = ag.a(this.f + i2, this.a.b());
        this.c = (this.e == 0 && this.f == 0) ? false : true;
    }
}
