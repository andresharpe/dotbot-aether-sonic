package androidx.databinding;

import androidx.databinding.w;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class ObservableArrayList<T> extends ArrayList<T> implements w<T> {

    /* renamed from: E, reason: collision with root package name */
    private transient s f13958E = new s();

    private void b(int i4, int i5) {
        s sVar = this.f13958E;
        if (sVar != null) {
            sVar.w(this, i4, i5);
        }
    }

    private void d(int i4, int i5) {
        s sVar = this.f13958E;
        if (sVar != null) {
            sVar.y(this, i4, i5);
        }
    }

    @Override // androidx.databinding.w
    public void G(w.a aVar) {
        if (this.f13958E == null) {
            this.f13958E = new s();
        }
        this.f13958E.a(aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t3) {
        super.add(t3);
        b(size() - 1, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            b(size, size() - size);
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            d(0, size);
        }
    }

    @Override // androidx.databinding.w
    public void h(w.a aVar) {
        s sVar = this.f13958E;
        if (sVar != null) {
            sVar.o(aVar);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i4) {
        T t3 = (T) super.remove(i4);
        d(i4, 1);
        return t3;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i4, int i5) {
        super.removeRange(i4, i5);
        d(i4, i5 - i4);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i4, T t3) {
        T t4 = (T) super.set(i4, t3);
        s sVar = this.f13958E;
        if (sVar != null) {
            sVar.u(this, i4, 1);
        }
        return t4;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i4, T t3) {
        super.add(i4, t3);
        b(i4, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i4, collection);
        if (addAll) {
            b(i4, collection.size());
        }
        return addAll;
    }
}
