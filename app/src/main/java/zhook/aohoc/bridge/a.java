package zhook.aohoc.bridge;

/* loaded from: classes.dex */
public abstract class a {
    protected static a a;
    public static zhook.aohoc.bridge.platform.a b;
    public static zhook.aohoc.bridge.platform.b c;
    public static g d;
    public static i e;
    public static zhook.aohoc.bridge.a.b f;
    protected c[] g = new c[2];
    protected int h = 0;
    protected int i = 1;
    private final Object l = new Object();
    protected int j = 0;
    protected int k = 0;

    public static a a() {
        return a;
    }

    public static void a(int i) {
        b = new zhook.aohoc.bridge.platform.a(i);
        a = (a) b.a(zhook.aohoc.bridge.platform.a.c);
        c = (zhook.aohoc.bridge.platform.b) b.a(zhook.aohoc.bridge.platform.a.b);
        d = (g) b.a(zhook.aohoc.bridge.platform.a.e);
        e = (i) b.a(zhook.aohoc.bridge.platform.a.f);
        f = (zhook.aohoc.bridge.a.b) b.a(zhook.aohoc.bridge.platform.a.d);
    }

    private void c(int i) {
        if (i < 0 || i + 1 > 2) {
            throw new IllegalArgumentException("AOHAppManager.initLoop : INVALID INDEX=" + i);
        }
        if (this.g[i] != null) {
            return;
        }
        this.g[i] = (c) b.a(zhook.aohoc.bridge.platform.a.g);
        this.g[i].g = i;
    }

    private void d(int i) {
        int i2 = 0;
        synchronized (this.l) {
            if (i < 0 || i + 1 > 2) {
                return;
            }
            if (this.g[i] == null) {
                c(i);
            }
            c cVar = this.g[i];
            for (int i3 = 0; i3 < this.g.length; i3++) {
                if (i3 != i && this.g[i3] != null) {
                    this.g[i3].n().c();
                    this.g[i3].a(false);
                    this.g[i3].b(true);
                }
            }
            cVar.b(false);
            cVar.a(true);
            cVar.f();
            System.out.println("   ##### AOHAppManager.display() : Now loop with index=" + i + " is  displayed");
            this.h = i;
            if (cVar.r()) {
                while (cVar.i && i2 <= 200) {
                    try {
                        Thread.sleep(50L);
                        i2 += 50;
                    } catch (InterruptedException e2) {
                    }
                }
                cVar.n().b();
            } else {
                cVar.a();
                if (!cVar.p()) {
                    cVar.e();
                }
            }
        }
    }

    private void j() {
        if (this.h == -1) {
            throw new IllegalStateException("displayedLoopIndex == -1");
        }
        if (this.h < 0 || this.h + 1 > 2) {
            throw new IllegalStateException("invalid displayedLoopIndex=" + this.h);
        }
        if (this.g[this.h] == null) {
            throw new IllegalStateException("displayedLoop == null");
        }
    }

    public void a(boolean z) {
        System.out.println("   ######### AOHAppManager.onDestroyApp() : BEGIN");
        for (int i = 0; i < this.g.length; i++) {
            c cVar = this.g[i];
            if (cVar != null) {
                System.out.println("       ======> AOHAppManager.onDestroyApp() : destroy loop with index=" + i);
                if (cVar.u().b()) {
                    cVar.u().a();
                }
                if (cVar.v().b()) {
                    cVar.v().a();
                }
                if (cVar.p()) {
                    cVar.o();
                }
                if (cVar.r()) {
                    cVar.n().b(false);
                }
                this.g[i] = null;
            }
        }
        System.out.println("       ======> AOHAppManager.onDestroyApp() : set '_instance' to null");
        a = null;
        System.gc();
        System.out.println("   ######### AOHAppManager.onDestroyApp() : END");
    }

    public abstract void b();

    public void b(int i) {
        if (i == this.i) {
            return;
        }
        if (i == 0 || i == 1) {
            this.i = i;
            for (int i2 = 0; i2 < this.g.length; i2++) {
                c cVar = this.g[i2];
                if (cVar != null) {
                    cVar.c();
                    if (i2 != this.h) {
                        try {
                            if (cVar.u().b()) {
                                cVar.u().a();
                            }
                            if (cVar.v().b()) {
                                cVar.v().a();
                            }
                            if (cVar.p()) {
                                cVar.o();
                            }
                            if (cVar.r()) {
                                cVar.c(false);
                            }
                            if (cVar.f != null) {
                                cVar.f.b(false);
                                cVar.f.Q = null;
                                cVar.f.b = null;
                            }
                            cVar.f = null;
                            this.g[i2] = null;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        } finally {
                            System.gc();
                        }
                    }
                }
            }
        }
    }

    public abstract int c();

    public abstract int d();

    public void e() {
        System.out.println("   ######### AOHAppManager.onStartApp() : BEGIN");
        d(0);
        System.out.println("   ######### AOHAppManager.onStartApp() : END");
    }

    public void f() {
        System.out.println("   ######### AOHAppManager.onPauseApp() : BEGIN");
        i().n().c();
        System.out.println("   ######### AOHAppManager.onPauseApp() : END");
    }

    public void g() {
        System.out.println("   ######### AOHAppManager.onResumeApp() : BEGIN");
        i().n().b();
        System.out.println("   ######### AOHAppManager.onResumeApp() : END");
    }

    public void h() {
        System.out.println("   ######### AOHAppManager.switchDisplayedGameLoop() : BEGIN");
        int i = this.h + 1;
        d((i < 0 || i >= 2) ? 0 : 0);
        System.out.println("   ######### AOHAppManager.switchDisplayedGameLoop() : END");
    }

    public c i() {
        c cVar;
        synchronized (this.l) {
            j();
            cVar = this.g[this.h];
        }
        return cVar;
    }
}
