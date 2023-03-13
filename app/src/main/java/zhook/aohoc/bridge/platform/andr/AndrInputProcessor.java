package zhook.aohoc.bridge.platform.andr;

import android.app.AlertDialog;
import android.os.Message;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import zhook.aohoc.a.y;

/* loaded from: classes.dex */
public class AndrInputProcessor extends zhook.aohoc.bridge.h {
    j n;
    boolean o = false;
    String p = null;
    String q = null;
    String r = null;
    String s = null;
    int t = 100;
    String u = null;
    int v = 0;
    String w = null;
    int x = 0;
    int y = -1;

    public AndrInputProcessor() {
        AOHOActivity.a.runOnUiThread(new f(this, this));
    }

    public void a(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, int i3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(AOHOActivity.a);
        builder.setIcon(R.drawable.icon);
        builder.setCancelable(false);
        View inflate = ((LayoutInflater) AOHOActivity.a.getSystemService("layout_inflater")).inflate(R.layout.input, (ViewGroup) AOHOActivity.a.findViewById(R.id.layout_root));
        ((TextView) inflate.findViewById(R.id.textCaption)).setText(str2);
        EditText editText = (EditText) inflate.findViewById(R.id.inputText);
        if (str3 != null) {
            editText.setText(str3);
        }
        if (i != 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
        builder.setView(inflate);
        if (str5 != null) {
            builder.setPositiveButton(str5, new g(this, editText));
        }
        if (str6 != null) {
            builder.setNegativeButton(str6, new h(this));
        } else {
            builder.setNegativeButton("Cancel", new i(this));
        }
        builder.show();
    }

    @Override // zhook.aohoc.bridge.h
    public void a(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4) {
        this.a.Q.d = i;
        this.a.Q.e = i2;
        b(str, str2, str3, str4, str5, i, str6, i2, i3, i4);
    }

    public boolean a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        if (i == 21) {
            this.a.e(32768);
        } else if (i == 22) {
            this.a.e(65536);
        } else if (i == 19) {
            this.a.e(131072);
        } else if (i == 20) {
            this.a.e(262144);
        } else if (i == 23) {
            this.a.e(16384);
        } else {
            a(i);
        }
        return false;
    }

    public boolean a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.b = (int) motionEvent.getX();
                this.c = (int) motionEvent.getY();
                this.d = 0L;
                break;
            case 1:
                this.f = true;
                break;
            case 2:
                b((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return true;
    }

    @Override // zhook.aohoc.bridge.h
    public void b() {
        String l = this.a.Q.l();
        this.a.h.g.a(l);
        this.a.g.a(this.a.g.d, l);
    }

    public void b(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4) {
        if (this.o) {
            return;
        }
        this.o = true;
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.s = str4;
        this.u = str5;
        this.v = i;
        this.w = str6;
        this.x = i2;
        this.t = i3;
        this.n.sendMessage(new Message());
    }

    public boolean b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        if (i == 21) {
            this.a.f(-32769);
        } else if (i == 22) {
            this.a.f(-65537);
        } else if (i == 19) {
            this.a.f(-131073);
        } else if (i == 20) {
            this.a.f(-262145);
        } else if (i == 23) {
            this.a.f(-16385);
        } else {
            b(i);
        }
        return false;
    }

    public boolean b(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 2:
                float x = motionEvent.getX() * motionEvent.getXPrecision();
                float y = motionEvent.getY() * motionEvent.getYPrecision();
                if (Math.max(Math.abs(x), Math.abs(y)) >= 1.0f) {
                    if (Math.abs(x) <= Math.abs(y)) {
                        this.h = y < 0.0f ? 2 : 3;
                        break;
                    } else {
                        this.h = x < 0.0f ? 0 : 1;
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public void c() {
        this.a.Q.d = 0;
        this.a.Q.e = 0;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 100;
        this.u = null;
        this.v = 0;
        this.w = null;
        this.x = 0;
        this.a.Q.a("");
    }

    public boolean c(int i, int i2) {
        int a;
        zhook.aohoc.a.c.j jVar;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        boolean z2 = false;
        if (i > this.m.a - 50 && i2 < 30 && i < this.m.a + 40) {
            z = true;
        }
        if (i < 50 && i2 < 30) {
            z2 = true;
        }
        if (z && this.a.c.a != null && zhook.aohoc.bridge.a.a() != null && this.a.A != 2 && this.a.A != 1) {
            zhook.aohoc.bridge.a.a().h();
            return true;
        } else if (z2 && this.a.c.c != null && zhook.aohoc.bridge.a.a() != null && this.a.A != 2 && this.a.A != 1) {
            switch (AOHOActivity.a.getRequestedOrientation()) {
                case 0:
                    y.a("setRequestedOrientation = SCREEN_ORIENTATION_PORTRAIT");
                    AOHOActivity.a.setRequestedOrientation(1);
                    zhook.aohoc.bridge.a.a().b(1);
                    break;
                case 1:
                    y.a("setRequestedOrientation = SCREEN_ORIENTATION_LANDSCAPE");
                    AOHOActivity.a.setRequestedOrientation(0);
                    zhook.aohoc.bridge.a.a().b(0);
                    break;
                default:
                    y.a("setRequestedOrientation = SCREEN_ORIENTATION_LANDSCAPE (default)");
                    AOHOActivity.a.setRequestedOrientation(0);
                    zhook.aohoc.bridge.a.a().b(0);
                    break;
            }
            return true;
        } else {
            boolean z3 = currentTimeMillis - this.j < 666;
            if ((i < (this.m.a / 2) + (-30) || i > (this.m.a / 2) + 30 || i2 > 20) ? false : false) {
                this.k++;
                if (this.k == 2) {
                    this.a.a(6);
                    return false;
                }
            } else {
                this.k = 0;
            }
            this.j = currentTimeMillis;
            boolean z4 = AOHOActivity.a.a() == 2;
            if (this.a.A != 3) {
                int i3 = this.a.c.i() > 0 ? this.a.c.i() : 35;
                if (i2 >= this.m.b - i3 && i <= 50) {
                    this.a.e(4096);
                    return true;
                } else if (i2 >= this.m.b - i3 && i >= this.m.a - 50 && i < this.m.a + 40) {
                    this.a.e(8192);
                    return true;
                } else if (i2 <= this.m.b - 30 && i < this.m.a && (a = this.a.c.a(i, i2)) != -1) {
                    this.a.c.n.a(a, this.a.A == 21);
                    this.a.e(16384);
                }
            } else if (this.a.N != null && (jVar = this.a.h) != null) {
                jVar.d(i, i2);
            }
            int i4 = this.m.b;
            int i5 = this.m.a;
            int a2 = a.a.d == null ? -1 : a.a.d.a();
            if (z4) {
                i4 = this.m.a;
                i5 = this.m.b;
                a2 = a.a.d == null ? -1 : a.a.d.b();
            } else {
                i2 = i;
                i = i2;
            }
            if (i > i4 && a2 != -1) {
                int i6 = (i2 - ((i5 - a2) / 2)) / 64;
                int i7 = (i - i4) / 40;
                if (i6 == 2 && i7 == 0) {
                    if (z4) {
                        this.a.e(32768);
                    } else {
                        this.a.e(131072);
                    }
                    this.e = 3;
                } else if (i6 == 1 && i7 == 1) {
                    if (z4) {
                        this.a.e(131072);
                    } else {
                        this.a.e(32768);
                    }
                    this.e = 1;
                } else if (i6 == 2 && i7 == 1) {
                    this.a.e(16384);
                    this.e = 0;
                    return true;
                } else if (i6 == 3 && i7 == 1) {
                    if (z4) {
                        this.a.e(262144);
                    } else {
                        this.a.e(65536);
                    }
                    this.e = 2;
                } else if (i6 == 2 && i7 == 2) {
                    if (z4) {
                        this.a.e(65536);
                    } else {
                        this.a.e(262144);
                    }
                    this.e = 4;
                }
                if (this.a.A == 3) {
                    if (i6 == 0 && i7 == 0) {
                        if (!z4) {
                            this.a.e(4096);
                            return true;
                        }
                    } else if (i6 == 0 && i7 == 1) {
                        if (z4) {
                            this.a.e(128);
                        } else {
                            this.a.e(1024);
                        }
                        return true;
                    } else if (i6 == 0 && i7 == 2) {
                        if (z4) {
                            this.a.e(512);
                        } else {
                            this.a.e(1);
                        }
                        return true;
                    } else if (i6 == 4 && i7 == 0) {
                        this.a.e(8192);
                        return true;
                    } else if (i6 == 4 && i7 == 1) {
                        if (z4) {
                            this.a.e(1024);
                        } else {
                            this.a.e(128);
                        }
                        return true;
                    } else if (i6 == 4 && i7 == 2) {
                        if (z4) {
                            this.a.e(1);
                        } else {
                            this.a.e(512);
                        }
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public void d() {
        if (this.b != -1 && this.c != -1 && System.currentTimeMillis() - this.d > 300) {
            this.d = (this.d == 0 ? 1200 : 0) + System.currentTimeMillis();
            if (c(this.b, this.c)) {
                this.b = -1;
                this.c = -1;
            }
        }
        this.g = false;
        if (this.h != -1) {
            switch (this.h) {
                case 0:
                    this.e = 1;
                    this.a.e(32768);
                    break;
                case 1:
                    this.e = 2;
                    this.a.e(65536);
                    break;
                case 2:
                    this.e = 3;
                    this.a.e(131072);
                    break;
                case 3:
                    this.e = 4;
                    this.a.e(262144);
                    break;
            }
            this.g = true;
        }
    }

    public void e() {
        try {
            if (this.f) {
                this.a.f(-1036288);
                this.f = false;
                if (this.b != -1 && this.c != -1) {
                    a(this.b, this.c);
                    this.b = -1;
                    this.c = -1;
                }
            }
            if (this.g && this.h != -1) {
                a();
                this.h = -1;
            }
        } finally {
            if (this.b == -1 && this.c == -1 && this.h == -1 && this.e != -1) {
                this.e = -1;
            }
        }
    }

    public int f() {
        return this.e;
    }
}
