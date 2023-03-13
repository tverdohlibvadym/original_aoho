package zhook.aohoc.bridge.platform.andr;

import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h implements DialogInterface.OnClickListener {
    final /* synthetic */ AndrInputProcessor a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(AndrInputProcessor andrInputProcessor) {
        this.a = andrInputProcessor;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        zhook.aohoc.a.a.a aVar;
        zhook.aohoc.a.a.a aVar2;
        aVar = this.a.a;
        aVar.Q.a("");
        try {
            aVar2 = this.a.a;
            aVar2.Q.a(1);
            this.a.c();
        } catch (Throwable th) {
        }
        this.a.o = false;
    }
}
