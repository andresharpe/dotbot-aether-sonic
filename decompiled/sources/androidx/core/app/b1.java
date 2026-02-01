package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@androidx.annotation.W(16)
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11879a = "NotificationCompat";

    /* renamed from: b, reason: collision with root package name */
    static final String f11880b = "android.support.dataRemoteInputs";

    /* renamed from: c, reason: collision with root package name */
    static final String f11881c = "android.support.allowGeneratedReplies";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11882d = "icon";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11883e = "title";

    /* renamed from: f, reason: collision with root package name */
    private static final String f11884f = "actionIntent";

    /* renamed from: g, reason: collision with root package name */
    private static final String f11885g = "extras";

    /* renamed from: h, reason: collision with root package name */
    private static final String f11886h = "remoteInputs";

    /* renamed from: i, reason: collision with root package name */
    private static final String f11887i = "dataOnlyRemoteInputs";

    /* renamed from: j, reason: collision with root package name */
    private static final String f11888j = "resultKey";

    /* renamed from: k, reason: collision with root package name */
    private static final String f11889k = "label";

    /* renamed from: l, reason: collision with root package name */
    private static final String f11890l = "choices";

    /* renamed from: m, reason: collision with root package name */
    private static final String f11891m = "allowFreeFormInput";

    /* renamed from: n, reason: collision with root package name */
    private static final String f11892n = "allowedDataTypes";

    /* renamed from: o, reason: collision with root package name */
    private static final String f11893o = "semanticAction";

    /* renamed from: p, reason: collision with root package name */
    private static final String f11894p = "showsUserInterface";

    /* renamed from: r, reason: collision with root package name */
    private static Field f11896r;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f11897s;

    /* renamed from: u, reason: collision with root package name */
    private static Field f11899u;

    /* renamed from: v, reason: collision with root package name */
    private static Field f11900v;

    /* renamed from: w, reason: collision with root package name */
    private static Field f11901w;

    /* renamed from: x, reason: collision with root package name */
    private static Field f11902x;

    /* renamed from: y, reason: collision with root package name */
    private static boolean f11903y;

    /* renamed from: q, reason: collision with root package name */
    private static final Object f11895q = new Object();

    /* renamed from: t, reason: collision with root package name */
    private static final Object f11898t = new Object();

    private b1() {
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            Bundle bundle = list.get(i4);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i4, bundle);
            }
        }
        return sparseArray;
    }

    private static boolean b() {
        if (f11903y) {
            return false;
        }
        try {
            if (f11899u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f11900v = cls.getDeclaredField(f11882d);
                f11901w = cls.getDeclaredField(f11883e);
                f11902x = cls.getDeclaredField(f11884f);
                Field declaredField = Notification.class.getDeclaredField("actions");
                f11899u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e4) {
            Log.e(f11879a, "Unable to access notification actions", e4);
            f11903y = true;
        } catch (NoSuchFieldException e5) {
            Log.e(f11879a, "Unable to access notification actions", e5);
            f11903y = true;
        }
        return !f11903y;
    }

    private static v1 c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f11892n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new v1(bundle.getString(f11888j), bundle.getCharSequence("label"), bundle.getCharSequenceArray(f11890l), bundle.getBoolean(f11891m), 0, bundle.getBundle(f11885g), hashSet);
    }

    private static v1[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        v1[] v1VarArr = new v1[bundleArr.length];
        for (int i4 = 0; i4 < bundleArr.length; i4++) {
            v1VarArr[i4] = c(bundleArr[i4]);
        }
        return v1VarArr;
    }

    public static C0.b e(Notification notification, int i4) {
        Bundle bundle;
        SparseArray sparseParcelableArray;
        synchronized (f11898t) {
            try {
                try {
                    Object[] h4 = h(notification);
                    if (h4 != null) {
                        Object obj = h4[i4];
                        Bundle k4 = k(notification);
                        if (k4 != null && (sparseParcelableArray = k4.getSparseParcelableArray(a1.f11872e)) != null) {
                            bundle = (Bundle) sparseParcelableArray.get(i4);
                        } else {
                            bundle = null;
                        }
                        return l(f11900v.getInt(obj), (CharSequence) f11901w.get(obj), (PendingIntent) f11902x.get(obj), bundle);
                    }
                } catch (IllegalAccessException e4) {
                    Log.e(f11879a, "Unable to access notification actions", e4);
                    f11903y = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f(Notification notification) {
        int i4;
        synchronized (f11898t) {
            try {
                Object[] h4 = h(notification);
                if (h4 != null) {
                    i4 = h4.length;
                } else {
                    i4 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f11885g);
        boolean z3 = false;
        if (bundle2 != null) {
            z3 = bundle2.getBoolean(f11881c, false);
        }
        return new C0.b(bundle.getInt(f11882d), bundle.getCharSequence(f11883e), (PendingIntent) bundle.getParcelable(f11884f), bundle.getBundle(f11885g), d(i(bundle, f11886h)), d(i(bundle, f11887i)), z3, bundle.getInt(f11893o), bundle.getBoolean(f11894p), false, false);
    }

    private static Object[] h(Notification notification) {
        synchronized (f11898t) {
            if (!b()) {
                return null;
            }
            try {
                return (Object[]) f11899u.get(notification);
            } catch (IllegalAccessException e4) {
                Log.e(f11879a, "Unable to access notification actions", e4);
                f11903y = true;
                return null;
            }
        }
    }

    private static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Bundle[]) && parcelableArray != null) {
            Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
            bundle.putParcelableArray(str, bundleArr);
            return bundleArr;
        }
        return (Bundle[]) parcelableArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle j(C0.b bVar) {
        int i4;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat f4 = bVar.f();
        if (f4 != null) {
            i4 = f4.A();
        } else {
            i4 = 0;
        }
        bundle2.putInt(f11882d, i4);
        bundle2.putCharSequence(f11883e, bVar.j());
        bundle2.putParcelable(f11884f, bVar.a());
        if (bVar.d() != null) {
            bundle = new Bundle(bVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(f11881c, bVar.b());
        bundle2.putBundle(f11885g, bundle);
        bundle2.putParcelableArray(f11886h, n(bVar.g()));
        bundle2.putBoolean(f11894p, bVar.i());
        bundle2.putInt(f11893o, bVar.h());
        return bundle2;
    }

    public static Bundle k(Notification notification) {
        synchronized (f11895q) {
            if (f11897s) {
                return null;
            }
            try {
                if (f11896r == null) {
                    Field declaredField = Notification.class.getDeclaredField(f11885g);
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f11879a, "Notification.extras field is not of type Bundle");
                        f11897s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f11896r = declaredField;
                }
                Bundle bundle = (Bundle) f11896r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f11896r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e4) {
                Log.e(f11879a, "Unable to access notification extras", e4);
                f11897s = true;
                return null;
            } catch (NoSuchFieldException e5) {
                Log.e(f11879a, "Unable to access notification extras", e5);
                f11897s = true;
                return null;
            }
        }
    }

    public static C0.b l(int i4, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        v1[] v1VarArr;
        v1[] v1VarArr2;
        boolean z3;
        if (bundle != null) {
            v1VarArr = d(i(bundle, a1.f11873f));
            v1VarArr2 = d(i(bundle, f11880b));
            z3 = bundle.getBoolean(f11881c);
        } else {
            v1VarArr = null;
            v1VarArr2 = null;
            z3 = false;
        }
        return new C0.b(i4, charSequence, pendingIntent, bundle, v1VarArr, v1VarArr2, z3, 0, true, false, false);
    }

    private static Bundle m(v1 v1Var) {
        Bundle bundle = new Bundle();
        bundle.putString(f11888j, v1Var.o());
        bundle.putCharSequence("label", v1Var.n());
        bundle.putCharSequenceArray(f11890l, v1Var.h());
        bundle.putBoolean(f11891m, v1Var.f());
        bundle.putBundle(f11885g, v1Var.m());
        Set<String> g4 = v1Var.g();
        if (g4 != null && !g4.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(g4.size());
            Iterator<String> it = g4.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList(f11892n, arrayList);
        }
        return bundle;
    }

    private static Bundle[] n(v1[] v1VarArr) {
        if (v1VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[v1VarArr.length];
        for (int i4 = 0; i4 < v1VarArr.length; i4++) {
            bundleArr[i4] = m(v1VarArr[i4]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, C0.b bVar) {
        int i4;
        IconCompat f4 = bVar.f();
        if (f4 != null) {
            i4 = f4.A();
        } else {
            i4 = 0;
        }
        builder.addAction(i4, bVar.j(), bVar.a());
        Bundle bundle = new Bundle(bVar.d());
        if (bVar.g() != null) {
            bundle.putParcelableArray(a1.f11873f, n(bVar.g()));
        }
        if (bVar.c() != null) {
            bundle.putParcelableArray(f11880b, n(bVar.c()));
        }
        bundle.putBoolean(f11881c, bVar.b());
        return bundle;
    }
}
