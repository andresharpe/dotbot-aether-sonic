package androidx.fragment.app;

import android.view.View;
import androidx.core.app.y1;
import androidx.transition.C0982p;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    static final J f15164a = new I();

    /* renamed from: b, reason: collision with root package name */
    static final J f15165b = c();

    private H() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, Fragment fragment2, boolean z3, androidx.collection.a<String, View> aVar, boolean z4) {
        y1 i4;
        int size;
        if (z3) {
            i4 = fragment2.i();
        } else {
            i4 = fragment.i();
        }
        if (i4 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.size();
            }
            for (int i5 = 0; i5 < size; i5++) {
                arrayList2.add(aVar.m(i5));
                arrayList.add(aVar.q(i5));
            }
            if (z4) {
                i4.g(arrayList2, arrayList, null);
            } else {
                i4.f(arrayList2, arrayList, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(androidx.collection.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (str.equals(aVar.q(i4))) {
                return aVar.m(i4);
            }
        }
        return null;
    }

    private static J c() {
        try {
            return (J) C0982p.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(@androidx.annotation.N androidx.collection.a<String, String> aVar, @androidx.annotation.N androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.q(size))) {
                aVar.o(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ArrayList<View> arrayList, int i4) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        if (f15164a == null && f15165b == null) {
            return false;
        }
        return true;
    }
}
