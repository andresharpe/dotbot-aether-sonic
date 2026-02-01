package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C2196t;

@kotlin.E(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000e¨\u0006&"}, d2 = {"Lkotlin/collections/EmptySet;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "j", "()Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "element", "c", "(Ljava/lang/Void;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "F", "J", "serialVersionUID", "d", "size", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EmptySet implements Set, Serializable, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    public static final EmptySet f51829E = new EmptySet();

    /* renamed from: F, reason: collision with root package name */
    private static final long f51830F = 3406603774387020532L;

    private EmptySet() {
    }

    private final Object j() {
        return f51829E;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(@l3.d Void element) {
        kotlin.jvm.internal.F.p(element, "element");
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return c((Void) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@l3.d Collection elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return elements.isEmpty();
    }

    public int d() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@l3.e Object obj) {
        if ((obj instanceof Set) && ((Set) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator iterator() {
        return F.f51831E;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C2196t.a(this);
    }

    @l3.d
    public String toString() {
        return "[]";
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.F.p(array, "array");
        return (T[]) C2196t.b(this, array);
    }
}
