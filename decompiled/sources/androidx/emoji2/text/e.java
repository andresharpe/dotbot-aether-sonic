package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.core.util.u;
import androidx.emoji2.text.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        @N
        private static final String f14309b = "emoji2.text.DefaultEmojiConfig";

        /* renamed from: c, reason: collision with root package name */
        @N
        private static final String f14310c = "androidx.content.action.LOAD_EMOJI_FONT";

        /* renamed from: d, reason: collision with root package name */
        @N
        private static final String f14311d = "emojicompat-emoji-font";

        /* renamed from: a, reason: collision with root package name */
        private final b f14312a;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public a(@P b bVar) {
            this.f14312a = bVar == null ? e() : bVar;
        }

        @P
        private g.d a(@N Context context, @P androidx.core.provider.f fVar) {
            if (fVar == null) {
                return null;
            }
            return new m(context, fVar);
        }

        @N
        private List<List<byte[]>> b(@N Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @N
        private androidx.core.provider.f d(@N ProviderInfo providerInfo, @N PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new androidx.core.provider.f(str, str2, f14311d, b(this.f14312a.b(packageManager, str2)));
        }

        @N
        private static b e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new d();
            }
            return new c();
        }

        private boolean f(@P ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                return true;
            }
            return false;
        }

        @P
        private ProviderInfo g(@N PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f14312a.c(packageManager, new Intent(f14310c), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo a4 = this.f14312a.a(it.next());
                if (f(a4)) {
                    return a4;
                }
            }
            return null;
        }

        @P
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public g.d c(@N Context context) {
            return a(context, h(context));
        }

        @P
        @i0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        androidx.core.provider.f h(@N Context context) {
            PackageManager packageManager = context.getPackageManager();
            u.m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g4 = g(packageManager);
            if (g4 == null) {
                return null;
            }
            try {
                return d(g4, packageManager);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf(f14309b, e4);
                return null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class b {
        @P
        public ProviderInfo a(@N ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @N
        public Signature[] b(@N PackageManager packageManager, @N String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @N
        public List<ResolveInfo> c(@N PackageManager packageManager, @N Intent intent, int i4) {
            return Collections.emptyList();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @W(19)
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // androidx.emoji2.text.e.b
        @P
        public ProviderInfo a(@N ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.e.b
        @N
        public List<ResolveInfo> c(@N PackageManager packageManager, @N Intent intent, int i4) {
            return packageManager.queryIntentContentProviders(intent, i4);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @W(28)
    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // androidx.emoji2.text.e.b
        @N
        public Signature[] b(@N PackageManager packageManager, @N String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    private e() {
    }

    @P
    public static m a(@N Context context) {
        return (m) new a(null).c(context);
    }
}
