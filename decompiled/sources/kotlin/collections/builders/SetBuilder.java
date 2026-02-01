package kotlin.collections.builders;

import Y2.h;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.E;
import kotlin.collections.AbstractC2093h;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001,B\u001b\b\u0000\u0012\u0010\u0010\"\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030 ¢\u0006\u0004\b'\u0010(B\t\b\u0016¢\u0006\u0004\b'\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020#¢\u0006\u0004\b'\u0010*J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u001e\u0010\"\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006-"}, d2 = {"Lkotlin/collections/builders/SetBuilder;", androidx.exifinterface.media.a.U4, "", "Lkotlin/collections/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "d", "()Ljava/lang/Object;", "", "c", "()Ljava/util/Set;", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "Lkotlin/H0;", "clear", "()V", com.google.android.gms.analytics.ecommerce.b.f27773d, com.google.android.gms.analytics.ecommerce.b.f27774e, "", "iterator", "()Ljava/util/Iterator;", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "removeAll", "retainAll", "Lkotlin/collections/builders/MapBuilder;", "Lkotlin/collections/builders/MapBuilder;", "backing", "", com.harman.log.b.f47574c, "()I", "size", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "initialCapacity", "(I)V", "F", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SetBuilder<E> extends AbstractC2093h<E> implements Set<E>, Serializable, h {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private static final a f51892F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private static final SetBuilder f51893G = new SetBuilder(MapBuilder.f51861R.e());

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final MapBuilder<E, ?> f51894E;

    /* loaded from: classes2.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public SetBuilder(@l3.d MapBuilder<E, ?> backing) {
        F.p(backing, "backing");
        this.f51894E = backing;
    }

    private final Object d() {
        if (this.f51894E.H()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractC2093h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e4) {
        if (this.f51894E.n(e4) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@l3.d Collection<? extends E> elements) {
        F.p(elements, "elements");
        this.f51894E.q();
        return super.addAll(elements);
    }

    @Override // kotlin.collections.AbstractC2093h
    public int b() {
        return this.f51894E.size();
    }

    @l3.d
    public final Set<E> c() {
        this.f51894E.p();
        if (size() > 0) {
            return this;
        }
        return f51893G;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f51894E.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f51894E.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f51894E.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l3.d
    public Iterator<E> iterator() {
        return this.f51894E.I();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f51894E.Q(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        this.f51894E.q();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        this.f51894E.q();
        return super.retainAll(elements);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i4) {
        this(new MapBuilder(i4));
    }
}
