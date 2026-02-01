package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.N;
import androidx.media.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r implements i.a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f16079c = "MediaSessionManager";

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f16080d = i.f16071c;

    /* renamed from: e, reason: collision with root package name */
    private static final String f16081e = "android.permission.STATUS_BAR_SERVICE";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16082f = "android.permission.MEDIA_CONTENT_CONTROL";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16083g = "enabled_notification_listeners";

    /* renamed from: a, reason: collision with root package name */
    Context f16084a;

    /* renamed from: b, reason: collision with root package name */
    ContentResolver f16085b;

    /* loaded from: classes.dex */
    static class a implements i.c {

        /* renamed from: a, reason: collision with root package name */
        private String f16086a;

        /* renamed from: b, reason: collision with root package name */
        private int f16087b;

        /* renamed from: c, reason: collision with root package name */
        private int f16088c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, int i4, int i5) {
            this.f16086a = str;
            this.f16087b = i4;
            this.f16088c = i5;
        }

        @Override // androidx.media.i.c
        public int a() {
            return this.f16088c;
        }

        @Override // androidx.media.i.c
        public int b() {
            return this.f16087b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (TextUtils.equals(this.f16086a, aVar.f16086a) && this.f16087b == aVar.f16087b && this.f16088c == aVar.f16088c) {
                return true;
            }
            return false;
        }

        @Override // androidx.media.i.c
        public String g() {
            return this.f16086a;
        }

        public int hashCode() {
            return androidx.core.util.p.b(this.f16086a, Integer.valueOf(this.f16087b), Integer.valueOf(this.f16088c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Context context) {
        this.f16084a = context;
        this.f16085b = context.getContentResolver();
    }

    private boolean c(i.c cVar, String str) {
        if (cVar.b() < 0) {
            if (this.f16084a.getPackageManager().checkPermission(str, cVar.g()) != 0) {
                return false;
            }
            return true;
        }
        if (this.f16084a.checkPermission(str, cVar.b(), cVar.a()) != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.media.i.a
    public boolean a(@N i.c cVar) {
        try {
            if (this.f16084a.getPackageManager().getApplicationInfo(cVar.g(), 0).uid != cVar.a()) {
                if (f16080d) {
                    Log.d(f16079c, "Package name " + cVar.g() + " doesn't match with the uid " + cVar.a());
                }
                return false;
            }
            if (!c(cVar, f16081e) && !c(cVar, f16082f) && cVar.a() != 1000 && !b(cVar)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (f16080d) {
                Log.d(f16079c, "Package " + cVar.g() + " doesn't exist");
            }
            return false;
        }
    }

    boolean b(@N i.c cVar) {
        String string = Settings.Secure.getString(this.f16085b, f16083g);
        if (string != null) {
            for (String str : string.split(":")) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(cVar.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media.i.a
    public Context e() {
        return this.f16084a;
    }
}
