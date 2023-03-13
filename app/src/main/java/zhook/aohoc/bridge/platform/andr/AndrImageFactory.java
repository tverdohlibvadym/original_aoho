package zhook.aohoc.bridge.platform.andr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class AndrImageFactory implements zhook.aohoc.bridge.g {
    @Override // zhook.aohoc.bridge.g
    public zhook.aohoc.bridge.f a(int i, int i2) {
        return new e(Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888));
    }

    public zhook.aohoc.bridge.f a(InputStream inputStream) {
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        if (decodeStream == null) {
            throw new IOException();
        }
        return new e(decodeStream);
    }

    @Override // zhook.aohoc.bridge.g
    public zhook.aohoc.bridge.f a(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1, str.length());
        }
        return a(AOHOActivity.a.getAssets().open(str));
    }

    @Override // zhook.aohoc.bridge.g
    public zhook.aohoc.bridge.f a(byte[] bArr, int i, int i2) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2);
        if (decodeByteArray == null) {
            throw new IllegalArgumentException("Could not decode image data");
        }
        return new e(decodeByteArray);
    }

    @Override // zhook.aohoc.bridge.g
    public zhook.aohoc.bridge.f a(int[] iArr, int i, int i2, boolean z) {
        return new e(Bitmap.createBitmap(iArr, i, i2, z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565));
    }

    @Override // zhook.aohoc.bridge.g
    public zhook.aohoc.bridge.f[] a(int i) {
        return new e[i];
    }
}
