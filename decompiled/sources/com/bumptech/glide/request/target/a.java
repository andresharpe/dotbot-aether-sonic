package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class a extends e<Bitmap> {

    /* renamed from: H, reason: collision with root package name */
    private final int[] f26834H;

    /* renamed from: I, reason: collision with root package name */
    private final ComponentName f26835I;

    /* renamed from: J, reason: collision with root package name */
    private final RemoteViews f26836J;

    /* renamed from: K, reason: collision with root package name */
    private final Context f26837K;

    /* renamed from: L, reason: collision with root package name */
    private final int f26838L;

    public a(Context context, int i4, int i5, int i6, RemoteViews remoteViews, int... iArr) {
        super(i4, i5);
        if (iArr.length != 0) {
            this.f26837K = (Context) com.bumptech.glide.util.l.e(context, "Context can not be null!");
            this.f26836J = (RemoteViews) com.bumptech.glide.util.l.e(remoteViews, "RemoteViews object can not be null!");
            this.f26834H = (int[]) com.bumptech.glide.util.l.e(iArr, "WidgetIds can not be null!");
            this.f26838L = i6;
            this.f26835I = null;
            return;
        }
        throw new IllegalArgumentException("WidgetIds must have length > 0");
    }

    private void g(@P Bitmap bitmap) {
        this.f26836J.setImageViewBitmap(this.f26838L, bitmap);
        h();
    }

    private void h() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f26837K);
        ComponentName componentName = this.f26835I;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f26836J);
        } else {
            appWidgetManager.updateAppWidget(this.f26834H, this.f26836J);
        }
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

    public a(Context context, int i4, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i4, remoteViews, iArr);
    }

    public a(Context context, int i4, int i5, int i6, RemoteViews remoteViews, ComponentName componentName) {
        super(i4, i5);
        this.f26837K = (Context) com.bumptech.glide.util.l.e(context, "Context can not be null!");
        this.f26836J = (RemoteViews) com.bumptech.glide.util.l.e(remoteViews, "RemoteViews object can not be null!");
        this.f26835I = (ComponentName) com.bumptech.glide.util.l.e(componentName, "ComponentName can not be null!");
        this.f26838L = i6;
        this.f26834H = null;
    }

    public a(Context context, int i4, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i4, remoteViews, componentName);
    }
}
