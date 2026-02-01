package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class l extends e<Bitmap> {

    /* renamed from: H, reason: collision with root package name */
    private final RemoteViews f26868H;

    /* renamed from: I, reason: collision with root package name */
    private final Context f26869I;

    /* renamed from: J, reason: collision with root package name */
    private final int f26870J;

    /* renamed from: K, reason: collision with root package name */
    private final String f26871K;

    /* renamed from: L, reason: collision with root package name */
    private final Notification f26872L;

    /* renamed from: M, reason: collision with root package name */
    private final int f26873M;

    public l(Context context, int i4, RemoteViews remoteViews, Notification notification, int i5) {
        this(context, i4, remoteViews, notification, i5, null);
    }

    private void g(@P Bitmap bitmap) {
        this.f26868H.setImageViewBitmap(this.f26873M, bitmap);
        h();
    }

    private void h() {
        ((NotificationManager) com.bumptech.glide.util.l.d((NotificationManager) this.f26869I.getSystemService("notification"))).notify(this.f26871K, this.f26870J, this.f26872L);
    }

    @Override // com.bumptech.glide.request.target.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void e(@N Bitmap bitmap, @P com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
        g(bitmap);
    }

    @Override // com.bumptech.glide.request.target.p
    public void r(@P Drawable drawable) {
        g(null);
    }

    public l(Context context, int i4, RemoteViews remoteViews, Notification notification, int i5, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i4, remoteViews, notification, i5, str);
    }

    public l(Context context, int i4, int i5, int i6, RemoteViews remoteViews, Notification notification, int i7, String str) {
        super(i4, i5);
        this.f26869I = (Context) com.bumptech.glide.util.l.e(context, "Context must not be null!");
        this.f26872L = (Notification) com.bumptech.glide.util.l.e(notification, "Notification object can not be null!");
        this.f26868H = (RemoteViews) com.bumptech.glide.util.l.e(remoteViews, "RemoteViews object can not be null!");
        this.f26873M = i6;
        this.f26870J = i7;
        this.f26871K = str;
    }
}
