package zhook.aohoc.bridge.platform.andr;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public class l implements zhook.aohoc.bridge.a.a, zhook.aohoc.bridge.a.d, zhook.aohoc.bridge.a.e, zhook.aohoc.bridge.a.g {
    protected URLConnection a;

    public l(String str) {
        this(new URL(str));
    }

    public l(URL url) {
        this(url.openConnection());
    }

    public l(URLConnection uRLConnection) {
        this.a = uRLConnection;
    }

    @Override // zhook.aohoc.bridge.a.a
    public void a() {
        this.a = null;
    }

    @Override // zhook.aohoc.bridge.a.d
    public DataInputStream b() {
        return new DataInputStream(c());
    }

    @Override // zhook.aohoc.bridge.a.d
    public InputStream c() {
        return this.a.getInputStream();
    }

    @Override // zhook.aohoc.bridge.a.e
    public OutputStream d() {
        return this.a.getOutputStream();
    }
}
