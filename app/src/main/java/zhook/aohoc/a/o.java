package zhook.aohoc.a;

import java.io.DataInputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class o implements Runnable {
    public String a;
    public String b;
    public zhook.aohoc.a.a.c c;
    public int d;
    public int e;

    public o(String str, String str2, zhook.aohoc.a.a.c cVar, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.d = i;
        this.e = i2;
        this.c = cVar;
        new Thread(this).start();
    }

    @Override // java.lang.Runnable
    public void run() {
        OutputStream outputStream;
        zhook.aohoc.bridge.a.c cVar;
        DataInputStream dataInputStream = null;
        try {
            try {
                zhook.aohoc.bridge.a.c cVar2 = (zhook.aohoc.bridge.a.c) zhook.aohoc.bridge.a.f.a(this.a);
                try {
                    cVar2.a("POST");
                    cVar2.a("Content-Type", "application/x-www-form-urlencoded");
                    OutputStream d = cVar2.d();
                    try {
                        d.write(this.b.getBytes());
                        StringBuffer stringBuffer = new StringBuffer();
                        dataInputStream = cVar2.b();
                        while (true) {
                            int read = dataInputStream.read();
                            if (read == -1) {
                                break;
                            }
                            stringBuffer.append((char) read);
                        }
                        String stringBuffer2 = stringBuffer.toString();
                        System.out.println("received: " + stringBuffer2);
                        if (this.c.b == this && stringBuffer2.length() > 0) {
                            this.c.a(e.a(stringBuffer2));
                            this.c.a.a(this.d);
                            this.c.a(this.c.e, true);
                        }
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        if (d != null) {
                            d.close();
                        }
                        if (cVar2 != null) {
                            cVar2.a();
                        }
                    } catch (Throwable th) {
                        outputStream = d;
                        cVar = cVar2;
                        th = th;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (cVar != null) {
                            cVar.a();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    cVar = cVar2;
                    th = th2;
                    outputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                cVar = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.c.a.a(this.e);
        }
    }
}
