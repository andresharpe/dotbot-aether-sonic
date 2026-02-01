package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f52309a;

    public V(int i4) {
        this.f52309a = new ArrayList<>(i4);
    }

    public void a(Object obj) {
        this.f52309a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f52309a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f52309a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f52309a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f52309a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f52309a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f52309a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f52309a.toArray(objArr);
    }
}
