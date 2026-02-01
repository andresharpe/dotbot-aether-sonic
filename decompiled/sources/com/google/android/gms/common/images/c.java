package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1244d;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    private final Uri f28578E;

    /* renamed from: F, reason: collision with root package name */
    @P
    private final ParcelFileDescriptor f28579F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ ImageManager f28580G;

    public c(ImageManager imageManager, @P Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f28580G = imageManager;
        this.f28578E = uri;
        this.f28579F = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        C1244d.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f28579F;
        Bitmap bitmap = null;
        boolean z3 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e4) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f28578E)), e4);
                z3 = true;
            }
            try {
                this.f28579F.close();
            } catch (IOException e5) {
                Log.e("ImageManager", "closed failed", e5);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f28580G;
        handler = imageManager.f28563b;
        handler.post(new e(imageManager, this.f28578E, bitmap, z3, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.f28578E)));
        }
    }
}
