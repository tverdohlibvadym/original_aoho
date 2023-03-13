package zhook.aohoc.bridge.platform.andr;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public class AOHOActivity extends Activity {
    public static AOHOActivity a;
    public static String b = "aoh_revival";

    private void b() {
        a = this;
        zhook.aohoc.bridge.a.a(zhook.aohoc.bridge.platform.b.b);
        a.a = new AOHOActivity();
        setContentView(a.a.getCurrentFocus());
        zhook.aohoc.bridge.a.a().e();
    }

    public int a() {
        return getResources().getConfiguration().orientation;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        System.out.println("$$$$$$$$ AOHOActivity : onCreate()");
        if (!isTaskRoot()) {
            Intent intent = getIntent();
            String action = intent.getAction();
            if (intent.hasCategory("android.intent.category.LAUNCHER") && action != null && action.equals("android.intent.action.MAIN")) {
                finish();
                return;
            }
        }
        a = this;
        getWindow().setFlags(1024, 1024);
        requestWindowFeature(1);
        requestWindowFeature(2);
        b = getString(R.string.app_store);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        System.out.println("$$$$$$$$ AOHOActivity : onDestroy()");
        try {
            if (zhook.aohoc.bridge.a.a() != null) {
                zhook.aohoc.bridge.a.a().a(true);
            }
            super.onDestroy();
        } catch (Exception e) {
            throw new RuntimeException("unable to destroy", e);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        System.out.println("$$$$$$$$ AOHOActivity : onPause()");
        try {
            if (zhook.aohoc.bridge.a.a() != null) {
                zhook.aohoc.bridge.a.a().f();
            }
            super.onPause();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("unable to freeze", e);
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        System.out.println("$$$$$$$$ AOHOActivity : onRestart()");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        System.out.println("$$$$$$$$ AOHOActivity : onResume()");
        if (zhook.aohoc.bridge.a.a() == null) {
            b();
        }
        try {
            if (zhook.aohoc.bridge.a.a() != null) {
                zhook.aohoc.bridge.a.a().g();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("unable to resume", e);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        System.out.println("$$$$$$$$ AOHOActivity : onStop()");
        if (zhook.aohoc.bridge.a.a() == null) {
            onDestroy();
        } else {
            super.onStop();
        }
    }
}
