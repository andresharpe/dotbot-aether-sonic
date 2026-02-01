package kotlin.collections.builders;

import Y2.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.u;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.E;
import kotlin.collections.AbstractC2088c;
import kotlin.collections.C2100o;
import kotlin.collections.P;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.ranges.l;

@E(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0000\u0018\u0000 $*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\f\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001BI\b\u0002\u0012\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u000e\u0010\\\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0015\u0012\u0006\u0010_\u001a\u00020]\u0012\u0006\u0010a\u001a\u00020]\u0012\u0006\u0010b\u001a\u00020\u000b\u0012\u0006\u0010c\u001a\u00020\u000b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001B\n\b\u0016¢\u0006\u0005\b\u0081\u0001\u0010\nB\u0013\b\u0016\u0012\u0007\u0010\u0083\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u0081\u0001\u0010\u000eJ\u000f\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0002\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\"\u0010\u001aJ\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b$\u0010\u000eJ\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u001f\u0010)\u001a\u00020\u00102\u000e\u0010(\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030'H\u0002¢\u0006\u0004\b)\u0010*J#\u0010\u0001\u001a\u00020\u00102\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+H\u0002¢\u0006\u0004\b\u0001\u0010-J)\u00100\u001a\u00020\u00102\u0018\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0.H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00102\u0006\u0010!\u001a\u00028\u0001H\u0016¢\u0006\u0004\b8\u00107J\u001a\u00109\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u0001H\u0016¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\b2\u0014\u0010/\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010:J\u000f\u0010@\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010\nJ\u001a\u0010A\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\bA\u00107J\u000f\u0010B\u001a\u00020\u000bH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\bH\u0000¢\u0006\u0004\bG\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\u001aJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0000¢\u0006\u0004\bH\u0010\u001aJ#\u0010I\u001a\u00020\u00102\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+H\u0000¢\u0006\u0004\bI\u0010-J\u001b\u0010K\u001a\u00020\u00102\n\u0010J\u001a\u0006\u0012\u0002\b\u00030.H\u0000¢\u0006\u0004\bK\u00101J#\u0010L\u001a\u00020\u00102\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+H\u0000¢\u0006\u0004\bL\u0010-J\u0017\u0010N\u001a\u00020\u00102\u0006\u0010M\u001a\u00028\u0001H\u0000¢\u0006\u0004\bN\u00107J\u001b\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010OH\u0000¢\u0006\u0004\bP\u0010QJ\u001b\u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010RH\u0000¢\u0006\u0004\bS\u0010TJ\u001b\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010UH\u0000¢\u0006\u0004\bV\u0010WR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001e\u0010\\\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010_\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010^R\u0016\u0010a\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010PR\u0016\u0010c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010PR\u0016\u0010d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010PR\u0016\u0010e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010PR$\u0010g\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u000b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bX\u0010CR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010iR\u001e\u0010m\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010lR$\u0010p\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010oR$\u0010r\u001a\u00020\u00102\u0006\u0010f\u001a\u00020\u00108\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bH\u0010q\u001a\u0004\b`\u00105R\u0014\u0010t\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010CR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00010y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010zR&\u0010~\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|0u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010wR\u0015\u0010\u0080\u0001\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010C¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", androidx.exifinterface.media.a.Z4, "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "()Ljava/lang/Object;", "Lkotlin/H0;", "M", "()V", "", "n", "w", "(I)V", "extraCapacity", "", androidx.exifinterface.media.a.f5, "(I)Z", "minCapacity", "v", "", "o", "()[Ljava/lang/Object;", "key", "G", "(Ljava/lang/Object;)I", "r", "newHashSize", "N", "i", "L", "y", "value", "z", FirebaseAnalytics.b.f34777X, "R", "removedHash", "P", "", "other", "u", "(Ljava/util/Map;)Z", "", "entry", "(Ljava/util/Map$Entry;)Z", "", "from", "J", "(Ljava/util/Collection;)Z", "p", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", com.google.android.gms.analytics.ecommerce.b.f27774e, "clear", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "q", "Q", "t", "m", "s", "O", "element", androidx.exifinterface.media.a.T4, "Lkotlin/collections/builders/MapBuilder$e;", "I", "()Lkotlin/collections/builders/MapBuilder$e;", "Lkotlin/collections/builders/MapBuilder$f;", "U", "()Lkotlin/collections/builders/MapBuilder$f;", "Lkotlin/collections/builders/MapBuilder$b;", "x", "()Lkotlin/collections/builders/MapBuilder$b;", androidx.exifinterface.media.a.U4, "[Ljava/lang/Object;", "keysArray", "F", "valuesArray", "", "[I", "presenceArray", "H", "hashArray", "maxProbeDistance", "length", "hashShift", "modCount", "<set-?>", "size", "Lkotlin/collections/builders/d;", "Lkotlin/collections/builders/d;", "keysView", "Lkotlin/collections/builders/e;", "Lkotlin/collections/builders/e;", "valuesView", "Lkotlin/collections/builders/c;", "Lkotlin/collections/builders/c;", "entriesView", "Z", "isReadOnly", "C", "hashSize", "", "D", "()Ljava/util/Set;", "keys", "", "()Ljava/util/Collection;", "values", "", "B", u.c.f37791i0, androidx.exifinterface.media.a.Y4, "capacity", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "a", com.harman.log.b.f47574c, "c", "d", "e", "f", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
/* loaded from: classes2.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, g {

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    public static final a f51861R = new a(null);

    /* renamed from: S, reason: collision with root package name */
    private static final int f51862S = -1640531527;

    /* renamed from: T, reason: collision with root package name */
    private static final int f51863T = 8;

    /* renamed from: U, reason: collision with root package name */
    private static final int f51864U = 2;

    /* renamed from: V, reason: collision with root package name */
    private static final int f51865V = -1;

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private static final MapBuilder f51866W;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private K[] f51867E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private V[] f51868F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private int[] f51869G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private int[] f51870H;

    /* renamed from: I, reason: collision with root package name */
    private int f51871I;

    /* renamed from: J, reason: collision with root package name */
    private int f51872J;

    /* renamed from: K, reason: collision with root package name */
    private int f51873K;

    /* renamed from: L, reason: collision with root package name */
    private int f51874L;

    /* renamed from: M, reason: collision with root package name */
    private int f51875M;

    /* renamed from: N, reason: collision with root package name */
    @l3.e
    private kotlin.collections.builders.d<K> f51876N;

    /* renamed from: O, reason: collision with root package name */
    @l3.e
    private kotlin.collections.builders.e<V> f51877O;

    /* renamed from: P, reason: collision with root package name */
    @l3.e
    private kotlin.collections.builders.c<K, V> f51878P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f51879Q;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i4) {
            int u3;
            u3 = kotlin.ranges.u.u(i4, 1);
            return Integer.highestOneBit(u3 * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i4) {
            return Integer.numberOfLeadingZeros(i4) + 1;
        }

        @l3.d
        public final MapBuilder e() {
            return MapBuilder.f51866W;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, Y2.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d MapBuilder<K, V> map) {
            super(map);
            F.p(map, "map");
        }

        @Override // java.util.Iterator
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            b();
            if (c() < ((MapBuilder) e()).f51872J) {
                int c4 = c();
                i(c4 + 1);
                j(c4);
                c<K, V> cVar = new c<>(e(), d());
                h();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void l(@l3.d StringBuilder sb) {
            F.p(sb, "sb");
            if (c() < ((MapBuilder) e()).f51872J) {
                int c4 = c();
                i(c4 + 1);
                j(c4);
                Object obj = ((MapBuilder) e()).f51867E[d()];
                if (obj == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = ((MapBuilder) e()).f51868F;
                F.m(objArr);
                Object obj2 = objArr[d()];
                if (obj2 == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                h();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int m() {
            int i4;
            if (c() < ((MapBuilder) e()).f51872J) {
                int c4 = c();
                i(c4 + 1);
                j(c4);
                Object obj = ((MapBuilder) e()).f51867E[d()];
                int i5 = 0;
                if (obj != null) {
                    i4 = obj.hashCode();
                } else {
                    i4 = 0;
                }
                Object[] objArr = ((MapBuilder) e()).f51868F;
                F.m(objArr);
                Object obj2 = objArr[d()];
                if (obj2 != null) {
                    i5 = obj2.hashCode();
                }
                int i6 = i4 ^ i5;
                h();
                return i6;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final MapBuilder<K, V> f51880E;

        /* renamed from: F, reason: collision with root package name */
        private final int f51881F;

        public c(@l3.d MapBuilder<K, V> map, int i4) {
            F.p(map, "map");
            this.f51880E = map;
            this.f51881F = i4;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@l3.e Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (F.g(entry.getKey(), getKey()) && F.g(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((MapBuilder) this.f51880E).f51867E[this.f51881F];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((MapBuilder) this.f51880E).f51868F;
            F.m(objArr);
            return (V) objArr[this.f51881F];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i4;
            K key = getKey();
            int i5 = 0;
            if (key != null) {
                i4 = key.hashCode();
            } else {
                i4 = 0;
            }
            V value = getValue();
            if (value != null) {
                i5 = value.hashCode();
            }
            return i4 ^ i5;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            this.f51880E.q();
            Object[] o4 = this.f51880E.o();
            int i4 = this.f51881F;
            V v4 = (V) o4[i4];
            o4[i4] = v3;
            return v4;
        }

        @l3.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @U({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
    /* loaded from: classes2.dex */
    public static class d<K, V> {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final MapBuilder<K, V> f51882E;

        /* renamed from: F, reason: collision with root package name */
        private int f51883F;

        /* renamed from: G, reason: collision with root package name */
        private int f51884G;

        /* renamed from: H, reason: collision with root package name */
        private int f51885H;

        public d(@l3.d MapBuilder<K, V> map) {
            F.p(map, "map");
            this.f51882E = map;
            this.f51884G = -1;
            this.f51885H = ((MapBuilder) map).f51874L;
            h();
        }

        public final void b() {
            if (((MapBuilder) this.f51882E).f51874L == this.f51885H) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.f51883F;
        }

        public final int d() {
            return this.f51884G;
        }

        @l3.d
        public final MapBuilder<K, V> e() {
            return this.f51882E;
        }

        public final void h() {
            while (this.f51883F < ((MapBuilder) this.f51882E).f51872J) {
                int[] iArr = ((MapBuilder) this.f51882E).f51869G;
                int i4 = this.f51883F;
                if (iArr[i4] < 0) {
                    this.f51883F = i4 + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            if (this.f51883F < ((MapBuilder) this.f51882E).f51872J) {
                return true;
            }
            return false;
        }

        public final void i(int i4) {
            this.f51883F = i4;
        }

        public final void j(int i4) {
            this.f51884G = i4;
        }

        public final void remove() {
            b();
            if (this.f51884G != -1) {
                this.f51882E.q();
                this.f51882E.R(this.f51884G);
                this.f51884G = -1;
                this.f51885H = ((MapBuilder) this.f51882E).f51874L;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, Y2.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@l3.d MapBuilder<K, V> map) {
            super(map);
            F.p(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            b();
            if (c() < ((MapBuilder) e()).f51872J) {
                int c4 = c();
                i(c4 + 1);
                j(c4);
                K k4 = (K) ((MapBuilder) e()).f51867E[d()];
                h();
                return k4;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, Y2.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@l3.d MapBuilder<K, V> map) {
            super(map);
            F.p(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            b();
            if (c() < ((MapBuilder) e()).f51872J) {
                int c4 = c();
                i(c4 + 1);
                j(c4);
                Object[] objArr = ((MapBuilder) e()).f51868F;
                F.m(objArr);
                V v3 = (V) objArr[d()];
                h();
                return v3;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.f51879Q = true;
        f51866W = mapBuilder;
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i4, int i5) {
        this.f51867E = kArr;
        this.f51868F = vArr;
        this.f51869G = iArr;
        this.f51870H = iArr2;
        this.f51871I = i4;
        this.f51872J = i5;
        this.f51873K = f51861R.d(C());
    }

    private final int C() {
        return this.f51870H.length;
    }

    private final int G(K k4) {
        int i4;
        if (k4 != null) {
            i4 = k4.hashCode();
        } else {
            i4 = 0;
        }
        return (i4 * f51862S) >>> this.f51873K;
    }

    private final boolean J(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z3 = false;
        if (collection.isEmpty()) {
            return false;
        }
        w(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (K(it.next())) {
                z3 = true;
            }
        }
        return z3;
    }

    private final boolean K(Map.Entry<? extends K, ? extends V> entry) {
        int n4 = n(entry.getKey());
        V[] o4 = o();
        if (n4 >= 0) {
            o4[n4] = entry.getValue();
            return true;
        }
        int i4 = (-n4) - 1;
        if (!F.g(entry.getValue(), o4[i4])) {
            o4[i4] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean L(int i4) {
        int G3 = G(this.f51867E[i4]);
        int i5 = this.f51871I;
        while (true) {
            int[] iArr = this.f51870H;
            if (iArr[G3] == 0) {
                iArr[G3] = i4 + 1;
                this.f51869G[i4] = G3;
                return true;
            }
            i5--;
            if (i5 < 0) {
                return false;
            }
            int i6 = G3 - 1;
            if (G3 == 0) {
                G3 = C() - 1;
            } else {
                G3 = i6;
            }
        }
    }

    private final void M() {
        this.f51874L++;
    }

    private final void N(int i4) {
        M();
        if (this.f51872J > size()) {
            r();
        }
        int i5 = 0;
        if (i4 == C()) {
            C2100o.K1(this.f51870H, 0, 0, C());
        } else {
            this.f51870H = new int[i4];
            this.f51873K = f51861R.d(i4);
        }
        while (i5 < this.f51872J) {
            int i6 = i5 + 1;
            if (L(i5)) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final void P(int i4) {
        int B3;
        B3 = kotlin.ranges.u.B(this.f51871I * 2, C() / 2);
        int i5 = B3;
        int i6 = 0;
        int i7 = i4;
        do {
            int i8 = i4 - 1;
            if (i4 == 0) {
                i4 = C() - 1;
            } else {
                i4 = i8;
            }
            i6++;
            if (i6 > this.f51871I) {
                this.f51870H[i7] = 0;
                return;
            }
            int[] iArr = this.f51870H;
            int i9 = iArr[i4];
            if (i9 == 0) {
                iArr[i7] = 0;
                return;
            }
            if (i9 < 0) {
                iArr[i7] = -1;
            } else {
                int i10 = i9 - 1;
                if (((G(this.f51867E[i10]) - i4) & (C() - 1)) >= i6) {
                    this.f51870H[i7] = i9;
                    this.f51869G[i10] = i7;
                }
                i5--;
            }
            i7 = i4;
            i6 = 0;
            i5--;
        } while (i5 >= 0);
        this.f51870H[i7] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(int i4) {
        kotlin.collections.builders.b.f(this.f51867E, i4);
        P(this.f51869G[i4]);
        this.f51869G[i4] = -1;
        this.f51875M = size() - 1;
        M();
    }

    private final boolean T(int i4) {
        int A3 = A();
        int i5 = this.f51872J;
        int i6 = A3 - i5;
        int size = i5 - size();
        if (i6 < i4 && i6 + size >= i4 && size >= A() / 4) {
            return true;
        }
        return false;
    }

    private final Object V() {
        if (this.f51879Q) {
            return new kotlin.collections.builders.f(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] o() {
        V[] vArr = this.f51868F;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) kotlin.collections.builders.b.d(A());
        this.f51868F = vArr2;
        return vArr2;
    }

    private final void r() {
        int i4;
        V[] vArr = this.f51868F;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.f51872J;
            if (i5 >= i4) {
                break;
            }
            if (this.f51869G[i5] >= 0) {
                K[] kArr = this.f51867E;
                kArr[i6] = kArr[i5];
                if (vArr != null) {
                    vArr[i6] = vArr[i5];
                }
                i6++;
            }
            i5++;
        }
        kotlin.collections.builders.b.g(this.f51867E, i6, i4);
        if (vArr != null) {
            kotlin.collections.builders.b.g(vArr, i6, this.f51872J);
        }
        this.f51872J = i6;
    }

    private final boolean u(Map<?, ?> map) {
        if (size() == map.size() && s(map.entrySet())) {
            return true;
        }
        return false;
    }

    private final void v(int i4) {
        V[] vArr;
        if (i4 >= 0) {
            if (i4 > A()) {
                int e4 = AbstractC2088c.f51901E.e(A(), i4);
                this.f51867E = (K[]) kotlin.collections.builders.b.e(this.f51867E, e4);
                V[] vArr2 = this.f51868F;
                if (vArr2 != null) {
                    vArr = (V[]) kotlin.collections.builders.b.e(vArr2, e4);
                } else {
                    vArr = null;
                }
                this.f51868F = vArr;
                int[] copyOf = Arrays.copyOf(this.f51869G, e4);
                F.o(copyOf, "copyOf(...)");
                this.f51869G = copyOf;
                int c4 = f51861R.c(e4);
                if (c4 > C()) {
                    N(c4);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void w(int i4) {
        if (T(i4)) {
            N(C());
        } else {
            v(this.f51872J + i4);
        }
    }

    private final int y(K k4) {
        int G3 = G(k4);
        int i4 = this.f51871I;
        while (true) {
            int i5 = this.f51870H[G3];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (F.g(this.f51867E[i6], k4)) {
                    return i6;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            int i7 = G3 - 1;
            if (G3 == 0) {
                G3 = C() - 1;
            } else {
                G3 = i7;
            }
        }
    }

    private final int z(V v3) {
        int i4 = this.f51872J;
        while (true) {
            i4--;
            if (i4 < 0) {
                return -1;
            }
            if (this.f51869G[i4] >= 0) {
                V[] vArr = this.f51868F;
                F.m(vArr);
                if (F.g(vArr[i4], v3)) {
                    return i4;
                }
            }
        }
    }

    public final int A() {
        return this.f51867E.length;
    }

    @l3.d
    public Set<Map.Entry<K, V>> B() {
        kotlin.collections.builders.c<K, V> cVar = this.f51878P;
        if (cVar == null) {
            kotlin.collections.builders.c<K, V> cVar2 = new kotlin.collections.builders.c<>(this);
            this.f51878P = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @l3.d
    public Set<K> D() {
        kotlin.collections.builders.d<K> dVar = this.f51876N;
        if (dVar == null) {
            kotlin.collections.builders.d<K> dVar2 = new kotlin.collections.builders.d<>(this);
            this.f51876N = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public int E() {
        return this.f51875M;
    }

    @l3.d
    public Collection<V> F() {
        kotlin.collections.builders.e<V> eVar = this.f51877O;
        if (eVar == null) {
            kotlin.collections.builders.e<V> eVar2 = new kotlin.collections.builders.e<>(this);
            this.f51877O = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final boolean H() {
        return this.f51879Q;
    }

    @l3.d
    public final e<K, V> I() {
        return new e<>(this);
    }

    public final boolean O(@l3.d Map.Entry<? extends K, ? extends V> entry) {
        F.p(entry, "entry");
        q();
        int y3 = y(entry.getKey());
        if (y3 < 0) {
            return false;
        }
        V[] vArr = this.f51868F;
        F.m(vArr);
        if (!F.g(vArr[y3], entry.getValue())) {
            return false;
        }
        R(y3);
        return true;
    }

    public final int Q(K k4) {
        q();
        int y3 = y(k4);
        if (y3 < 0) {
            return -1;
        }
        R(y3);
        return y3;
    }

    public final boolean S(V v3) {
        q();
        int z3 = z(v3);
        if (z3 < 0) {
            return false;
        }
        R(z3);
        return true;
    }

    @l3.d
    public final f<K, V> U() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        q();
        P it = new l(0, this.f51872J - 1).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            int[] iArr = this.f51869G;
            int i4 = iArr[c4];
            if (i4 >= 0) {
                this.f51870H[i4] = 0;
                iArr[c4] = -1;
            }
        }
        kotlin.collections.builders.b.g(this.f51867E, 0, this.f51872J);
        V[] vArr = this.f51868F;
        if (vArr != null) {
            kotlin.collections.builders.b.g(vArr, 0, this.f51872J);
        }
        this.f51875M = 0;
        this.f51872J = 0;
        M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (y(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (z(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return B();
    }

    @Override // java.util.Map
    public boolean equals(@l3.e Object obj) {
        if (obj != this && (!(obj instanceof Map) || !u((Map) obj))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @l3.e
    public V get(Object obj) {
        int y3 = y(obj);
        if (y3 < 0) {
            return null;
        }
        V[] vArr = this.f51868F;
        F.m(vArr);
        return vArr[y3];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> x3 = x();
        int i4 = 0;
        while (x3.hasNext()) {
            i4 += x3.m();
        }
        return i4;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return D();
    }

    public final int n(K k4) {
        int B3;
        q();
        while (true) {
            int G3 = G(k4);
            B3 = kotlin.ranges.u.B(this.f51871I * 2, C() / 2);
            int i4 = 0;
            while (true) {
                int i5 = this.f51870H[G3];
                if (i5 <= 0) {
                    if (this.f51872J >= A()) {
                        w(1);
                    } else {
                        int i6 = this.f51872J;
                        int i7 = i6 + 1;
                        this.f51872J = i7;
                        this.f51867E[i6] = k4;
                        this.f51869G[i6] = G3;
                        this.f51870H[G3] = i7;
                        this.f51875M = size() + 1;
                        M();
                        if (i4 > this.f51871I) {
                            this.f51871I = i4;
                        }
                        return i6;
                    }
                } else {
                    if (F.g(this.f51867E[i5 - 1], k4)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > B3) {
                        N(C() * 2);
                        break;
                    }
                    int i8 = G3 - 1;
                    if (G3 == 0) {
                        G3 = C() - 1;
                    } else {
                        G3 = i8;
                    }
                }
            }
        }
    }

    @l3.d
    public final Map<K, V> p() {
        q();
        this.f51879Q = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f51866W;
        F.n(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    @Override // java.util.Map
    @l3.e
    public V put(K k4, V v3) {
        q();
        int n4 = n(k4);
        V[] o4 = o();
        if (n4 < 0) {
            int i4 = (-n4) - 1;
            V v4 = o4[i4];
            o4[i4] = v3;
            return v4;
        }
        o4[n4] = v3;
        return null;
    }

    @Override // java.util.Map
    public void putAll(@l3.d Map<? extends K, ? extends V> from) {
        F.p(from, "from");
        q();
        J(from.entrySet());
    }

    public final void q() {
        if (!this.f51879Q) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @l3.e
    public V remove(Object obj) {
        int Q3 = Q(obj);
        if (Q3 < 0) {
            return null;
        }
        V[] vArr = this.f51868F;
        F.m(vArr);
        V v3 = vArr[Q3];
        kotlin.collections.builders.b.f(vArr, Q3);
        return v3;
    }

    public final boolean s(@l3.d Collection<?> m4) {
        F.p(m4, "m");
        for (Object obj : m4) {
            if (obj != null) {
                try {
                    if (!t((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return E();
    }

    public final boolean t(@l3.d Map.Entry<? extends K, ? extends V> entry) {
        F.p(entry, "entry");
        int y3 = y(entry.getKey());
        if (y3 < 0) {
            return false;
        }
        V[] vArr = this.f51868F;
        F.m(vArr);
        return F.g(vArr[y3], entry.getValue());
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> x3 = x();
        int i4 = 0;
        while (x3.hasNext()) {
            if (i4 > 0) {
                sb.append(", ");
            }
            x3.l(sb);
            i4++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return F();
    }

    @l3.d
    public final b<K, V> x() {
        return new b<>(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i4) {
        this(kotlin.collections.builders.b.d(i4), null, new int[i4], new int[f51861R.c(i4)], 2, 0);
    }
}
