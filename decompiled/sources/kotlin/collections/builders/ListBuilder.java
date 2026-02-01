package kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.E;
import kotlin.collections.AbstractC2088c;
import kotlin.collections.AbstractC2091f;
import kotlin.collections.C2100o;
import kotlin.collections.C2108v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0000\u0018\u0000 m*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0002nhBO\b\u0002\u0012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000M\u0012\u0006\u0010\\\u001a\u00020\u0010\u0012\u0006\u0010^\u001a\u00020\u0010\u0012\u0006\u0010a\u001a\u00020\u0018\u0012\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bj\u0010kB\t\b\u0016¢\u0006\u0004\bj\u0010\rB\u0011\b\u0016\u0012\u0006\u0010l\u001a\u00020\u0010¢\u0006\u0004\bj\u0010\u0013J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0019\u001a\u00020\u00182\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u001fJ-\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u001dJ5\u0010*\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010)\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b1\u0010%J \u00102\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u00105J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0096\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0006\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b;\u0010=J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010>\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u0010\u001fJ\u001d\u0010@\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b@\u0010AJ%\u0010@\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b@\u0010BJ\u000f\u0010C\u001a\u00020\u000bH\u0016¢\u0006\u0004\bC\u0010\rJ\u0017\u0010D\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\bD\u0010%J\u0017\u0010E\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bE\u0010?J\u001d\u0010F\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\bF\u0010AJ\u001d\u0010G\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\bG\u0010AJ%\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u0010H\u0016¢\u0006\u0004\bJ\u0010KJ)\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00010M\"\u0004\b\u0001\u0010L2\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00010MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0MH\u0016¢\u0006\u0004\bO\u0010QJ\u001a\u0010R\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\bR\u0010?J\u000f\u0010S\u001a\u00020\u0010H\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010XR\u0016\u0010\\\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R\u0016\u0010a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010bR\u001c\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010bR\u0014\u0010g\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010/R\u0014\u0010i\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010T¨\u0006o"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", androidx.exifinterface.media.a.U4, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", androidx.exifinterface.media.a.Y4, "()Ljava/lang/Object;", "Lkotlin/H0;", "w", "()V", "p", "q", "", "n", "t", "(I)V", "minCapacity", "s", "", "other", "", "r", "(Ljava/util/List;)Z", "i", "u", "(II)V", "element", "(ILjava/lang/Object;)V", "", "elements", "m", "(ILjava/util/Collection;I)V", "x", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "y", "retain", "z", "(IILjava/util/Collection;Z)I", "o", "()Ljava/util/List;", "isEmpty", "()Z", FirebaseAnalytics.b.f34777X, "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", com.google.android.gms.analytics.ecommerce.b.f27773d, "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "c", com.google.android.gms.analytics.ecommerce.b.f27774e, "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", androidx.exifinterface.media.a.f5, "", FirebaseAnalytics.b.f34818z, "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[Ljava/lang/Object;", "array", "F", "I", v.c.f7432R, "G", "length", "H", "Z", "isReadOnly", "Lkotlin/collections/builders/ListBuilder;", "backing", "J", "root", "v", "isEffectivelyReadOnly", com.harman.log.b.f47574c, "size", "<init>", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "initialCapacity", "K", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
/* loaded from: classes2.dex */
public final class ListBuilder<E> extends AbstractC2091f<E> implements List<E>, RandomAccess, Serializable, Y2.e {

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private static final a f51849K = new a(null);

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private static final ListBuilder f51850L;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private E[] f51851E;

    /* renamed from: F, reason: collision with root package name */
    private int f51852F;

    /* renamed from: G, reason: collision with root package name */
    private int f51853G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f51854H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private final ListBuilder<E> f51855I;

    /* renamed from: J, reason: collision with root package name */
    @l3.e
    private final ListBuilder<E> f51856J;

    /* loaded from: classes2.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @U({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b<E> implements ListIterator<E>, Y2.f {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final ListBuilder<E> f51857E;

        /* renamed from: F, reason: collision with root package name */
        private int f51858F;

        /* renamed from: G, reason: collision with root package name */
        private int f51859G;

        /* renamed from: H, reason: collision with root package name */
        private int f51860H;

        public b(@l3.d ListBuilder<E> list, int i4) {
            F.p(list, "list");
            this.f51857E = list;
            this.f51858F = i4;
            this.f51859G = -1;
            this.f51860H = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.f51857E).modCount == this.f51860H) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e4) {
            b();
            ListBuilder<E> listBuilder = this.f51857E;
            int i4 = this.f51858F;
            this.f51858F = i4 + 1;
            listBuilder.add(i4, e4);
            this.f51859G = -1;
            this.f51860H = ((AbstractList) this.f51857E).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f51858F < ((ListBuilder) this.f51857E).f51853G) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f51858F > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (this.f51858F < ((ListBuilder) this.f51857E).f51853G) {
                int i4 = this.f51858F;
                this.f51858F = i4 + 1;
                this.f51859G = i4;
                return (E) ((ListBuilder) this.f51857E).f51851E[((ListBuilder) this.f51857E).f51852F + this.f51859G];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f51858F;
        }

        @Override // java.util.ListIterator
        public E previous() {
            b();
            int i4 = this.f51858F;
            if (i4 > 0) {
                int i5 = i4 - 1;
                this.f51858F = i5;
                this.f51859G = i5;
                return (E) ((ListBuilder) this.f51857E).f51851E[((ListBuilder) this.f51857E).f51852F + this.f51859G];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f51858F - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i4 = this.f51859G;
            if (i4 != -1) {
                this.f51857E.remove(i4);
                this.f51858F = this.f51859G;
                this.f51859G = -1;
                this.f51860H = ((AbstractList) this.f51857E).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e4) {
            b();
            int i4 = this.f51859G;
            if (i4 != -1) {
                this.f51857E.set(i4, e4);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f51854H = true;
        f51850L = listBuilder;
    }

    private ListBuilder(E[] eArr, int i4, int i5, boolean z3, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.f51851E = eArr;
        this.f51852F = i4;
        this.f51853G = i5;
        this.f51854H = z3;
        this.f51855I = listBuilder;
        this.f51856J = listBuilder2;
        if (listBuilder != null) {
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }
    }

    private final Object A() {
        if (v()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    private final void m(int i4, Collection<? extends E> collection, int i5) {
        w();
        ListBuilder<E> listBuilder = this.f51855I;
        if (listBuilder != null) {
            listBuilder.m(i4, collection, i5);
            this.f51851E = this.f51855I.f51851E;
            this.f51853G += i5;
        } else {
            u(i4, i5);
            Iterator<? extends E> it = collection.iterator();
            for (int i6 = 0; i6 < i5; i6++) {
                this.f51851E[i4 + i6] = it.next();
            }
        }
    }

    private final void n(int i4, E e4) {
        w();
        ListBuilder<E> listBuilder = this.f51855I;
        if (listBuilder != null) {
            listBuilder.n(i4, e4);
            this.f51851E = this.f51855I.f51851E;
            this.f51853G++;
        } else {
            u(i4, 1);
            this.f51851E[i4] = e4;
        }
    }

    private final void p() {
        ListBuilder<E> listBuilder = this.f51856J;
        if (listBuilder != null && ((AbstractList) listBuilder).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void q() {
        if (!v()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean r(List<?> list) {
        boolean h4;
        h4 = kotlin.collections.builders.b.h(this.f51851E, this.f51852F, this.f51853G, list);
        return h4;
    }

    private final void s(int i4) {
        if (i4 >= 0) {
            E[] eArr = this.f51851E;
            if (i4 > eArr.length) {
                this.f51851E = (E[]) kotlin.collections.builders.b.e(this.f51851E, AbstractC2088c.f51901E.e(eArr.length, i4));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void t(int i4) {
        s(this.f51853G + i4);
    }

    private final void u(int i4, int i5) {
        t(i5);
        E[] eArr = this.f51851E;
        C2100o.B0(eArr, eArr, i4 + i5, i4, this.f51852F + this.f51853G);
        this.f51853G += i5;
    }

    private final boolean v() {
        ListBuilder<E> listBuilder;
        if (!this.f51854H && ((listBuilder = this.f51856J) == null || !listBuilder.f51854H)) {
            return false;
        }
        return true;
    }

    private final void w() {
        ((AbstractList) this).modCount++;
    }

    private final E x(int i4) {
        w();
        ListBuilder<E> listBuilder = this.f51855I;
        if (listBuilder != null) {
            this.f51853G--;
            return listBuilder.x(i4);
        }
        E[] eArr = this.f51851E;
        E e4 = eArr[i4];
        C2100o.B0(eArr, eArr, i4, i4 + 1, this.f51852F + this.f51853G);
        kotlin.collections.builders.b.f(this.f51851E, (this.f51852F + this.f51853G) - 1);
        this.f51853G--;
        return e4;
    }

    private final void y(int i4, int i5) {
        if (i5 > 0) {
            w();
        }
        ListBuilder<E> listBuilder = this.f51855I;
        if (listBuilder != null) {
            listBuilder.y(i4, i5);
        } else {
            E[] eArr = this.f51851E;
            C2100o.B0(eArr, eArr, i4, i4 + i5, this.f51853G);
            E[] eArr2 = this.f51851E;
            int i6 = this.f51853G;
            kotlin.collections.builders.b.g(eArr2, i6 - i5, i6);
        }
        this.f51853G -= i5;
    }

    private final int z(int i4, int i5, Collection<? extends E> collection, boolean z3) {
        int i6;
        ListBuilder<E> listBuilder = this.f51855I;
        if (listBuilder != null) {
            i6 = listBuilder.z(i4, i5, collection, z3);
        } else {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i5) {
                int i9 = i4 + i7;
                if (collection.contains(this.f51851E[i9]) == z3) {
                    E[] eArr = this.f51851E;
                    i7++;
                    eArr[i8 + i4] = eArr[i9];
                    i8++;
                } else {
                    i7++;
                }
            }
            int i10 = i5 - i8;
            E[] eArr2 = this.f51851E;
            C2100o.B0(eArr2, eArr2, i4 + i8, i5 + i4, this.f51853G);
            E[] eArr3 = this.f51851E;
            int i11 = this.f51853G;
            kotlin.collections.builders.b.g(eArr3, i11 - i10, i11);
            i6 = i10;
        }
        if (i6 > 0) {
            w();
        }
        this.f51853G -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        q();
        p();
        n(this.f51852F + this.f51853G, e4);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@l3.d Collection<? extends E> elements) {
        F.p(elements, "elements");
        q();
        p();
        int size = elements.size();
        m(this.f51852F + this.f51853G, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC2091f
    public int b() {
        p();
        return this.f51853G;
    }

    @Override // kotlin.collections.AbstractC2091f
    public E c(int i4) {
        q();
        p();
        AbstractC2088c.f51901E.b(i4, this.f51853G);
        return x(this.f51852F + i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        q();
        p();
        y(this.f51852F, this.f51853G);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@l3.e Object obj) {
        p();
        if (obj != this && (!(obj instanceof List) || !r((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i4) {
        p();
        AbstractC2088c.f51901E.b(i4, this.f51853G);
        return this.f51851E[this.f51852F + i4];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i4;
        p();
        i4 = kotlin.collections.builders.b.i(this.f51851E, this.f51852F, this.f51853G);
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        p();
        for (int i4 = 0; i4 < this.f51853G; i4++) {
            if (F.g(this.f51851E[this.f51852F + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        p();
        if (this.f51853G == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @l3.d
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        p();
        for (int i4 = this.f51853G - 1; i4 >= 0; i4--) {
            if (F.g(this.f51851E[this.f51852F + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @l3.d
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @l3.d
    public final List<E> o() {
        if (this.f51855I == null) {
            q();
            this.f51854H = true;
            if (this.f51853G > 0) {
                return this;
            }
            return f51850L;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        q();
        p();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        q();
        p();
        if (z(this.f51852F, this.f51853G, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        q();
        p();
        if (z(this.f51852F, this.f51853G, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC2091f, java.util.AbstractList, java.util.List
    public E set(int i4, E e4) {
        q();
        p();
        AbstractC2088c.f51901E.b(i4, this.f51853G);
        E[] eArr = this.f51851E;
        int i5 = this.f51852F;
        E e5 = eArr[i5 + i4];
        eArr[i5 + i4] = e4;
        return e5;
    }

    @Override // java.util.AbstractList, java.util.List
    @l3.d
    public List<E> subList(int i4, int i5) {
        ListBuilder<E> listBuilder;
        AbstractC2088c.f51901E.d(i4, i5, this.f51853G);
        E[] eArr = this.f51851E;
        int i6 = this.f51852F + i4;
        int i7 = i5 - i4;
        boolean z3 = this.f51854H;
        ListBuilder<E> listBuilder2 = this.f51856J;
        if (listBuilder2 == null) {
            listBuilder = this;
        } else {
            listBuilder = listBuilder2;
        }
        return new ListBuilder(eArr, i6, i7, z3, this, listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l3.d
    public <T> T[] toArray(@l3.d T[] destination) {
        Object[] n4;
        F.p(destination, "destination");
        p();
        int length = destination.length;
        int i4 = this.f51853G;
        if (length < i4) {
            E[] eArr = this.f51851E;
            int i5 = this.f51852F;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i5, i4 + i5, destination.getClass());
            F.o(tArr, "copyOfRange(...)");
            return tArr;
        }
        E[] eArr2 = this.f51851E;
        int i6 = this.f51852F;
        C2100o.B0(eArr2, destination, 0, i6, i4 + i6);
        n4 = C2108v.n(this.f51853G, destination);
        return (T[]) n4;
    }

    @Override // java.util.AbstractCollection
    @l3.d
    public String toString() {
        String j4;
        p();
        j4 = kotlin.collections.builders.b.j(this.f51851E, this.f51852F, this.f51853G, this);
        return j4;
    }

    @Override // java.util.AbstractList, java.util.List
    @l3.d
    public ListIterator<E> listIterator(int i4) {
        p();
        AbstractC2088c.f51901E.c(i4, this.f51853G);
        return new b(this, i4);
    }

    @Override // kotlin.collections.AbstractC2091f, java.util.AbstractList, java.util.List
    public void add(int i4, E e4) {
        q();
        p();
        AbstractC2088c.f51901E.c(i4, this.f51853G);
        n(this.f51852F + i4, e4);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, @l3.d Collection<? extends E> elements) {
        F.p(elements, "elements");
        q();
        p();
        AbstractC2088c.f51901E.c(i4, this.f51853G);
        int size = elements.size();
        m(this.f51852F + i4, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l3.d
    public Object[] toArray() {
        Object[] l12;
        p();
        E[] eArr = this.f51851E;
        int i4 = this.f51852F;
        l12 = C2100o.l1(eArr, i4, this.f51853G + i4);
        return l12;
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i4) {
        this(kotlin.collections.builders.b.d(i4), 0, 0, false, null, null);
    }
}
