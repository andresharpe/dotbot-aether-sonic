package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.P;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C1244d;
import com.google.android.gms.internal.base.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    private final Uri f28583E;

    /* renamed from: F, reason: collision with root package name */
    @P
    private final Bitmap f28584F;

    /* renamed from: G, reason: collision with root package name */
    private final CountDownLatch f28585G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ ImageManager f28586H;

    public e(ImageManager imageManager, @P Uri uri, Bitmap bitmap, boolean z3, CountDownLatch countDownLatch) {
        this.f28586H = imageManager;
        this.f28583E = uri;
        this.f28584F = bitmap;
        this.f28585G = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Object obj;
        HashSet hashSet;
        ArrayList arrayList;
        Map map2;
        k kVar;
        Map map3;
        C1244d.a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f28584F;
        map = this.f28586H.f28567f;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.remove(this.f28583E);
        if (imageReceiver != null) {
            arrayList = imageReceiver.f28570F;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar = (i) arrayList.get(i4);
                Bitmap bitmap2 = this.f28584F;
                if (bitmap2 == null || bitmap == null) {
                    map2 = this.f28586H.f28568g;
                    map2.put(this.f28583E, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.f28586H;
                    Context context = imageManager.f28562a;
                    kVar = imageManager.f28565d;
                    iVar.b(context, kVar, false);
                } else {
                    iVar.c(this.f28586H.f28562a, bitmap2, false);
                }
                if (!(iVar instanceof h)) {
                    map3 = this.f28586H.f28566e;
                    map3.remove(iVar);
                }
            }
        }
        this.f28585G.countDown();
        obj = ImageManager.f28559h;
        synchronized (obj) {
            hashSet = ImageManager.f28560i;
            hashSet.remove(this.f28583E);
        }
    }
}
