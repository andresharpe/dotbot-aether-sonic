package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.g;
import java.util.List;

/* loaded from: classes.dex */
public class e implements g<Uri, Drawable> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26563b = "android";

    /* renamed from: c, reason: collision with root package name */
    private static final int f26564c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f26565d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f26566e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f26567f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f26568g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f26569h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f26570a;

    public e(Context context) {
        this.f26570a = context.getApplicationContext();
    }

    @N
    private Context d(Uri uri, String str) {
        if (str.equals(this.f26570a.getPackageName())) {
            return this.f26570a;
        }
        try {
            return this.f26570a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            if (str.contains(this.f26570a.getPackageName())) {
                return this.f26570a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e4);
        }
    }

    @InterfaceC0578v
    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e4);
        }
    }

    @InterfaceC0578v
    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, f26563b);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @InterfaceC0578v
    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.bumptech.glide.load.g
    @P
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<Drawable> b(@N Uri uri, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        Context d4 = d(uri, uri.getAuthority());
        return d.f(a.b(this.f26570a, d4, g(d4, uri)));
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(@N Uri uri, @N com.bumptech.glide.load.f fVar) {
        return uri.getScheme().equals("android.resource");
    }
}
