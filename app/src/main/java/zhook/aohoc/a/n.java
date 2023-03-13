package zhook.aohoc.a;

import java.io.DataInputStream;

/* loaded from: classes.dex */
public class n {
    public int a;
    public int b;
    public j c;
    public short[] d;
    public byte[][] e;
    public short[][] f;
    public int[][] g;
    public String[][] h;
    public zhook.aohoc.a.a.a i;

    public n(zhook.aohoc.a.a.a aVar, int i, int i2, DataInputStream dataInputStream) {
        this.i = aVar;
        this.a = i;
        this.b = i2;
        if (i == 319) {
        }
        this.c = new j(this, dataInputStream, aVar);
        byte readByte = dataInputStream.readByte();
        if ((readByte & 1) != 0) {
            this.d = ag.c(dataInputStream);
        }
        if ((readByte & 2) != 0) {
            this.e = new byte[dataInputStream.readByte()];
            for (int i3 = 0; i3 < this.e.length; i3++) {
                this.e[i3] = ag.a(dataInputStream);
            }
        }
        if ((readByte & 4) != 0) {
            this.f = new short[dataInputStream.readByte()];
            for (int i4 = 0; i4 < this.f.length; i4++) {
                this.f[i4] = ag.c(dataInputStream);
            }
        }
        if ((readByte & 8) != 0) {
            this.g = new int[dataInputStream.readByte()];
            for (int i5 = 0; i5 < this.g.length; i5++) {
                this.g[i5] = ag.d(dataInputStream);
            }
        }
        if ((readByte & 16) != 0) {
            this.h = new String[dataInputStream.readByte()];
            for (int i6 = 0; i6 < this.h.length; i6++) {
                this.h[i6] = ag.f(dataInputStream);
            }
        }
    }
}
