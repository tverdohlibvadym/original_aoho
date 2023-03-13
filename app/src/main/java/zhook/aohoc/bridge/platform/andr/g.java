package zhook.aohoc.bridge.platform.andr;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g implements DialogInterface.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ AndrInputProcessor b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(AndrInputProcessor andrInputProcessor, EditText editText) {
        this.b = andrInputProcessor;
        this.a = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        zhook.aohoc.a.a.a aVar;
        zhook.aohoc.a.a.a aVar2;
        aVar = this.b.a;
        aVar.Q.a(this.a.getText().toString());
        try {
            aVar2 = this.b.a;
            aVar2.Q.a(0);
            this.b.c();
        } catch (Throwable th) {
        }
        this.b.o = false;
    }
}
