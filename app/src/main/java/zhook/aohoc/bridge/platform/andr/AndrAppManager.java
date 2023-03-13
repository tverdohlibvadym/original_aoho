package zhook.aohoc.bridge.platform.andr;

/* loaded from: classes.dex */
public class AndrAppManager extends zhook.aohoc.bridge.a {
    @Override // zhook.aohoc.bridge.a
    public void b() {
    }

    @Override // zhook.aohoc.bridge.a
    public int c() {
        if (a.a == null || a.a.getWidth() <= 0) {
            return 0;
        }
        if (this.j <= 0) {
            this.j = a.a.getWidth();
        }
        return AOHOActivity.a.a() == 2 ? this.k : this.j;
    }

    @Override // zhook.aohoc.bridge.a
    public int d() {
        if (a.a == null || a.a.getHeight() <= 0) {
            return 0;
        }
        if (this.k <= 0) {
            this.k = a.a.getHeight();
        }
        return AOHOActivity.a.a() == 2 ? this.j : this.k;
    }
}
