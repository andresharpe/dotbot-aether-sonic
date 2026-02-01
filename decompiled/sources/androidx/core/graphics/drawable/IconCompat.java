package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.core.content.C0669d;
import androidx.core.util.p;
import androidx.core.util.u;
import androidx.core.view.C0823k0;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: A, reason: collision with root package name */
    @i0
    static final String f12487A = "obj";

    /* renamed from: B, reason: collision with root package name */
    @i0
    static final String f12488B = "int1";

    /* renamed from: C, reason: collision with root package name */
    @i0
    static final String f12489C = "int2";

    /* renamed from: D, reason: collision with root package name */
    @i0
    static final String f12490D = "tint_list";

    /* renamed from: E, reason: collision with root package name */
    @i0
    static final String f12491E = "tint_mode";

    /* renamed from: F, reason: collision with root package name */
    @i0
    static final String f12492F = "string1";

    /* renamed from: G, reason: collision with root package name */
    static final PorterDuff.Mode f12493G = PorterDuff.Mode.SRC_IN;

    /* renamed from: k, reason: collision with root package name */
    private static final String f12494k = "IconCompat";

    /* renamed from: l, reason: collision with root package name */
    public static final int f12495l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12496m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f12497n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f12498o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12499p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f12500q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f12501r = 6;

    /* renamed from: s, reason: collision with root package name */
    private static final float f12502s = 0.25f;

    /* renamed from: t, reason: collision with root package name */
    private static final float f12503t = 0.6666667f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f12504u = 0.9166667f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f12505v = 0.010416667f;

    /* renamed from: w, reason: collision with root package name */
    private static final float f12506w = 0.020833334f;

    /* renamed from: x, reason: collision with root package name */
    private static final int f12507x = 61;

    /* renamed from: y, reason: collision with root package name */
    private static final int f12508y = 30;

    /* renamed from: z, reason: collision with root package name */
    @i0
    static final String f12509z = "type";

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f12510a;

    /* renamed from: b, reason: collision with root package name */
    Object f12511b;

    /* renamed from: c, reason: collision with root package name */
    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] f12512c;

    /* renamed from: d, reason: collision with root package name */
    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable f12513d;

    /* renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f12514e;

    /* renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f12515f;

    /* renamed from: g, reason: collision with root package name */
    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList f12516g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f12517h;

    /* renamed from: i, reason: collision with root package name */
    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String f12518i;

    /* renamed from: j, reason: collision with root package name */
    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String f12519j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(23)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @P
        static IconCompat a(@N Context context, @N Icon icon) {
            int e4 = e(icon);
            if (e4 != 2) {
                if (e4 != 4) {
                    if (e4 != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f12511b = icon;
                        return iconCompat;
                    }
                    return IconCompat.r(f(icon));
                }
                return IconCompat.u(f(icon));
            }
            String d4 = d(icon);
            try {
                return IconCompat.y(IconCompat.C(context, d4), d4, c(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }

        static IconCompat b(@N Object obj) {
            u.l(obj);
            int e4 = e(obj);
            if (e4 != 2) {
                if (e4 != 4) {
                    if (e4 != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f12511b = obj;
                        return iconCompat;
                    }
                    return IconCompat.r(f(obj));
                }
                return IconCompat.u(f(obj));
            }
            return IconCompat.y(null, d(obj), c(obj));
        }

        @D
        @InterfaceC0578v
        static int c(@N Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e4) {
                Log.e(IconCompat.f12494k, "Unable to get icon resource", e4);
                return 0;
            } catch (NoSuchMethodException e5) {
                Log.e(IconCompat.f12494k, "Unable to get icon resource", e5);
                return 0;
            } catch (InvocationTargetException e6) {
                Log.e(IconCompat.f12494k, "Unable to get icon resource", e6);
                return 0;
            }
        }

        @P
        static String d(@N Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e4) {
                Log.e(IconCompat.f12494k, "Unable to get icon package", e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.e(IconCompat.f12494k, "Unable to get icon package", e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.e(IconCompat.f12494k, "Unable to get icon package", e6);
                return null;
            }
        }

        static int e(@N Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e4) {
                Log.e(IconCompat.f12494k, "Unable to get icon type " + obj, e4);
                return -1;
            } catch (NoSuchMethodException e5) {
                Log.e(IconCompat.f12494k, "Unable to get icon type " + obj, e5);
                return -1;
            } catch (InvocationTargetException e6) {
                Log.e(IconCompat.f12494k, "Unable to get icon type " + obj, e6);
                return -1;
            }
        }

        @P
        @InterfaceC0577u
        static Uri f(@N Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e4) {
                Log.e(IconCompat.f12494k, "Unable to get icon uri", e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.e(IconCompat.f12494k, "Unable to get icon uri", e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.e(IconCompat.f12494k, "Unable to get icon uri", e6);
                return null;
            }
        }

        @InterfaceC0577u
        static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @InterfaceC0577u
        static Icon h(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f12510a) {
                case -1:
                    return (Icon) iconCompat.f12511b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f12511b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.B(), iconCompat.f12514e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f12511b, iconCompat.f12514e, iconCompat.f12515f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f12511b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = b.b((Bitmap) iconCompat.f12511b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.p((Bitmap) iconCompat.f12511b, false));
                        break;
                    }
                case 6:
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30) {
                        createWithBitmap = d.a(iconCompat.E());
                        break;
                    } else if (context != null) {
                        InputStream F3 = iconCompat.F(context);
                        if (F3 != null) {
                            if (i4 >= 26) {
                                createWithBitmap = b.b(BitmapFactory.decodeStream(F3));
                                break;
                            } else {
                                createWithBitmap = Icon.createWithBitmap(IconCompat.p(BitmapFactory.decodeStream(F3), false));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.E());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.E());
                    }
            }
            ColorStateList colorStateList = iconCompat.f12516g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f12517h;
            if (mode != IconCompat.f12493G) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(26)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @InterfaceC0577u
        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(28)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @InterfaceC0577u
        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @InterfaceC0577u
        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        @InterfaceC0577u
        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(30)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @InterfaceC0577u
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface e {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.f12510a = -1;
        this.f12512c = null;
        this.f12513d = null;
        this.f12514e = 0;
        this.f12515f = 0;
        this.f12516g = null;
        this.f12517h = f12493G;
        this.f12518i = null;
    }

    static Resources C(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo == null) {
                return null;
            }
            return packageManager.getResourcesForApplication(applicationInfo);
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e(f12494k, String.format("Unable to find pkg=%s for icon", str), e4);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable H(Context context) {
        switch (this.f12510a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f12511b);
            case 2:
                String B3 = B();
                if (TextUtils.isEmpty(B3)) {
                    B3 = context.getPackageName();
                }
                try {
                    return androidx.core.content.res.i.g(C(context, B3), this.f12514e, context.getTheme());
                } catch (RuntimeException e4) {
                    Log.e(f12494k, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f12514e), this.f12511b), e4);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f12511b, this.f12514e, this.f12515f));
            case 4:
                InputStream F3 = F(context);
                if (F3 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(F3));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), p((Bitmap) this.f12511b, false));
            case 6:
                InputStream F4 = F(context);
                if (F4 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(F4)));
                    }
                    return new BitmapDrawable(context.getResources(), p(BitmapFactory.decodeStream(F4), false));
                }
                return null;
            default:
                return null;
        }
    }

    private static String N(int i4) {
        switch (i4) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @P
    public static IconCompat l(@N Bundle bundle) {
        int i4 = bundle.getInt(f12509z);
        IconCompat iconCompat = new IconCompat(i4);
        iconCompat.f12514e = bundle.getInt(f12488B);
        iconCompat.f12515f = bundle.getInt(f12489C);
        iconCompat.f12519j = bundle.getString(f12492F);
        if (bundle.containsKey(f12490D)) {
            iconCompat.f12516g = (ColorStateList) bundle.getParcelable(f12490D);
        }
        if (bundle.containsKey(f12491E)) {
            iconCompat.f12517h = PorterDuff.Mode.valueOf(bundle.getString(f12491E));
        }
        switch (i4) {
            case -1:
            case 1:
            case 5:
                iconCompat.f12511b = bundle.getParcelable(f12487A);
                return iconCompat;
            case 0:
            default:
                Log.w(f12494k, "Unknown type " + i4);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f12511b = bundle.getString(f12487A);
                return iconCompat;
            case 3:
                iconCompat.f12511b = bundle.getByteArray(f12487A);
                return iconCompat;
        }
    }

    @P
    @W(23)
    public static IconCompat m(@N Context context, @N Icon icon) {
        u.l(icon);
        return a.a(context, icon);
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @W(23)
    public static IconCompat n(@N Icon icon) {
        return a.b(icon);
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @W(23)
    public static IconCompat o(@N Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    @i0
    static Bitmap p(Bitmap bitmap, boolean z3) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * f12503t);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f4 = min;
        float f5 = 0.5f * f4;
        float f6 = f12504u * f5;
        if (z3) {
            float f7 = f12505v * f4;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f4 * f12506w, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(C0823k0.f13589t);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @N
    public static IconCompat q(@N Bitmap bitmap) {
        p.d(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f12511b = bitmap;
        return iconCompat;
    }

    @N
    public static IconCompat r(@N Uri uri) {
        p.d(uri);
        return s(uri.toString());
    }

    @N
    public static IconCompat s(@N String str) {
        p.d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f12511b = str;
        return iconCompat;
    }

    @N
    public static IconCompat t(@N Bitmap bitmap) {
        p.d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f12511b = bitmap;
        return iconCompat;
    }

    @N
    public static IconCompat u(@N Uri uri) {
        p.d(uri);
        return v(uri.toString());
    }

    @N
    public static IconCompat v(@N String str) {
        p.d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f12511b = str;
        return iconCompat;
    }

    @N
    public static IconCompat w(@N byte[] bArr, int i4, int i5) {
        p.d(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f12511b = bArr;
        iconCompat.f12514e = i4;
        iconCompat.f12515f = i5;
        return iconCompat;
    }

    @N
    public static IconCompat x(@N Context context, @InterfaceC0578v int i4) {
        p.d(context);
        return y(context.getResources(), context.getPackageName(), i4);
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat y(@P Resources resources, @N String str, @InterfaceC0578v int i4) {
        p.d(str);
        if (i4 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f12514e = i4;
            if (resources != null) {
                try {
                    iconCompat.f12511b = resources.getResourceName(i4);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f12511b = str;
            }
            iconCompat.f12519j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    @InterfaceC0578v
    public int A() {
        int i4 = this.f12510a;
        if (i4 == -1) {
            return a.c(this.f12511b);
        }
        if (i4 == 2) {
            return this.f12514e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @N
    public String B() {
        int i4 = this.f12510a;
        if (i4 == -1) {
            return a.d(this.f12511b);
        }
        if (i4 == 2) {
            String str = this.f12519j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f12519j;
            }
            return ((String) this.f12511b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int D() {
        int i4 = this.f12510a;
        if (i4 == -1) {
            return a.e(this.f12511b);
        }
        return i4;
    }

    @N
    public Uri E() {
        int i4 = this.f12510a;
        if (i4 == -1) {
            return a.f(this.f12511b);
        }
        if (i4 != 4 && i4 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f12511b);
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public InputStream F(@N Context context) {
        Uri E3 = E();
        String scheme = E3.getScheme();
        if (!FirebaseAnalytics.b.f34769P.equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f12511b));
            } catch (FileNotFoundException e4) {
                Log.w(f12494k, "Unable to load image from path: " + E3, e4);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(E3);
        } catch (Exception e5) {
            Log.w(f12494k, "Unable to load image from URI: " + E3, e5);
            return null;
        }
    }

    @P
    public Drawable G(@N Context context) {
        k(context);
        return a.g(M(context), context);
    }

    @N
    public IconCompat I(@InterfaceC0569l int i4) {
        return J(ColorStateList.valueOf(i4));
    }

    @N
    public IconCompat J(@P ColorStateList colorStateList) {
        this.f12516g = colorStateList;
        return this;
    }

    @N
    public IconCompat K(@P PorterDuff.Mode mode) {
        this.f12517h = mode;
        return this;
    }

    @N
    @W(23)
    @Deprecated
    public Icon L() {
        return M(null);
    }

    @N
    @W(23)
    public Icon M(@P Context context) {
        return a.h(this, context);
    }

    @N
    public Bundle b() {
        Bundle bundle = new Bundle();
        switch (this.f12510a) {
            case -1:
                bundle.putParcelable(f12487A, (Parcelable) this.f12511b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(f12487A, (Bitmap) this.f12511b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(f12487A, (String) this.f12511b);
                break;
            case 3:
                bundle.putByteArray(f12487A, (byte[]) this.f12511b);
                break;
        }
        bundle.putInt(f12509z, this.f12510a);
        bundle.putInt(f12488B, this.f12514e);
        bundle.putInt(f12489C, this.f12515f);
        bundle.putString(f12492F, this.f12519j);
        ColorStateList colorStateList = this.f12516g;
        if (colorStateList != null) {
            bundle.putParcelable(f12490D, colorStateList);
        }
        PorterDuff.Mode mode = this.f12517h;
        if (mode != f12493G) {
            bundle.putString(f12491E, mode.name());
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void h() {
        this.f12517h = PorterDuff.Mode.valueOf(this.f12518i);
        switch (this.f12510a) {
            case -1:
                Parcelable parcelable = this.f12513d;
                if (parcelable != null) {
                    this.f12511b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f12513d;
                if (parcelable2 != null) {
                    this.f12511b = parcelable2;
                    return;
                }
                byte[] bArr = this.f12512c;
                this.f12511b = bArr;
                this.f12510a = 3;
                this.f12514e = 0;
                this.f12515f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f12512c, Charset.forName("UTF-16"));
                this.f12511b = str;
                if (this.f12510a == 2 && this.f12519j == null) {
                    this.f12519j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f12511b = this.f12512c;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void i(boolean z3) {
        this.f12518i = this.f12517h.name();
        switch (this.f12510a) {
            case -1:
                if (!z3) {
                    this.f12513d = (Parcelable) this.f12511b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z3) {
                    Bitmap bitmap = (Bitmap) this.f12511b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f12512c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f12513d = (Parcelable) this.f12511b;
                return;
            case 2:
                this.f12512c = ((String) this.f12511b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f12512c = (byte[]) this.f12511b;
                return;
            case 4:
            case 6:
                this.f12512c = this.f12511b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void j(@N Intent intent, @P Drawable drawable, @N Context context) {
        Bitmap bitmap;
        k(context);
        int i4 = this.f12510a;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 5) {
                    bitmap = p((Bitmap) this.f12511b, true);
                } else {
                    throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                }
            } else {
                try {
                    Context createPackageContext = context.createPackageContext(B(), 0);
                    if (drawable == null) {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.f12514e));
                        return;
                    }
                    Drawable i5 = C0669d.i(createPackageContext, this.f12514e);
                    if (i5.getIntrinsicWidth() > 0 && i5.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(i5.getIntrinsicWidth(), i5.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        i5.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        i5.draw(new Canvas(bitmap));
                    }
                    int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                    i5.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    i5.draw(new Canvas(bitmap));
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException("Can't find package " + this.f12511b, e4);
                }
            }
        } else {
            bitmap = (Bitmap) this.f12511b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void k(@N Context context) {
        Object obj;
        if (this.f12510a == 2 && (obj = this.f12511b) != null) {
            String str = (String) obj;
            if (!str.contains(":")) {
                return;
            }
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(f12494k, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String B3 = B();
            int identifier = C(context, B3).getIdentifier(str4, str3, str5);
            if (this.f12514e != identifier) {
                Log.i(f12494k, "Id has changed for " + B3 + " " + str);
                this.f12514e = identifier;
            }
        }
    }

    @N
    public String toString() {
        if (this.f12510a == -1) {
            return String.valueOf(this.f12511b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(N(this.f12510a));
        switch (this.f12510a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f12511b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f12511b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f12519j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(A())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f12514e);
                if (this.f12515f != 0) {
                    sb.append(" off=");
                    sb.append(this.f12515f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f12511b);
                break;
        }
        if (this.f12516g != null) {
            sb.append(" tint=");
            sb.append(this.f12516g);
        }
        if (this.f12517h != f12493G) {
            sb.append(" mode=");
            sb.append(this.f12517h);
        }
        sb.append(")");
        return sb.toString();
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bitmap z() {
        int i4 = this.f12510a;
        if (i4 == -1) {
            Object obj = this.f12511b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i4 == 1) {
            return (Bitmap) this.f12511b;
        }
        if (i4 == 5) {
            return p((Bitmap) this.f12511b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    IconCompat(int i4) {
        this.f12512c = null;
        this.f12513d = null;
        this.f12514e = 0;
        this.f12515f = 0;
        this.f12516g = null;
        this.f12517h = f12493G;
        this.f12518i = null;
        this.f12510a = i4;
    }
}
