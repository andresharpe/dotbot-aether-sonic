package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.InterfaceC0577u;
import androidx.core.content.C0669d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z1 implements Iterable<Intent> {

    /* renamed from: G, reason: collision with root package name */
    private static final String f12158G = "TaskStackBuilder";

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList<Intent> f12159E = new ArrayList<>();

    /* renamed from: F, reason: collision with root package name */
    private final Context f12160F;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static PendingIntent a(Context context, int i4, Intent[] intentArr, int i5, Bundle bundle) {
            return PendingIntent.getActivities(context, i4, intentArr, i5, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        @androidx.annotation.P
        Intent q();
    }

    private z1(Context context) {
        this.f12160F = context;
    }

    @androidx.annotation.N
    public static z1 j(@androidx.annotation.N Context context) {
        return new z1(context);
    }

    @Deprecated
    public static z1 l(Context context) {
        return j(context);
    }

    @androidx.annotation.N
    public z1 b(@androidx.annotation.N Intent intent) {
        this.f12159E.add(intent);
        return this;
    }

    @androidx.annotation.N
    public z1 c(@androidx.annotation.N Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f12160F.getPackageManager());
        }
        if (component != null) {
            f(component);
        }
        b(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.N
    public z1 d(@androidx.annotation.N Activity activity) {
        Intent intent;
        if (activity instanceof b) {
            intent = ((b) activity).q();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = C0660x.a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f12160F.getPackageManager());
            }
            f(component);
            b(intent);
        }
        return this;
    }

    @androidx.annotation.N
    public z1 f(@androidx.annotation.N ComponentName componentName) {
        int size = this.f12159E.size();
        try {
            Intent b4 = C0660x.b(this.f12160F, componentName);
            while (b4 != null) {
                this.f12159E.add(size, b4);
                b4 = C0660x.b(this.f12160F, b4.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e(f12158G, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e4);
        }
    }

    @androidx.annotation.N
    public z1 g(@androidx.annotation.N Class<?> cls) {
        return f(new ComponentName(this.f12160F, cls));
    }

    @Override // java.lang.Iterable
    @androidx.annotation.N
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f12159E.iterator();
    }

    @androidx.annotation.P
    public Intent k(int i4) {
        return this.f12159E.get(i4);
    }

    @Deprecated
    public Intent m(int i4) {
        return k(i4);
    }

    public int n() {
        return this.f12159E.size();
    }

    @androidx.annotation.N
    public Intent[] o() {
        int size = this.f12159E.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f12159E.get(0)).addFlags(268484608);
        for (int i4 = 1; i4 < size; i4++) {
            intentArr[i4] = new Intent(this.f12159E.get(i4));
        }
        return intentArr;
    }

    @androidx.annotation.P
    public PendingIntent p(int i4, int i5) {
        return q(i4, i5, null);
    }

    @androidx.annotation.P
    public PendingIntent q(int i4, int i5, @androidx.annotation.P Bundle bundle) {
        if (!this.f12159E.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f12159E.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return a.a(this.f12160F, i4, intentArr, i5, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public void r() {
        s(null);
    }

    public void s(@androidx.annotation.P Bundle bundle) {
        if (!this.f12159E.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f12159E.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0669d.v(this.f12160F, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f12160F.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
