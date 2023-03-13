package zhook.aohoc.a.c;

/* loaded from: classes.dex */
public class g {
    public int[] a;
    public int[] b;
    b c;
    private a d;
    private c e;

    public g(a aVar) {
        this.d = aVar;
        this.e = this.d.j;
    }

    public static zhook.aohoc.bridge.f a(String str) {
        try {
            return zhook.aohoc.bridge.a.d.a(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void a(zhook.aohoc.bridge.f fVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (fVar == null) {
            return;
        }
        if (zhook.aohoc.a.b.d.c) {
            zhook.aohoc.bridge.e eVar = this.d.g;
            a aVar = this.d;
            eVar.a(fVar, i, i2, i3, i4, 0, i5, i6, 20);
        } else if (this.e.c(i5, i6, i3, i4)) {
            a aVar2 = this.d;
            this.d.g.a(fVar, i5 - i, i6 - i2, 20);
        }
    }

    public void a(zhook.aohoc.bridge.f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (fVar == null) {
            return;
        }
        if (!(this.d.g == this.c.b && !(this.c.e == 0 && this.c.f == 0))) {
            if (this.e.c(i5, i6, i3, i4)) {
                if (!zhook.aohoc.a.b.d.c) {
                    a aVar = this.d;
                    this.d.g.a(fVar, i5 - i, i6 - i2, 20);
                    return;
                }
                zhook.aohoc.bridge.e eVar = this.d.g;
                a aVar2 = this.d;
                eVar.a(fVar, i, i2, i3, i4, i7, i5, i6, 20);
            }
        } else if (this.e.b(i5, i6, i3, i4)) {
            this.e.a();
            int a = this.c.a.a();
            int b = this.c.a.b();
            int i10 = this.c.e;
            int i11 = this.c.f;
            int i12 = a - i10;
            int i13 = b - i11;
            boolean z = i12 > i5 && i12 < i5 + i3;
            boolean z2 = i13 > i6 && i13 < i6 + i4;
            int i14 = i5 + i10;
            int i15 = i6 + i11;
            if (z || z2) {
                if (this.e.a(i10, i11)) {
                    zhook.aohoc.bridge.e eVar2 = this.d.g;
                    a aVar3 = this.d;
                    eVar2.a(fVar, i, i2, i3, i4, i7, i14, i15, 20);
                }
                this.e.b();
                if (this.e.a(i10 - a, i11)) {
                    a aVar4 = this.d;
                    this.d.g.a(fVar, i, i2, i3, i4, i7, i14 - a, i15, 20);
                }
                this.e.b();
                if (this.e.a(i10, i11 - b)) {
                    a aVar5 = this.d;
                    this.d.g.a(fVar, i, i2, i3, i4, i7, i14, i15 - b, 20);
                }
                this.e.b();
                if (this.e.a(i10 - a, i11 - b)) {
                    a aVar6 = this.d;
                    this.d.g.a(fVar, i, i2, i3, i4, i7, i14 - a, i15 - b, 20);
                }
            } else {
                if (i14 >= a) {
                    i14 -= a;
                    i8 = i10 - a;
                } else {
                    i8 = i10;
                }
                if (i15 >= b) {
                    i15 -= b;
                    i9 = i11 - b;
                } else {
                    i9 = i11;
                }
                this.e.a(i8, i9);
                if (zhook.aohoc.a.b.d.c) {
                    zhook.aohoc.bridge.e eVar3 = this.d.g;
                    a aVar7 = this.d;
                    eVar3.a(fVar, i, i2, i3, i4, i7, i14, i15, 20);
                } else {
                    a aVar8 = this.d;
                    this.d.g.a(fVar, i14 - i, i15 - i2, 20);
                }
            }
            this.e.b();
        }
    }
}
