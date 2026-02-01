package androidx.databinding;

import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class MergedDataBinderMapper extends k {

    /* renamed from: d, reason: collision with root package name */
    private static final String f13954d = "MergedDataBinderMapper";

    /* renamed from: a, reason: collision with root package name */
    private Set<Class<? extends k>> f13955a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private List<k> f13956b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List<String> f13957c = new CopyOnWriteArrayList();

    private boolean h() {
        boolean z3 = false;
        for (String str : this.f13957c) {
            try {
                Class<?> cls = Class.forName(str);
                if (k.class.isAssignableFrom(cls)) {
                    f((k) cls.newInstance());
                    this.f13957c.remove(str);
                    z3 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e4) {
                Log.e(f13954d, "unable to add feature mapper for " + str, e4);
            } catch (InstantiationException e5) {
                Log.e(f13954d, "unable to add feature mapper for " + str, e5);
            }
        }
        return z3;
    }

    @Override // androidx.databinding.k
    public String b(int i4) {
        Iterator<k> it = this.f13956b.iterator();
        while (it.hasNext()) {
            String b4 = it.next().b(i4);
            if (b4 != null) {
                return b4;
            }
        }
        if (h()) {
            return b(i4);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public ViewDataBinding c(l lVar, View view, int i4) {
        Iterator<k> it = this.f13956b.iterator();
        while (it.hasNext()) {
            ViewDataBinding c4 = it.next().c(lVar, view, i4);
            if (c4 != null) {
                return c4;
            }
        }
        if (h()) {
            return c(lVar, view, i4);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public ViewDataBinding d(l lVar, View[] viewArr, int i4) {
        Iterator<k> it = this.f13956b.iterator();
        while (it.hasNext()) {
            ViewDataBinding d4 = it.next().d(lVar, viewArr, i4);
            if (d4 != null) {
                return d4;
            }
        }
        if (h()) {
            return d(lVar, viewArr, i4);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Iterator<k> it = this.f13956b.iterator();
        while (it.hasNext()) {
            int e4 = it.next().e(str);
            if (e4 != 0) {
                return e4;
            }
        }
        if (h()) {
            return e(str);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(k kVar) {
        if (this.f13955a.add(kVar.getClass())) {
            this.f13956b.add(kVar);
            Iterator<k> it = kVar.a().iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    protected void g(String str) {
        this.f13957c.add(str + ".DataBinderMapperImpl");
    }
}
