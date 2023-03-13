package zhook.aohoc.a;

import java.util.Timer;

/* loaded from: classes.dex */
public class g {
    zhook.aohoc.bridge.c a;
    private String b = "UNDEFINED_TASK";
    private long c = Long.MAX_VALUE;
    private long d = Long.MAX_VALUE;
    private long e = Long.MAX_VALUE;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private Timer i = new Timer();

    public void a() {
        this.h = false;
        this.i.cancel();
    }

    public void a(zhook.aohoc.bridge.c cVar) {
        this.a = cVar;
    }

    public boolean b() {
        return this.h;
    }
}
