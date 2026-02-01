package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.P;
import com.airbnb.lottie.d;
import com.airbnb.lottie.k;
import com.airbnb.lottie.utils.f;
import com.airbnb.lottie.utils.j;
import com.harman.sdk.message.GestureInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f21557e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f21558a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21559b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private d f21560c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, k> f21561d;

    public b(Drawable.Callback callback, String str, d dVar, Map<String, k> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f21559b = str + '/';
        } else {
            this.f21559b = str;
        }
        if (!(callback instanceof View)) {
            f.e("LottieDrawable must be inside of a view for images to work.");
            this.f21561d = new HashMap();
            this.f21558a = null;
        } else {
            this.f21558a = ((View) callback).getContext();
            this.f21561d = map;
            d(dVar);
        }
    }

    private Bitmap c(String str, @P Bitmap bitmap) {
        synchronized (f21557e) {
            this.f21561d.get(str).h(bitmap);
        }
        return bitmap;
    }

    @P
    public Bitmap a(String str) {
        k kVar = this.f21561d.get(str);
        if (kVar == null) {
            return null;
        }
        Bitmap a4 = kVar.a();
        if (a4 != null) {
            return a4;
        }
        d dVar = this.f21560c;
        if (dVar != null) {
            Bitmap a5 = dVar.a(kVar);
            if (a5 != null) {
                c(str, a5);
            }
            return a5;
        }
        String c4 = kVar.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = GestureInfo.f48257q0;
        if (c4.startsWith("data:") && c4.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(c4.substring(c4.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e4) {
                f.f("data URL did not have correct base64 format.", e4);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f21559b)) {
                try {
                    return c(str, j.m(BitmapFactory.decodeStream(this.f21558a.getAssets().open(this.f21559b + c4), null, options), kVar.f(), kVar.d()));
                } catch (IllegalArgumentException e5) {
                    f.f("Unable to decode image.", e5);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e6) {
            f.f("Unable to open asset.", e6);
            return null;
        }
    }

    public boolean b(Context context) {
        if ((context == null && this.f21558a == null) || this.f21558a.equals(context)) {
            return true;
        }
        return false;
    }

    public void d(@P d dVar) {
        this.f21560c = dVar;
    }

    @P
    public Bitmap e(String str, @P Bitmap bitmap) {
        if (bitmap == null) {
            k kVar = this.f21561d.get(str);
            Bitmap a4 = kVar.a();
            kVar.h(null);
            return a4;
        }
        Bitmap a5 = this.f21561d.get(str).a();
        c(str, bitmap);
        return a5;
    }
}
