package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.P;
import com.airbnb.lottie.model.h;
import com.airbnb.lottie.utils.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f21554d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private com.airbnb.lottie.c f21555e;

    /* renamed from: a, reason: collision with root package name */
    private final h<String> f21551a = new h<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<h<String>, Typeface> f21552b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f21553c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private String f21556f = ".ttf";

    public a(Drawable.Callback callback, @P com.airbnb.lottie.c cVar) {
        this.f21555e = cVar;
        if (!(callback instanceof View)) {
            f.e("LottieDrawable must be inside of a view for images to work.");
            this.f21554d = null;
        } else {
            this.f21554d = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface a(String str) {
        Typeface typeface;
        String b4;
        Typeface typeface2 = this.f21553c.get(str);
        if (typeface2 != null) {
            return typeface2;
        }
        com.airbnb.lottie.c cVar = this.f21555e;
        if (cVar != null) {
            typeface = cVar.a(str);
        } else {
            typeface = null;
        }
        com.airbnb.lottie.c cVar2 = this.f21555e;
        if (cVar2 != null && typeface == null && (b4 = cVar2.b(str)) != null) {
            typeface = Typeface.createFromAsset(this.f21554d, b4);
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.f21554d, "fonts/" + str + this.f21556f);
        }
        this.f21553c.put(str, typeface);
        return typeface;
    }

    private Typeface e(Typeface typeface, String str) {
        int i4;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i4 = 3;
        } else if (contains) {
            i4 = 2;
        } else if (contains2) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (typeface.getStyle() == i4) {
            return typeface;
        }
        return Typeface.create(typeface, i4);
    }

    public Typeface b(String str, String str2) {
        this.f21551a.b(str, str2);
        Typeface typeface = this.f21552b.get(this.f21551a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e4 = e(a(str), str2);
        this.f21552b.put(this.f21551a, e4);
        return e4;
    }

    public void c(String str) {
        this.f21556f = str;
    }

    public void d(@P com.airbnb.lottie.c cVar) {
        this.f21555e = cVar;
    }
}
