package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.F;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.core.content.res.i;
import androidx.core.graphics.T;
import androidx.core.graphics.a0;
import androidx.core.util.u;
import com.harman.jbl.partybox.ui.bassboost.BassBoostFragment;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String f12788a = "font_results";

    /* renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f12789b = -1;

    /* renamed from: c, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f12790c = -2;

    /* loaded from: classes.dex */
    public static final class a implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final String f12791a = "file_id";

        /* renamed from: b, reason: collision with root package name */
        public static final String f12792b = "font_ttc_index";

        /* renamed from: c, reason: collision with root package name */
        public static final String f12793c = "font_variation_settings";

        /* renamed from: d, reason: collision with root package name */
        public static final String f12794d = "font_weight";

        /* renamed from: e, reason: collision with root package name */
        public static final String f12795e = "font_italic";

        /* renamed from: f, reason: collision with root package name */
        public static final String f12796f = "result_code";

        /* renamed from: g, reason: collision with root package name */
        public static final int f12797g = 0;

        /* renamed from: h, reason: collision with root package name */
        public static final int f12798h = 1;

        /* renamed from: i, reason: collision with root package name */
        public static final int f12799i = 2;

        /* renamed from: j, reason: collision with root package name */
        public static final int f12800j = 3;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f12801c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f12802d = 1;

        /* renamed from: e, reason: collision with root package name */
        public static final int f12803e = 2;

        /* renamed from: a, reason: collision with root package name */
        private final int f12804a;

        /* renamed from: b, reason: collision with root package name */
        private final c[] f12805b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i4, @P c[] cVarArr) {
            this.f12804a = i4;
            this.f12805b = cVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(int i4, @P c[] cVarArr) {
            return new b(i4, cVarArr);
        }

        public c[] b() {
            return this.f12805b;
        }

        public int c() {
            return this.f12804a;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f12806a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12807b;

        /* renamed from: c, reason: collision with root package name */
        private final int f12808c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f12809d;

        /* renamed from: e, reason: collision with root package name */
        private final int f12810e;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@N Uri uri, @F(from = 0) int i4, @F(from = 1, to = 1000) int i5, boolean z3, int i6) {
            this.f12806a = (Uri) u.l(uri);
            this.f12807b = i4;
            this.f12808c = i5;
            this.f12809d = z3;
            this.f12810e = i6;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static c a(@N Uri uri, @F(from = 0) int i4, @F(from = 1, to = 1000) int i5, boolean z3, int i6) {
            return new c(uri, i4, i5, z3, i6);
        }

        public int b() {
            return this.f12810e;
        }

        @F(from = 0)
        public int c() {
            return this.f12807b;
        }

        @N
        public Uri d() {
            return this.f12806a;
        }

        @F(from = 1, to = BassBoostFragment.NOTIFY_TIME_OUT)
        public int e() {
            return this.f12808c;
        }

        public boolean f() {
            return this.f12809d;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int f12811a = 0;

        /* renamed from: b, reason: collision with root package name */
        static final int f12812b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f12813c = -1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f12814d = -2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f12815e = -3;

        /* renamed from: f, reason: collision with root package name */
        public static final int f12816f = -4;

        /* renamed from: g, reason: collision with root package name */
        public static final int f12817g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f12818h = 2;

        /* renamed from: i, reason: collision with root package name */
        public static final int f12819i = 3;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* loaded from: classes.dex */
        public @interface a {
        }

        public void a(int i4) {
        }

        public void b(Typeface typeface) {
        }
    }

    private h() {
    }

    @P
    public static Typeface a(@N Context context, @P CancellationSignal cancellationSignal, @N c[] cVarArr) {
        return T.d(context, cancellationSignal, cVarArr, 0);
    }

    @N
    public static b b(@N Context context, @P CancellationSignal cancellationSignal, @N f fVar) throws PackageManager.NameNotFoundException {
        return e.e(context, fVar, cancellationSignal);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, f fVar, @P i.g gVar, @P Handler handler, boolean z3, int i4, int i5) {
        return f(context, fVar, i5, z3, i4, i.g.e(handler), new T.a(gVar));
    }

    @P
    @Deprecated
    @i0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ProviderInfo d(@N PackageManager packageManager, @N f fVar, @P Resources resources) throws PackageManager.NameNotFoundException {
        return e.f(packageManager, fVar, resources);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @W(19)
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return a0.h(context, cVarArr, cancellationSignal);
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface f(@N Context context, @N f fVar, int i4, boolean z3, @F(from = 0) int i5, @N Handler handler, @N d dVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar, handler);
        if (z3) {
            return g.e(context, fVar, aVar, i4, i5);
        }
        return g.d(context, fVar, i4, null, aVar);
    }

    public static void g(@N Context context, @N f fVar, @N d dVar, @N Handler handler) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar);
        g.d(context.getApplicationContext(), fVar, 0, i.b(handler), aVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void h() {
        g.f();
    }

    @i0
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static void i() {
        g.f();
    }
}
