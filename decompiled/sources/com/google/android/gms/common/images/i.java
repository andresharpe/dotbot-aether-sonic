package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1244d;
import com.google.android.gms.internal.base.k;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    final f f28590a;

    /* renamed from: b, reason: collision with root package name */
    protected int f28591b;

    public i(Uri uri, int i4) {
        this.f28591b = 0;
        this.f28590a = new f(uri);
        this.f28591b = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(@P Drawable drawable, boolean z3, boolean z4, boolean z5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Context context, k kVar, boolean z3) {
        Drawable drawable;
        int i4 = this.f28591b;
        if (i4 != 0) {
            drawable = context.getResources().getDrawable(i4);
        } else {
            drawable = null;
        }
        a(drawable, z3, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Context context, Bitmap bitmap, boolean z3) {
        C1244d.c(bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
