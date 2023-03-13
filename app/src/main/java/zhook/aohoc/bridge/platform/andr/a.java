package zhook.aohoc.bridge.platform.andr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import zhook.aohoc.a.y;

/* loaded from: classes.dex */
public class a extends SurfaceView implements SurfaceHolder.Callback {
    public static a a;
    Canvas b;
    boolean c;
    public m d;
    private SurfaceHolder e;

    public a(Context context) {
        super(context);
        this.c = false;
        this.e = getHolder();
        this.e.addCallback(this);
        a = this;
        setKeepScreenOn(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public boolean a() {
        return this.e.getSurface().isValid();
    }

    public void b() {
        synchronized (this) {
            if (this.c) {
                Canvas lockCanvas = this.e.lockCanvas(null);
                synchronized (this.e) {
                    onDraw(lockCanvas);
                }
                if (lockCanvas != null) {
                    this.e.unlockCanvasAndPost(lockCanvas);
                }
            }
        }
    }

    public void c() {
        if (zhook.aohoc.bridge.a.e != null) {
            zhook.aohoc.bridge.a.e.a();
        }
        y.a("RUN() : END");
        try {
            AOHOActivity.a.finish();
        } catch (Exception e) {
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        zhook.aohoc.bridge.c i = zhook.aohoc.bridge.a.a().i();
        if (this.b != canvas) {
            this.b = canvas;
            i.j = true;
        }
        AndrInputProcessor andrInputProcessor = (AndrInputProcessor) i.m();
        andrInputProcessor.d();
        if (i.d()) {
            this.d.a(andrInputProcessor.f());
            if (i.q()) {
                canvas.drawBitmap(((c) i.h()).b(), 0.0f, 0.0f, (Paint) null);
            }
        }
        andrInputProcessor.e();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (((AndrInputProcessor) zhook.aohoc.bridge.a.a().i().m()).a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (((AndrInputProcessor) zhook.aohoc.bridge.a.a().i().m()).b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return ((AndrInputProcessor) zhook.aohoc.bridge.a.a().i().m()).a(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return ((AndrInputProcessor) zhook.aohoc.bridge.a.a().i().m()).b(motionEvent);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        System.out.println(">> surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        System.out.println(">> surfaceCreated");
        this.d = new m();
        this.c = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        System.out.println(">> surfaceDestroyed");
        this.c = false;
    }
}
