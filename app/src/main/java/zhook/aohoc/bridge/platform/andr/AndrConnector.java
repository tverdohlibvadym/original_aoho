package zhook.aohoc.bridge.platform.andr;

/* loaded from: classes.dex */
public class AndrConnector extends zhook.aohoc.bridge.a.b {
    @Override // zhook.aohoc.bridge.a.b
    public zhook.aohoc.bridge.a.a a(String str, int i) {
        return str.startsWith("http:") ? new d(str) : str.startsWith("socket:") ? new k(str) : new l(str);
    }

    @Override // zhook.aohoc.bridge.a.b
    public zhook.aohoc.bridge.a.a a(String str, int i, boolean z) {
        return a(str, i);
    }
}
