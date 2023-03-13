package zhook.aohoc.bridge.platform.andr;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* loaded from: classes.dex */
public class AndrGameLoop extends zhook.aohoc.bridge.c {
    private Bitmap m;
    private Canvas n;
    private Canvas o;
    private String p = null;

    @Override // zhook.aohoc.bridge.c
    public void a(String str) {
        this.p = str;
    }

    @Override // zhook.aohoc.bridge.c
    public void a(zhook.aohoc.a.k kVar) {
    }

    @Override // zhook.aohoc.bridge.c
    public String b(int i) {
        try {
            return "[" + i + "]";
        } catch (Throwable th) {
            return "";
        }
    }

    @Override // zhook.aohoc.bridge.c
    public int c(int i) {
        return 0;
    }

    @Override // zhook.aohoc.bridge.c
    public void g() {
        if (!this.b) {
            d();
        } else if (a.a == null || !a.a.a()) {
        } else {
            a.a.b();
        }
    }

    @Override // zhook.aohoc.bridge.c
    public zhook.aohoc.bridge.e h() {
        if (a.a == null) {
            return null;
        }
        if (this.n == null) {
            this.m = Bitmap.createBitmap(zhook.aohoc.bridge.a.a().c(), zhook.aohoc.bridge.a.a().d(), Bitmap.Config.ARGB_8888);
            this.n = new Canvas(this.m);
            System.out.println("AOHGameLoop.getGameLoopGraphics() : initialized offScreenCanvas w=" + this.m.getWidth() + " h=" + this.m.getHeight());
        }
        if (!this.b || this.c) {
            if (this.o != this.n) {
                this.o = this.n;
                this.a = new c(this.o, this.m);
                System.out.println("AOHGameLoop.getGameLoopGraphics() : initialized graphics (offScreen) w=" + this.m.getWidth() + " h=" + this.m.getHeight());
            }
        } else if (a.a.b != null && this.o != a.a.b) {
            this.o = a.a.b;
            this.a = new c(this.o);
            System.out.println("AOHGameLoop.getGameLoopGraphics() : initialized graphics (frontScreen) w=" + this.m.getWidth() + " h=" + this.m.getHeight());
        }
        return this.a;
    }

    @Override // zhook.aohoc.bridge.c
    public int i() {
        if (a.a == null) {
            return 0;
        }
        int c = zhook.aohoc.bridge.a.a().c();
        return AOHOActivity.a.a() == 2 ? c - a.a.d.a() : c;
    }

    @Override // zhook.aohoc.bridge.c
    public int j() {
        if (a.a == null) {
            return 0;
        }
        int d = zhook.aohoc.bridge.a.a().d();
        return AOHOActivity.a.a() != 2 ? d - a.a.d.b() : d;
    }

    @Override // zhook.aohoc.bridge.c
    public void k() {
        if (a.a != null) {
            a.a.c();
        }
    }

    @Override // zhook.aohoc.bridge.c
    public String l() {
        return this.p;
    }
}
