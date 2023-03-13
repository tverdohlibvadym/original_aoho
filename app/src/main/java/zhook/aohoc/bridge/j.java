package zhook.aohoc.bridge;

/* loaded from: classes.dex */
public abstract class j {
    protected zhook.aohoc.a.a.a f;
    public final String a = "rci";
    protected final Object b = new Object();
    public final String c = "_rsid";
    protected final String d = "/TMP/";
    protected final String e = "/TMP//";
    protected String g = "ssid";

    public abstract int a(String str, byte[] bArr, int i);

    public abstract String a();

    public String a(String str) {
        return this.g + str;
    }

    public void a(zhook.aohoc.a.a.a aVar) {
        this.f = aVar;
        if (this.f == null || this.f.Q == null || this.f.Q.g == -1) {
            this.g += "0_";
        } else {
            this.g += this.f.Q.g + "_";
        }
    }

    public abstract byte[][] a(String str, int i);

    public abstract boolean b(String str);

    public abstract void c(String str);

    public abstract void d(String str);
}
