package zhook.aohoc.a;

/* loaded from: classes.dex */
public class z {
    zhook.aohoc.a.a.a a;
    private zhook.aohoc.a.c.d b;
    private int c;
    private int d;
    private String e;
    private int f;
    private int g;
    private int h;
    private int i = 0;
    private int j;
    private int k;
    private int l;
    private int m;

    public z(zhook.aohoc.a.a.a aVar, zhook.aohoc.a.c.d dVar, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.a = aVar;
        this.b = dVar;
        this.c = i & 3;
        this.d = (i >> 2) & 3;
        this.e = str;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.h = i6;
        this.f = this.j;
        this.g = this.k;
    }

    public void a(int i, int i2) {
        this.b.a(this.e, 0, this.f + i, this.g + i2, this.c, this.d, this.f + i, this.f + i);
    }

    public boolean a() {
        if (this.h == 0) {
            return false;
        }
        if (this.i == 0) {
            this.i = this.a.w;
        }
        int i = this.a.w - this.i;
        if (i > this.h) {
            i = this.h;
        }
        this.f = ((this.j * (this.h - i)) + (this.l * i)) / this.h;
        this.g = ((this.k * (this.h - i)) + (this.m * i)) / this.h;
        if (i >= this.h) {
            this.h = 0;
        }
        return true;
    }
}
