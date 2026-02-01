package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C1244d;
import com.google.android.gms.internal.base.k;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    private final i f28581E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ ImageManager f28582F;

    public d(ImageManager imageManager, i iVar) {
        this.f28582F = imageManager;
        this.f28581E = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        k kVar;
        Map map2;
        Map map3;
        Object obj;
        HashSet hashSet;
        HashSet hashSet2;
        Map map4;
        Map map5;
        Map map6;
        k kVar2;
        Map map7;
        C1244d.a("LoadImageRunnable must be executed on the main thread");
        map = this.f28582F.f28566e;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.get(this.f28581E);
        if (imageReceiver != null) {
            map7 = this.f28582F.f28566e;
            map7.remove(this.f28581E);
            imageReceiver.c(this.f28581E);
        }
        i iVar = this.f28581E;
        f fVar = iVar.f28590a;
        Uri uri = fVar.f28587a;
        if (uri != null) {
            map2 = this.f28582F.f28568g;
            Long l4 = (Long) map2.get(uri);
            if (l4 != null) {
                if (SystemClock.elapsedRealtime() - l4.longValue() >= 3600000) {
                    map6 = this.f28582F.f28568g;
                    map6.remove(fVar.f28587a);
                } else {
                    i iVar2 = this.f28581E;
                    ImageManager imageManager = this.f28582F;
                    Context context = imageManager.f28562a;
                    kVar2 = imageManager.f28565d;
                    iVar2.b(context, kVar2, true);
                    return;
                }
            }
            this.f28581E.a(null, false, true, false);
            map3 = this.f28582F.f28567f;
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) map3.get(fVar.f28587a);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageManager.ImageReceiver(fVar.f28587a);
                map5 = this.f28582F.f28567f;
                map5.put(fVar.f28587a, imageReceiver2);
            }
            imageReceiver2.b(this.f28581E);
            i iVar3 = this.f28581E;
            if (!(iVar3 instanceof h)) {
                map4 = this.f28582F.f28566e;
                map4.put(iVar3, imageReceiver2);
            }
            obj = ImageManager.f28559h;
            synchronized (obj) {
                try {
                    hashSet = ImageManager.f28560i;
                    if (!hashSet.contains(fVar.f28587a)) {
                        hashSet2 = ImageManager.f28560i;
                        hashSet2.add(fVar.f28587a);
                        imageReceiver2.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ImageManager imageManager2 = this.f28582F;
        Context context2 = imageManager2.f28562a;
        kVar = imageManager2.f28565d;
        iVar.b(context2, kVar, true);
    }
}
