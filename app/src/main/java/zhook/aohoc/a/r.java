package zhook.aohoc.a;

/* loaded from: classes.dex */
public class r {
    zhook.aohoc.a.a.a a;
    public boolean b;
    public int c;
    public int d;
    public int e;

    public r(zhook.aohoc.a.a.a aVar, int i, int i2, boolean z, int i3) {
        this.a = aVar;
        this.e = i3;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public void a() {
        try {
            this.a.g.a(this.e, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean a(int i) {
        if (this.b) {
            if (this.c != 0 && (this.c & i) != this.c) {
                return false;
            }
            if (this.d != 0 && (this.d & i) != 0) {
                return false;
            }
        } else if (this.d != 0 && (this.d & i) != 0) {
            return false;
        } else {
            if (this.c != 0 && (this.c & i) == 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return super.toString() + " script_id=" + this.e + " act:" + ag.a(this.c);
    }
}
