package zhook.aohoc.a.c;

import java.io.DataInputStream;
import zhook.aohoc.a.ag;
import zhook.aohoc.a.ai;
import zhook.aohoc.a.p;
import zhook.aohoc.a.y;

/* loaded from: classes.dex */
public class d {
    public static final int[] a = {31, 1, 0};
    public static final int[] b = {16777215, 0, 11153456, 3189296, 3158186, 16776960, 11141290, 8218696, 8421504};
    public static byte[] d = {-16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -2, -32, -32, -32, -31, -30, -29, -28, -27, -24, -23, -22, -21, -20, -19, -18, -32, -32, -32, -32, -32, -32, -1};
    public static final int[] f = {250, 333, 500, 1000};
    zhook.aohoc.a.a.a c;
    boolean e = false;
    private int g;
    private int h;
    private int i;
    private int j;
    private short[] k;
    private short[] l;
    private byte[] m;
    private int n;
    private int o;
    private int p;
    private int q;
    private byte[] r;
    private zhook.aohoc.bridge.f s;
    private int t;
    private a u;
    private g v;

    public d(zhook.aohoc.a.a.a aVar, int i, int i2, int i3) {
        this.c = aVar;
        this.u = this.c.T;
        this.v = this.u.k;
        this.g = i2;
        this.h = i3;
        this.i = i;
        if (this.i < 0 || this.i >= 7) {
        }
    }

    public byte a(char c) {
        if (c < 0 || c > ' ') {
            int i = c >>> 7;
            int i2 = (this.r[0] << 8) + this.r[1];
            if (i <= i2) {
                int i3 = c & 127;
                byte b2 = this.r[i + 2];
                if (b2 == -1) {
                    return (byte) -3;
                }
                return this.r[i2 + 3 + (b2 << 7) + i3];
            }
            return (byte) -1;
        }
        return d[c];
    }

    public int a() {
        return this.n;
    }

    public int a(int i) {
        int i2 = i & 255;
        if (i2 == 255) {
            return this.n;
        }
        if (i2 < 224) {
            try {
                return this.m[i2];
            } catch (Throwable th) {
                y.b("invalid char: font_id=" + this.g + " a_iChar=" + i2);
                th.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public int a(int i, int i2, int i3) {
        int i4 = i & 255;
        if (i4 == 255) {
            return this.n;
        }
        if (i4 >= 224) {
            return 0;
        }
        try {
            byte b2 = this.m[i4];
            this.v.a(this.s, this.k[i4], this.l[i4], b2, this.q, i2, i3, 0);
            return b2;
        } catch (Throwable th) {
            y.b("invalid char: font_id=" + this.g + " a_iChar=" + i4);
            th.printStackTrace();
            return 0;
        }
    }

    public int a(String str, int i) {
        int a2;
        d dVar;
        int c = i + c();
        int i2 = 0;
        d dVar2 = this;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            int a3 = dVar2.a(dVar2.a(charAt));
            if (a3 == 0 && (a2 = dVar2.a(charAt) & 255) >= 232 && a2 <= 238) {
                try {
                    dVar = this.c.g(a2 - 232);
                } catch (Throwable th) {
                    th.printStackTrace();
                    dVar = null;
                }
                if (dVar != null) {
                    dVar2 = dVar;
                }
            }
            i2 += (a3 == 0 ? 0 : c) + a3;
        }
        return i2 > 0 ? i2 - c : i2;
    }

    public p a(String str, int i, int i2, int i3) {
        char c;
        int i4;
        int i5;
        int i6;
        d dVar;
        int i7;
        boolean z;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        d dVar2;
        int i10;
        int i11;
        char c2;
        int i12;
        p pVar = new p();
        if (str != null && str.length() > 0) {
            int c3 = i + c();
            int a2 = a();
            int i13 = 0;
            int i14 = 0;
            if (str.charAt(0) == 11) {
                char charAt = str.charAt(1);
                c = charAt;
                i4 = charAt + 2;
            } else {
                c = 1;
                i4 = 0;
            }
            int length = str.length();
            boolean z4 = false;
            boolean z5 = false;
            int i15 = 0;
            int i16 = 0;
            int i17 = -1;
            int i18 = 0;
            int i19 = 0;
            int i20 = -1;
            d dVar3 = this;
            d dVar4 = this;
            int i21 = 255;
            int i22 = i4;
            int i23 = 0;
            int i24 = i4;
            while (i22 < length && i23 <= i3) {
                if (z4) {
                    if (i14 == 0) {
                        i6 = i22;
                        i12 = i13;
                    } else {
                        int i25 = i4;
                        i12 = i14;
                        i6 = i25;
                    }
                    int i26 = i13 - i12;
                    i7 = i23 + 1;
                    pVar.a(str.substring(i24, i6), i23, dVar3.f(), i18, i19, i20);
                    i20 = i17;
                    i19 = i16;
                    i18 = i15;
                    z = false;
                    i9 = i6;
                    i5 = 0;
                    dVar = dVar4;
                    i8 = i26;
                } else {
                    d dVar5 = dVar3;
                    i5 = i14;
                    i6 = i4;
                    dVar = dVar5;
                    int i27 = i24;
                    i7 = i23;
                    z = z4;
                    i8 = i13;
                    i9 = i27;
                }
                int i28 = i22 + 1;
                char charAt2 = str.charAt(i22);
                int a3 = dVar4.a(charAt2) & 255;
                if (a3 >= 224) {
                    switch (a3) {
                        case 254:
                            if (z5) {
                                z2 = z;
                                z3 = false;
                                break;
                            } else {
                                z2 = true;
                                i6 = i28;
                                i5 = i8;
                                z3 = z5;
                                continue;
                            }
                        case 255:
                            if (i21 < 224) {
                                i6 = i28;
                                i5 = i8;
                            }
                            i8 += a2;
                            z2 = z;
                            z3 = false;
                            continue;
                        default:
                            if (a3 >= 240 && a3 <= 249) {
                                i15 = a3 - 240;
                                z2 = z;
                                z3 = z5;
                                continue;
                            } else if (a3 >= 232 && a3 <= 238) {
                                int i29 = a3 - 232;
                                if (i29 < 0 || i29 < 7) {
                                }
                                try {
                                    dVar2 = this.c.g(i29);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    dVar2 = null;
                                }
                                if (dVar2 != null) {
                                    dVar4 = dVar2;
                                }
                                z2 = z;
                                z3 = z5;
                                break;
                            } else if (a3 == 225) {
                                i16 = 0;
                                z2 = z;
                                z3 = z5;
                                break;
                            } else if (a3 == 226) {
                                if (i16 + 1 < f.length) {
                                    i16++;
                                    z2 = z;
                                    z3 = z5;
                                    break;
                                }
                                z2 = z;
                                z3 = z5;
                                break;
                            } else if (a3 == 227) {
                                i17 = 0;
                                z2 = z;
                                z3 = z5;
                                break;
                            } else if (a3 == 228) {
                                i17 = 1;
                                z2 = z;
                                z3 = z5;
                                break;
                            } else {
                                if (a3 == 229) {
                                    i17 = 2;
                                    z2 = z;
                                    z3 = z5;
                                    break;
                                }
                                z2 = z;
                                z3 = z5;
                            }
                            break;
                    }
                } else {
                    int a4 = dVar4.a(a3);
                    if (i8 + a4 <= i2 || c != 1) {
                        z2 = z;
                        z3 = false;
                        i10 = i8 + a4 + c3;
                        i11 = i28;
                    } else {
                        z2 = true;
                        z3 = true;
                        if (i28 > 0) {
                            int i30 = i28 - 1;
                            i28 = i30;
                            c2 = str.charAt(i30 - 1);
                        } else {
                            c2 = charAt2;
                        }
                        while (i28 > 0 && c2 < ' ') {
                            int i31 = i28 - 1;
                            i28 = i31;
                            c2 = str.charAt(i31 - 1);
                        }
                        int i32 = i28;
                        i10 = i8;
                        i11 = i32;
                    }
                    int i33 = i11;
                    i8 = i10;
                    i28 = i33;
                }
                z5 = z3;
                i21 = a3;
                i23 = i7;
                i24 = i9;
                i13 = i8;
                z4 = z2;
                i22 = i28;
                int i34 = i5;
                dVar3 = dVar;
                i4 = i6;
                i14 = i34;
            }
            if (i23 <= i3 && i24 < length) {
                int i35 = i23 + 1;
                pVar.a(str.substring(i24, length), i23, dVar3.f(), i18, i19, i20);
            }
        }
        pVar.a();
        return pVar;
    }

    public void a(DataInputStream dataInputStream) {
        this.j = dataInputStream.readUnsignedByte();
        this.k = ag.b(dataInputStream, this.j);
        this.l = ag.b(dataInputStream, this.j);
        this.m = ag.a(dataInputStream, this.j);
        this.q = dataInputStream.readByte();
        this.n = dataInputStream.readByte();
        this.o = dataInputStream.readByte();
        this.p = 2;
        this.r = ag.a(dataInputStream);
        this.s = ai.a(dataInputStream);
        this.n -= this.o;
        this.t = Math.max(0, this.o);
    }

    public void a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        a(str, i, i2, i3, i4, i5, i2, i2, p.a(0, f(), 0, 0, -1), true);
    }

    public void a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9;
        d dVar;
        int i10;
        int i11;
        boolean z2;
        int i12;
        Throwable th;
        int i13;
        boolean z3;
        int i14;
        int i15;
        d dVar2;
        int i16;
        d dVar3;
        int i17;
        int i18;
        if (str == null || str.length() == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i19 = (983040 & i8) >>> 16;
        int i20 = (15728640 & i8) >>> 20;
        int i21 = (50331648 & i8) >>> 24;
        int i22 = (201326592 & i8) >>> 26;
        try {
            int a2 = a(str, i);
            char charAt = str.charAt(0);
            if (charAt == 16 || i22 == 0) {
                i4 = 0;
                i2 = i6;
            } else if (charAt == 17 || i22 == 1) {
                i2 = (i6 + i7) / 2;
                i4 = 1;
            } else if (charAt == 18 || i22 == 2) {
                i4 = 2;
                i2 = i7;
            }
            int i23 = i2 - (a2 >>> a[i4]);
            int b2 = i3 - (b() >>> a[i5]);
            int c = c() + i;
            int i24 = -1234567;
            boolean z4 = i20 != 0;
            int i25 = i20 == 0 ? 0 : b[i20 - 1];
            int i26 = str.charAt(0) == 11 ? 5 : 0;
            d g = this.c.g(i19);
            if (g == null) {
                g = this;
            }
            int i27 = i21 > 0 ? f[i21] : 1;
            int max = Math.max(0, c());
            int length = str.length();
            int i28 = i26;
            while (i28 < length) {
                try {
                    char charAt2 = str.charAt(i28);
                    if (charAt2 == '\n' || charAt2 == ' ') {
                    }
                    int a3 = g.a(charAt2) & 255;
                    if (a3 == 240) {
                        z4 = false;
                        int i29 = i27;
                        i16 = i21;
                        dVar3 = g;
                        i17 = i29;
                    } else if (a3 >= 241 && a3 <= 249) {
                        z4 = true;
                        i25 = b[(a3 - 240) - 1];
                        int i30 = i27;
                        i16 = i21;
                        dVar3 = g;
                        i17 = i30;
                    } else if (a3 >= 232 && a3 <= 238) {
                        d g2 = this.c.g(a3 - 232);
                        if (g2 == null) {
                            g2 = g;
                        }
                        i17 = i27;
                        i16 = i21;
                        dVar3 = g2;
                    } else if (a3 == 225) {
                        int i31 = i27;
                        i16 = 0;
                        dVar3 = g;
                        i17 = i31;
                    } else if (a3 == 226 && z) {
                        int i32 = i21 + 1;
                        int i33 = f[i32 - 1];
                        i16 = i32;
                        dVar3 = g;
                        i17 = i33;
                    } else {
                        int i34 = i27;
                        i16 = i21;
                        dVar3 = g;
                        i17 = i34;
                    }
                    try {
                        int a4 = dVar3.a(a3);
                        if (a4 > 0) {
                            if (i16 == 0 || currentTimeMillis % (i17 * 2) <= i17) {
                                if (z4) {
                                    this.u.g.a(i25);
                                    this.u.a(i23, b2 - 1, (i28 < length + (-1) ? max : 0) + a4, dVar3.b() + 2);
                                }
                                dVar3.a(a3, i23, b2);
                            }
                            i18 = c + a4 + i23;
                        } else {
                            i18 = i23;
                        }
                        dVar2 = dVar3;
                        z3 = z4;
                        i15 = i18;
                        i9 = i17;
                        i10 = i16;
                        i13 = i25;
                        i14 = a3;
                    } catch (Throwable th2) {
                        i9 = i17;
                        i10 = i16;
                        dVar = dVar3;
                        i11 = i25;
                        z2 = z4;
                        i12 = a3;
                        th = th2;
                        y.a(" byte=" + i12);
                        th.printStackTrace();
                        d dVar4 = dVar;
                        i13 = i11;
                        z3 = z2;
                        i14 = i12;
                        i15 = i23;
                        dVar2 = dVar4;
                        i28++;
                        i24 = i14;
                        i25 = i13;
                        i27 = i9;
                        int i35 = i10;
                        g = dVar2;
                        i23 = i15;
                        z4 = z3;
                        i21 = i35;
                    }
                } catch (Throwable th3) {
                    i9 = i27;
                    dVar = g;
                    i10 = i21;
                    i11 = i25;
                    z2 = z4;
                    i12 = i24;
                    th = th3;
                }
                i28++;
                i24 = i14;
                i25 = i13;
                i27 = i9;
                int i352 = i10;
                g = dVar2;
                i23 = i15;
                z4 = z3;
                i21 = i352;
            }
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        this.e = false;
    }

    public void a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        a(str, i, i2, i3, i4, i5, i2, i2, p.a(0, f(), 0, 0, -1), z);
    }

    public int b() {
        return this.q;
    }

    public int c() {
        return this.o;
    }

    public int d() {
        return this.p;
    }

    public int e() {
        return b() + d();
    }

    public int f() {
        return this.i;
    }
}
