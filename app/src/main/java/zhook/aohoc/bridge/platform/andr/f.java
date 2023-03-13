package zhook.aohoc.bridge.platform.andr;

/* loaded from: classes.dex */
class f implements Runnable {
    final /* synthetic */ AndrInputProcessor a;
    final /* synthetic */ AndrInputProcessor b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(AndrInputProcessor andrInputProcessor, AndrInputProcessor andrInputProcessor2) {
        this.b = andrInputProcessor;
        this.a = andrInputProcessor2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.n = new j(this.a);
    }
}
